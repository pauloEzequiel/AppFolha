package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfolha.entidades.Devolucao;
import br.edu.infnet.appfolha.services.DevolucaoService;

@Controller
public class DevolucaoController {
	@Autowired
	private DevolucaoService service;
	
	
	@GetMapping(value = "/devolucao/cadastro")
	public String telaCadastro(Model model) {
		
		return "devolucao/cadastro";
	}
	
	@PostMapping(value = "/devolucao/adicionar")
	public String incluir(Devolucao devolucao ) {
		
		service.adicionar(devolucao);
		
		return "redirect:/devolucao/lista";
	}
	

	@GetMapping(value = "/devolucao/{id}/visualizar")
	public String telaVisualizar(Model model,@PathVariable Integer id) {
		model.addAttribute("beneficio", service.obterFuncionario(id));
		return "devolucao/visualizar";
	}
	@GetMapping(value = "/devolucao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "devolucao/lista";
	}
	
	@GetMapping(value = "/devolucao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		service.remover(id);
		return "redirect:/devolucao/lista";
	}
}

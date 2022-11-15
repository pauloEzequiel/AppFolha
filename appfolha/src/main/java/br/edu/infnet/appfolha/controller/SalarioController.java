package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfolha.entidades.Salario;
import br.edu.infnet.appfolha.services.SalarioService;

@Controller
public class SalarioController {
	@Autowired
	private SalarioService service;
	
	@GetMapping(value = "/salario/cadastro")
	public String telaCadastro(Model model) {
		
		return "salario/cadastro";
	}
	
	@PostMapping(value = "/salario/adicionar")
	public String incluir(Salario salario ) {
		
		service.adicionar(salario);
		
		return "redirect:/salario/lista";
	}
	

	@GetMapping(value = "/salario/{id}/visualizar")
	public String telaVisualizar(Model model,@PathVariable Integer id) {
		model.addAttribute("salario", service.obterSalario(id));
		return "salario/visualizar";
	}
	
	@GetMapping(value = "/salario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "salario/lista";
	}
	
	@GetMapping(value = "/salario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		service.remover(id);
		return "redirect:/salario/lista";
	}
}

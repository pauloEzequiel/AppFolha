package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfolha.entidades.Funcionario;
import br.edu.infnet.appfolha.services.FuncionarioService;

@Controller
public class FuncionarioController {
	@Autowired
	private FuncionarioService service;
	
	@GetMapping(value = "/funcionario/cadastro")
	public String telaCadastro(Model model) {
		
		return "funcionario/cadastro";
	}
	
	@PostMapping(value = "/funcionario/adicionar")
	public String incluir(Funcionario funcionario) {
		
		service.adicionar(funcionario);
		
		return "redirect:/funcionario/lista";
	}
	

	@GetMapping(value = "/funcionario/{id}/visualizar")
	public String telaVisualizar(Model model,@PathVariable Integer id) {
		model.addAttribute("funcionario", service.obterFuncionario(id));
		return "funcionario/visualizar";
	}
	
	@GetMapping(value = "/funcionario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "funcionario/lista";
	}
	
	@GetMapping(value = "/funcionario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		service.remover(id);
		return "redirect:/funcionario/lista";
	}
}

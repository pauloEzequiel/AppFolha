package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appfolha.entidades.Beneficio;
import br.edu.infnet.appfolha.services.BeneficioService;

@Controller
public class BeneficioController {
	@Autowired
	private BeneficioService service;
	
	
	@GetMapping(value = "/beneficio/cadastro")
	public String telaCadastro(Model model) {
		
		return "beneficio/cadastro";
	}
	
	@PostMapping(value = "/beneficio/adicionar")
	public String incluir(Beneficio beneficio ) {
		
		service.adicionar(beneficio);
		
		return "redirect:/beneficio/lista";
	}
	

	@GetMapping(value = "/beneficio/{id}/visualizar")
	public String telaVisualizar(Model model,@PathVariable Integer id) {
		model.addAttribute("beneficio", service.obterFuncionario(id));
		return "beneficio/visualizar";
	}
	
	@GetMapping(value = "/beneficio/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "beneficio/lista";
	}
	
	@GetMapping(value = "/beneficio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		service.remover(id);
		return "redirect:/beneficio/lista";
	}
}

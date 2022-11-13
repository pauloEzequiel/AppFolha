package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appfolha.services.SalarioService;

@Controller
public class SalarioController {
	@Autowired
	private SalarioService service;
	
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

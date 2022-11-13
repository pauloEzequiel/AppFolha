package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appfolha.services.FuncionarioService;

@Controller
public class FuncionarioController {
	@Autowired
	private FuncionarioService service;
	
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

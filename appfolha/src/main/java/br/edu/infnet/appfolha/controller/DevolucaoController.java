package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appfolha.services.DevolucaoService;

@Controller
public class DevolucaoController {
	@Autowired
	private DevolucaoService service;
	
	@GetMapping(value = "/devolucao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "devolucao/lista";
	}
}

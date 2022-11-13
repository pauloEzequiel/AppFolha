package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appfolha.services.PagamentoService;

@Controller
public class PagamentoController {
	@Autowired
	private PagamentoService service;
	
	@GetMapping(value = "/pagamento/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.ObterTodos());

		return "pagamento/lista";
	}
	
	@GetMapping(value = "/pagamento/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		service.remover(id);
		return "redirect:/pagamento/lista";
	}
}

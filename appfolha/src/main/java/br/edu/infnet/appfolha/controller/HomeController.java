package br.edu.infnet.appfolha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appfolha.entidades.Funcionario;
import br.edu.infnet.appfolha.services.FuncionarioService;

@Controller
public class HomeController {
	@Autowired
	private FuncionarioService service;
	
	@GetMapping(value="/")
	public String telaHome(Model model){
		Funcionario func = service.obterFuncionario(1);
		model.addAttribute("funcionario", func.getNome());
		return "home";
	}
}

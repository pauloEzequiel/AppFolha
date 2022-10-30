package br.edu.infnet.appfolha.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Funcionario;
import br.edu.infnet.appfolha.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repositorio;
	
	public Funcionario obterFuncionario(Integer id){
		Optional<Funcionario>funcionario = repositorio.findById(id);
		
		return funcionario.orElse(null);
	}
	
}

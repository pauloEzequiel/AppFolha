package br.edu.infnet.appfolha.services;

import java.util.List;
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
	
	public List<Funcionario> ObterTodos() {
		return repositorio.findAll();
	}
	
	public void adicionar(Funcionario funcionario) {
		repositorio.save(funcionario);
	}
	
	public void remover (Integer id) {
		
		repositorio.deleteById(id);
	}
	
}

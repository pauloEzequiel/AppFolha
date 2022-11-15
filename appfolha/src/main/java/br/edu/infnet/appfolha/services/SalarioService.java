package br.edu.infnet.appfolha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Salario;
import br.edu.infnet.appfolha.repositories.SalarioRepository;

@Service
public class SalarioService {
	
	@Autowired
	private SalarioRepository repositorio;
	
	public Salario obterSalario(Integer id){
		Optional<Salario>salario = repositorio.findById(id);
		
		return salario.orElse(null);
	}
	
	public void adicionar(Salario salario) {
		repositorio.save(salario);
	}
	
	public List<Salario> ObterTodos() {
		return repositorio.findAll();
	}
	
     public void remover (Integer id) {
		repositorio.deleteById(id);
	}
	
}

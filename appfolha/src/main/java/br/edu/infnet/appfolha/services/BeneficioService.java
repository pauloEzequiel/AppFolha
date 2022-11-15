package br.edu.infnet.appfolha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Beneficio;
import br.edu.infnet.appfolha.repositories.BeneficioRepository;

@Service
public class BeneficioService {
	
	@Autowired
	private BeneficioRepository repositorio;
	
	public Beneficio obterFuncionario(Integer id){
		Optional<Beneficio>salario = repositorio.findById(id);
		
		return salario.orElse(null);
	}
	
	public void adicionar(Beneficio beneficio) {
		repositorio.save(beneficio);
	}
	public List<Beneficio> ObterTodos() {
		return repositorio.findAll();
	}
	
     public void remover (Integer id) {
		repositorio.deleteById(id);
	}
	
}

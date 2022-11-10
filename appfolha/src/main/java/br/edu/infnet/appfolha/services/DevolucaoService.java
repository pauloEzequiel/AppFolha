package br.edu.infnet.appfolha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Devolucao;
import br.edu.infnet.appfolha.repositories.DevolucaoRepository;
@Service
public class DevolucaoService {
	
	@Autowired
	private DevolucaoRepository repositorio;
	
	public Devolucao obterFuncionario(Integer id){
		Optional<Devolucao>salario = repositorio.findById(id);
		
		return salario.orElse(null);
	}
	
	public List<Devolucao> ObterTodos() {
		return repositorio.findAll();
	}
	
}

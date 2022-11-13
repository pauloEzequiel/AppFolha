package br.edu.infnet.appfolha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appfolha.entidades.FolhaPagamento;
import br.edu.infnet.appfolha.repositories.FolhaPagamentoRepository;
@Service
public class FolhaPagamentoService {
	
	@Autowired
	private FolhaPagamentoRepository repositorio;
	
	public FolhaPagamento obterFuncionario(Integer id){
		Optional<FolhaPagamento>folha = repositorio.findById(id);
		
		return folha.orElse(null);
	}
	
	public List<FolhaPagamento> ObterTodos() {
		return repositorio.findAll();
	}
	
	public void remover(Integer id) {
		
		repositorio.deleteById(id);
	}
	
}

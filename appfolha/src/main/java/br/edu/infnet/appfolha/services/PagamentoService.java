package br.edu.infnet.appfolha.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.entidades.Pagamento;
import br.edu.infnet.appfolha.repositories.PagamentoRepository;

@Service
public class PagamentoService {
	
	@Autowired
	private PagamentoRepository repositorio;
	
	public Pagamento obterFuncionario(Integer id){
		Optional<Pagamento>pagamento = repositorio.findById(id);
		
		return pagamento.orElse(null);
	}
	
	public List<Pagamento> ObterTodos() {
		return repositorio.findAll();
	}
	
    public void remover (Integer id) {
		repositorio.deleteById(id);
	}
	
}

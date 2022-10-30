package br.edu.infnet.appfolha.entidades;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class Salario extends FolhaPagamento {
	private static final long serialVersionUID = 1L;
	
	public Salario() {}
	public Salario(Integer id, Integer mes, Integer ano,String descricao, Double totalValor, List<Pagamento> pagamentos) {
		super(id, mes, ano,descricao,totalValor, pagamentos);
	}
	
	
}

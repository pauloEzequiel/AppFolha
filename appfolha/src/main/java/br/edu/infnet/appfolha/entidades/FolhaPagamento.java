package br.edu.infnet.appfolha.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class FolhaPagamento implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer mes;
	private Integer ano;
	private String descricao;
	
	@Column(precision=10, scale=2)
	private Double totalValor;
	
	@OneToMany(mappedBy="folhaPagamento")
	private List<Pagamento> pagamentos = new ArrayList<>();
	
	@Column(insertable=false, updatable=false)
	private String tipo;

	
	public FolhaPagamento() {}
	
	public FolhaPagamento(Integer id, Integer mes, Integer ano, String descricao ,Double totalValor, List<Pagamento> pagamentos) {
		super();
		this.id = id;
		this.mes = mes;
		this.ano = ano;
		this.descricao  = descricao;
		this.totalValor = totalValor;
		this.pagamentos = pagamentos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public Double getTotalValor() {
		totalValor = pagamentos.stream().mapToDouble(p -> p.getValor()).sum();
		
		return totalValor;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}

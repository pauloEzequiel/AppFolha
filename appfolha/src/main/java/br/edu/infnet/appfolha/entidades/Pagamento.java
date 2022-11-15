package br.edu.infnet.appfolha.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import java.io.Serializable;
import java.util.Objects;

@Entity
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPagamento;
	private Integer mes;
	private Integer ano;
	private String descricao;
	
	@Column(precision=10, scale=2)
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name="folha_pagamento_id")
	private FolhaPagamento folhaPagamento;
	
	
	public Pagamento() {}
	
	


	public Pagamento(Integer idPagamento, Integer mes, Integer ano, Double valor,
			Funcionario funcionario, FolhaPagamento folhaPagamento) {
		super();
		this.idPagamento = idPagamento;
		this.mes = mes;
		this.ano = ano;
		this.descricao = folhaPagamento.getDescricao();
		this.valor = valor;
		this.funcionario = funcionario;
		this.folhaPagamento = folhaPagamento;
	}




	public Integer getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public FolhaPagamento getFolhaPagamento() {
		return folhaPagamento;
	}
	public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
		this.folhaPagamento = folhaPagamento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPagamento);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(idPagamento, other.idPagamento);
	}
	
	
	
}

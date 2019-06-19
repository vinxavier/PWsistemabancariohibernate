package br.com.bb.sistemabancario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacorrente")
public class ContaCorrente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="agencia")
	private String agencia;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="ativa")
	private boolean ativa;
	
	@Column(name="variacao")
	private int variacao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getVariacao() {
		return variacao;
	}
	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}
}

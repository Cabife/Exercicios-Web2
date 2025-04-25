package br.edu.ifspcjo.ads.dw2s6.assistencia.domain.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	
	private String logradouro;
	private String número;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado; 
	private String CEP;	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNúmero() {
		return número;
	}
	public void setNúmero(String número) {
		this.número = número;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
}
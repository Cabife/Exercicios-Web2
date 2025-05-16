package br.edu.ifspcjo.ads.dw2s6.assistencia.domain.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "forma_pagamento")
public class FormaPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotNull
    private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;	
		FormaPagamento other = (FormaPagamento) obj;
		return Objects.equals(id, other.id);
	}
	
}

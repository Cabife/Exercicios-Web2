package br.edu.ifspcjo.ads.dw2s6.assistencia.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "ordem_servico")
public class OrdemServico {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotNull
    private String descricao; 
	@NotNull
    private LocalDate dataEmissao;
	@NotNull
    private LocalDate dataFinalizacao;
	@NotNull
    private BigDecimal valor;
	@NotNull
    private String observacao; 
	@NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    
    
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
    
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getDataEmissao() {
		return dataEmissao;
	}


	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}


	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}


	public void setDataFinalizacao(LocalDate dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(id, other.id);
	}


	
}

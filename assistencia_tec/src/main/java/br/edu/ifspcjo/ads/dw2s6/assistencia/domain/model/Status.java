package br.edu.ifspcjo.ads.dw2s6.assistencia.domain.model;

public enum Status {

	EMAPROVACAO("EM APROVAÇÃO"),
	APROVADA("APROVADA"),
	EMANDAMENTO("EM ANDAMENTO"),
	FINALIZADA("FINALIZADA");
	
	private String description;
	
	private Status (String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	
}

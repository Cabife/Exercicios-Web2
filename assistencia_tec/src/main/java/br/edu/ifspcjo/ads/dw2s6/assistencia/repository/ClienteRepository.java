package br.edu.ifspcjo.ads.dw2s6.assistencia.repository;

import br.edu.ifspcjo.ads.dw2s6.assistencia.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
	
	

}


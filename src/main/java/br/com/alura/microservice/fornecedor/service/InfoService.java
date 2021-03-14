package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.service.repo.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepo;
	public InfoFornecedor getInfoPorEstado(String estado) {
		
		return infoRepo.findByEstado(estado);
	}

}

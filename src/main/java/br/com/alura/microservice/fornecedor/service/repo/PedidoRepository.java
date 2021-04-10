package br.com.alura.microservice.fornecedor.service.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}

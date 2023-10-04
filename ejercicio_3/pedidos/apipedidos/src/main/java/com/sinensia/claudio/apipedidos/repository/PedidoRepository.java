package com.sinensia.claudio.apipedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.sinensia.claudio.apipedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}

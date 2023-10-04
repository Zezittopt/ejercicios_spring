package com.sinensia.claudio.apipedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.sinensia.claudio.apipedidos.model.Pedido;
import main.java.com.sinensia.claudio.apipedidos.repository.PedidoRepository;
import main.java.com.sinensia.claudio.apipedidos.service.PedidoService;
import main.java.com.sinensia.claudio.apipedidos.service.PedidoServiceImpl;

@RestController
public class PedidoController {

    @Autowired
    PedidoService pedidoService;
    
    @GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> pedidos(){
        return pedidoService.pedidos();
    }

    @PostMapping(value = "pedidos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoPedido(@RequestBody Pedido pedido){
        pedidoService.nuevoPedido(pedido);
    }

    @DeleteMapping(value = "pedidos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarPedido(@PathVariable("id") int id) {
        pedidoService.eliminarPedido(id);
	}
}

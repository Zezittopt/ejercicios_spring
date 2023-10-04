package com.sinensia.claudio.apipedidos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.sinensia.claudio.apipedidos.model.Pedido;
import main.java.com.sinensia.claudio.apipedidos.service.PedidoService;
import main.java.com.sinensia.claudio.apipedidos.repository.PedidoRepository;

@Service
public class PedidoServiceImpl {
    
    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public void nuevoPedido(int id, int id_producto, int unidades) {
        Pedido pedido = new Pedido();
        double precioTotal = pedido.getTotal() * unidades;
        pedido.setId(id);
        pedido.setId_producto(id_producto);
        pedido.setUnidades(unidades);
        pedido.setTotal(precioTotal);

        // Guardar el pedido en la base de datos
        pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> pedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public void eliminarPedido(int id){
        pedidoRepository.deleteById(id);
    }
}

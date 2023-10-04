package com.sinensia.claudio.apipedidos.service;

import java.util.List;

import main.java.com.sinensia.claudio.apipedidos.model.Pedido;

public interface PedidoService {
    List<Pedido> pedidos();
    Pedido nuevoPedido(Pedido pedido);
    void eliminarPedido(int id);
}

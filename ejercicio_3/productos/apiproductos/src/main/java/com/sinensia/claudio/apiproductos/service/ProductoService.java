package com.sinensia.claudio.apiproductos.service;

import java.util.List;

import com.sinensia.claudio.apiproductos.model.Producto;

public interface ProductoService {

    // Métodos 

    List<Producto> productos();
    double ProductoPorId(int id_producto);
    int stock(int id_producto);
    void actualizarStock(int id_producto, int stock);
    void borrarProducto(int id_producto);
    
}

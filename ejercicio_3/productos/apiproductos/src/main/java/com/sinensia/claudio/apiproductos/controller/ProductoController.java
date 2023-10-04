package com.sinensia.claudio.apiproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.claudio.apiproductos.model.Producto;
import com.sinensia.claudio.apiproductos.service.ProductoService;

@RestController
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    /**
     * http://localhost:8081/productos
     * 
     * @return listaProductos
     */
    @GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> productos(){
        return productoService.productos();
    }

    /**
     * http://localhost:8081/productos/111/5
     * 
     * @param id_producto
     * @param stock
     */
    @PutMapping(value = "productos/{id_producto}/{stock}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarStock(@PathVariable("id_producto") int id_producto, 
                                @PathVariable("stock") int stock){
        productoService.actualizarStock(id_producto, stock);
    }

    /**
     * http://localhost:8081/productos/111
     * 
     * @param id_producto
     * @return precio
     */
    @GetMapping(value = "productos/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double ProductoPorId(@PathVariable int id_producto){
        return productoService.ProductoPorId(id_producto);
    }

    /**
     * http://localhost:8081/productos/stock/111
     * 
     * @param id_producto
     * @return precio
     */
    @GetMapping(value = "productos/stock/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int stock(@PathVariable int id_producto){
        return productoService.stock(id_producto);
    }

    /**
     * http://localhost:8081/productos/111
     * 
     * @param id_producto
     */
    @DeleteMapping(value = "productos/{id_producto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void borrarProducto(@PathVariable int id_producto){
        productoService.borrarProducto(id_producto);
    }
}

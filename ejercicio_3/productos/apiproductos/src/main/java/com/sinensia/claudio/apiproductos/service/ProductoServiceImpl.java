package com.sinensia.claudio.apiproductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.claudio.apiproductos.repository.ProductoRepository;
import com.sinensia.claudio.apiproductos.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    
    /** 
     * MOSTRAR TODOS LOS PRODUCTOS
     * @return List<Producto>
     */
    @Override
    public List<Producto> productos() {
        return productoRepository.findAll();
    }

    
    /** 
     * ACTUALIZAR EL STOCK DE PRODUCTOS
     * @param id_producto
     * @param stock
     */
    @Override
    public void actualizarStock(int id_producto, int stock) {
        Producto producto = productoRepository.findById(id_producto).orElse(null);
        producto.setStock(producto.getStock() - stock);
        productoRepository.save(producto);
    }


    
    /** 
     * MOSTRAR PRECIO DE PRODUCTOS
     * @param id_producto
     * @return double
     */
    @Override
    public double ProductoPorId(int id_producto) {
        Producto producto = productoRepository.findById(id_producto).orElse(null);
        return producto.getPrecio();
    }

    
    /** 
     * MOSTRAR EL STOCK DISPONIBLE
     * @param id_producto
     * @return int
     */
    @Override
    public int stock(int id_producto){
        Producto producto = productoRepository.findById(id_producto).orElse(null);
        return producto.getStock();
 
    }

    /** 
     * BORRAR PRODUCTO
     * @param id_producto
     */
    @Override
    public void borrarProducto(int id_producto){
        productoRepository.deleteById(id_producto);
    }
}

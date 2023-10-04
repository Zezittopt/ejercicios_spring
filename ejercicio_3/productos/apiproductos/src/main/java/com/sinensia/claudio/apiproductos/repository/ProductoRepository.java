package com.sinensia.claudio.apiproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.claudio.apiproductos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}

package com.sinensia.claudio.apipedidos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="pedidos")
public class Pedido {
    
    @Id 
    private int id;
    private int id_producto;
    private int unidades;
    private double total;
    private Date fecha;

    public Pedido(int id, int id_producto, int unidades, double total, Date fecha) {
        super();
        this.id = id;
        this.id_producto = id_producto;
        this.unidades = unidades;
        this.total = total;
        this.fecha = fecha;
    }
    
    public Pedido() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + id_producto;
        result = prime * result + unidades;
        long temp;
        temp = Double.doubleToLongBits(total);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (id != other.id)
            return false;
        if (id_producto != other.id_producto)
            return false;
        if (unidades != other.unidades)
            return false;
        if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return 
        "Pedido [id=" + id + 
        ", id_producto=" + id_producto + 
        ", unidades=" + unidades + 
        ", total=" + total + 
        ", fecha=" + fecha + 
        "]";
    }
}

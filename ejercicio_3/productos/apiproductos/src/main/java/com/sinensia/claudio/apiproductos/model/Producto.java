package com.sinensia.claudio.apiproductos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
    public class Producto {
        @Id
        private int id_producto;
        private String nombre;
        private double precio;
        private int stock;

        public Producto() {
            super();
        }

        public Producto(int id_producto, String nombre, double precio, int stock) {
            super();
            this.id_producto = id_producto;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public int getid_producto() {
            return id_producto;
        }

        public void setid_producto(int id_producto) {
            this.id_producto = id_producto;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id_producto;
            result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
            long temp;
            temp = Double.doubleToLongBits(precio);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            result = prime * result + stock;
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
            Producto other = (Producto) obj;
            if (id_producto != other.id_producto)
                return false;
            if (nombre == null) {
                if (other.nombre != null)
                    return false;
            } else if (!nombre.equals(other.nombre))
                return false;
            if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
                return false;
            if (stock != other.stock)
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Producto [codigo=" + id_producto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
                    + "]";
        }

        
    }

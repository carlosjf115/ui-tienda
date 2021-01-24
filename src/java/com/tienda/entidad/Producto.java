
package com.tienda.entidad;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cjflores
 */
public class Producto implements Serializable {
    private String idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioProducto;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, String descripcionProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idProducto);
        hash = 37 * hash + Objects.hashCode(this.nombreProducto);
        hash = 37 * hash + Objects.hashCode(this.descripcionProducto);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.precioProducto) ^ (Double.doubleToLongBits(this.precioProducto) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precioProducto) != Double.doubleToLongBits(other.precioProducto)) {
            return false;
        }
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        if (!Objects.equals(this.descripcionProducto, other.descripcionProducto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto + ", precioProducto=" + precioProducto + '}';
    }
    
}

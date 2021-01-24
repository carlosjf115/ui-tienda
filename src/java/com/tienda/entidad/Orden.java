
package com.tienda.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author cjflores
 */
public class Orden implements Serializable{
    private Long idOrden;
    private Long idCliente;
    private String idProducto;
    private Long cantidadOrden;
    private Date fechaOrden;

    public Orden() {
    }

    public Orden(Long idOrden, Long idCliente, String idProducto, Long cantidadOrden, Date fechaOrden) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.cantidadOrden = cantidadOrden;
        this.fechaOrden = fechaOrden;
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public Long getCantidadOrden() {
        return cantidadOrden;
    }

    public void setCantidadOrden(Long cantidadOrden) {
        this.cantidadOrden = cantidadOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idOrden);
        hash = 59 * hash + Objects.hashCode(this.idCliente);
        hash = 59 * hash + Objects.hashCode(this.idProducto);
        hash = 59 * hash + Objects.hashCode(this.cantidadOrden);
        hash = 59 * hash + Objects.hashCode(this.fechaOrden);
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
        final Orden other = (Orden) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        if (!Objects.equals(this.idOrden, other.idOrden)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        if (!Objects.equals(this.cantidadOrden, other.cantidadOrden)) {
            return false;
        }
        if (!Objects.equals(this.fechaOrden, other.fechaOrden)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", idCliente=" + idCliente + ", idProducto=" + idProducto + ", cantidadOrden=" + cantidadOrden + ", fechaOrden=" + fechaOrden + '}';
    }
    
}

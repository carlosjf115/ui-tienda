
package com.tienda.entidad;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cjflores
 */
public class Cliente implements Serializable {
    private Long idCliente;
    private String nombresCliente;
    private String apellidosCliente;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nombresCliente, String apellidosCliente) {
        this.idCliente = idCliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.idCliente);
        hash = 13 * hash + Objects.hashCode(this.nombresCliente);
        hash = 13 * hash + Objects.hashCode(this.apellidosCliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombresCliente, other.nombresCliente)) {
            return false;
        }
        if (!Objects.equals(this.apellidosCliente, other.apellidosCliente)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombresCliente=" + nombresCliente + ", apellidosCliente=" + apellidosCliente + '}';
    }
    
}

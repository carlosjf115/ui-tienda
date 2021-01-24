/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.controller;

import com.tienda.entidad.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.tienda.model.ClienteFacadeJDBC;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author cjflores
 */

@ManagedBean(name = "clienteController")
@ViewScoped
public class ClienteController implements Serializable {
    
    private List<Cliente> listaClientes;
    private Cliente clienteSeleccionado;
    private String nombresCliente;
    private String apellidosCliente;
    
    
    private final String url_obtener_clientes = "http://localhost:7001/ws-tienda/webresources/ClienteService/obtenerClientes";
    private final String url_crear_clientes = "http://localhost:7001/ws-tienda/webresources/ClienteService/crearCliente";
    private final String url_eliminar_clientes = "http://localhost:7001/ws-tienda/webresources/ClienteService/eliminarCliente";
    private final String url_actualizar_clientes = "http://localhost:7001/ws-tienda/webresources/ClienteService/actualizarCliente";
    
    @EJB
    ClienteFacadeJDBC clienteFacadeJDBC;

    public ClienteController() {
        listaClientes = new ArrayList<>();
        

    }
    
    public void seleccionarCliente(Cliente cliente){
        clienteSeleccionado = cliente;
    }
    
    
    public void guardar(){
        Cliente cliente = new Cliente();
        cliente.setNombresCliente(nombresCliente);
        cliente.setApellidosCliente(apellidosCliente);
        
        clienteFacadeJDBC.create(cliente, url_crear_clientes);
    }
    
    public void eliminar(Cliente cliente) {
        clienteFacadeJDBC.create(cliente, url_eliminar_clientes);
    }
    
    public void actualizar() {
        clienteFacadeJDBC.update(clienteSeleccionado, url_actualizar_clientes);
    }

    /*public List<Cliente> getListaClientes() {
        return listaClientes;
    }*/

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public List<Cliente> getListaClientes() {
        //return listaClientes = clienteFacadeJDBC.obtenerClientes(url_obtener_clientes);
        return listaClientes = clienteFacadeJDBC.obtenerClientes(url_obtener_clientes);
    }


    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
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
    
    

}

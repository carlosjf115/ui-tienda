
package com.tienda.model;

import com.tienda.entidad.Cliente;
import com.tienda.utils.ConsumirRestful;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author cjflores
 */
@Stateless
public class ClienteFacadeJDBC {
    
    public List<Cliente> obtenerClientes(String url){
        Cliente cliente;
        List<Cliente> listaClientes = new ArrayList<>();
        JSONObject jsonParameter = new JSONObject();
        jsonParameter.put("idCliente", "");
        jsonParameter.put("nombresCliente", "");
        jsonParameter.put("apellidosCliente", "");
        String json = ConsumirRestful.create(jsonParameter.toString(), url);
        
        JSONArray jsonarray = new JSONArray(json);
        
        for(int i = 0; i< jsonarray.length() ; i++){
            cliente = new Cliente();
            JSONArray datos = jsonarray.getJSONArray(i);
            JSONObject jsonObject = datos.getJSONObject(0);
            cliente.setIdCliente(Long.parseLong((String) jsonObject.get("valor")));
            
            
            jsonObject = datos.getJSONObject(1);
            cliente.setNombresCliente((String) jsonObject.get("valor"));
            
            
            jsonObject = datos.getJSONObject(2);
            cliente.setApellidosCliente((String) jsonObject.get("valor"));
            
            
            listaClientes.add(cliente);
            
            
        }

        return listaClientes;
        
    }
    
    public void create(Object obj, String url){
        Cliente cliente = (Cliente) obj;
        JSONObject jsonParameter = new JSONObject();
        jsonParameter.put("idCliente", cliente.getIdCliente());
        jsonParameter.put("nombresCliente", cliente.getNombresCliente());
        jsonParameter.put("apellidosCliente", cliente.getApellidosCliente());
        
        ConsumirRestful.create(jsonParameter.toString(), url);
        
    }
    
    public void delete(Object obj, String url) {
        Cliente cliente = (Cliente) obj;
        JSONObject jsonParameter = new JSONObject();
        jsonParameter.put("idCliente", cliente.getIdCliente());
        jsonParameter.put("nombresCliente", cliente.getNombresCliente());
        jsonParameter.put("apellidosCliente", cliente.getApellidosCliente());

        ConsumirRestful.create(jsonParameter.toString(), url);

    }

    public void update(Object obj, String url) {
        Cliente cliente = (Cliente) obj;
        JSONObject jsonParameter = new JSONObject();
        jsonParameter.put("idCliente", cliente.getIdCliente());
        jsonParameter.put("nombresCliente", cliente.getNombresCliente());
        jsonParameter.put("apellidosCliente", cliente.getApellidosCliente());

        ConsumirRestful.create(jsonParameter.toString(), url);

    }
    
}

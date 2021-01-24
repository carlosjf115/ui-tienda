
package com.tienda.utils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;

/**
 *
 * @author cjflores
 */
public class ConsumirRestful {
    
     public static String create(String param, String url) throws JSONException {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).put(ClientResponse.class, param);
        String jsonStr = response.getEntity(String.class);
        //System.out.println("" + jsonStr);
        return jsonStr;
    }
    
}

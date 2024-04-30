package mx.uv.practica05;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;

@Endpoint
public class SaludosEndPoint {
    List<String> saludos = new ArrayList();

    @PayloadRoot(localPart = "SaludarRequest",namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse saludar(@RequestPayload SaludarRequest peticion){
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setRespuesta("hola" + peticion.getNombre());
        /*simular la persistencia  */
        saludos e = new Saludos();
        e.setNombre(peticion.getNombre();)
        saluods.add(e);
        return respuesta;
    }
    @PayloadRoot(localPart = "BuscarSaludoRequest", namespace = "t4is.uv.mx/saludos")
    @RequestPayload
    public  BuscarSaludosResponse buscarSaludos(){
        BuscarSaludosResponse respuesta = new  BuscarSaludosResponse();
       // respuesta.getSaludos().add();
        for (int 1 = 0; 1< saludos.size(); i++){
            System.out.println(saludos.get(i));
            respuesta.getSaludos().add(saludos.get(i));
           
        }
        respuesta .getSaludos().addAll(saludos);
        return respuesta; 

    }
}
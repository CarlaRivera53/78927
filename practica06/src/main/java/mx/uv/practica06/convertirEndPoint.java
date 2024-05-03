package mx.uv.practica06;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.conversion.ConvertirCelsiusToFahrenheitRequest;
import mx.uv.t4is.conversion.ConvertirCelsiusToFahrenheitResponse;

@Endpoint
public class ConversionEndPoint {

    @PayloadRoot(localPart = "ConvertirCelsiusToFahrenheitRequest", namespace = "https://t4is.uv.mx/conversion")
    @ResponsePayload
    public ConvertirCelsiusToFahrenheitResponse convertirCelsiusToFahrenheit(@RequestPayload ConvertirCelsiusToFahrenheitRequest request) {
        ConvertirCelsiusToFahrenheitResponse response = new ConvertirCelsiusToFahrenheitResponse();
        double celsius = request.getCelsius();
        double fahrenheit = (celsius * 9 / 5) + 32;
        response.setFahrenheit(fahrenheit);
        return response;
    }
}

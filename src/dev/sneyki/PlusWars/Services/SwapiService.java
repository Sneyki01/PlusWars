package dev.sneyki.PlusWars.Services;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SwapiService {

    ////Logica para armar la URL en base a las elecciones del usuario
    public static String construirURL (String categoria, int IDusuario){
        return "https://swapi.info/api/" + categoria + "/" + IDusuario;

    }

    //Logica para consultar API en base a la URL generada anteriormente
    public static String consultarAPI(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

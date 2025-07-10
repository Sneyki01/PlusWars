package dev.sneyki.PlusWars.Utils;

import com.google.gson.Gson;
import dev.sneyki.PlusWars.Models.Films;

public class JsonParserUtil {
    //Transforma informacion recibida de JSON en un OBJETO Film
    public static Films parseFilm (String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Films.class);
    }
}

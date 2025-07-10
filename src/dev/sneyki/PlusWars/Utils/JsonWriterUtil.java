package dev.sneyki.PlusWars.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.sneyki.PlusWars.Models.Films;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class JsonWriterUtil {
    // se guarda la informacion que esta en Array Films y se convierte a JSON
    public static void guardarHistorial(List<Films> historial) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("Historial_busqueda.json")) {
            gson.toJson(historial, writer);
            System.out.println("Historial guardado correctamente en Historial_busqueda.json");
        } catch (IOException e) {
            System.out.println("Error al guardar historial!");
            e.printStackTrace();
        }
    }
}

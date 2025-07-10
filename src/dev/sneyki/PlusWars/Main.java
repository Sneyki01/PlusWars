package dev.sneyki.PlusWars;
import dev.sneyki.PlusWars.Models.Films;
import dev.sneyki.PlusWars.Services.SwapiService;
import dev.sneyki.PlusWars.Utils.JsonParserUtil;
import dev.sneyki.PlusWars.Utils.JsonWriterUtil;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bienvenida();
        //Array para guardar la informacion de Films
        List<Films> historialDePeliculas = new ArrayList<>();

        //Bucle de busqueda
        while(true) {
            int opcionBusqueda = inicioBusqueda();
            //Se guarda la categoria 1 como String para la API
            String categoria = "";
            switch (opcionBusqueda) {
                case 1:
                    categoria = "films";
                    break;
                default:
                    System.out.println("Error desconocido");
            }
            //pedir ID
            int idSeleccionada = pedirID(opcionBusqueda);
            //Se construye la ID para hacer la consulta API con la categoria 2
            String urlFinal = SwapiService.construirURL(categoria, idSeleccionada);
            String respuestaJson = SwapiService.consultarAPI(urlFinal);
            Films jsonResponse = JsonParserUtil.parseFilm(respuestaJson);
            //Se realiza la consulta a la API y se regresa el resultado conviritiendo JSON a Objeto Films
            mostrarInfo(jsonResponse);
            //Se agrega la informacion guardada en Array historialDePeliculas
            historialDePeliculas.add(jsonResponse);
            Scanner scanner = new Scanner(System.in);
            System.out.println("te gustaria hacer otra busqueda?");
            System.out.println("Si / No");
            String respuestaBucle = scanner.nextLine().trim().toLowerCase();
            //Break si Usuario no quiere realizar otra busqueda
            if (!respuestaBucle.equals("si")) {
                break;
            }
        }
        JsonWriterUtil.guardarHistorial(historialDePeliculas);
        despedida();
    }

    //Bienvenida del programa
    private static void bienvenida(){
        System.out.println("Hola! Bienvenido a PlusWars ");
        System.out.println("Aqui encontraras toda la informacion sobre Star Wars");
    }

    //Guarda la decision del usuario para formar URL
    private static int inicioBusqueda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que informacion deseas buscar hoy?");
        System.out.println("1) Peliculas");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has elegido la opcion Peliculas! Entrando a la base de datos...");
                return 1;
            default:
                System.out.println("Opcion no valida, intenta de nuevo");
                return inicioBusqueda();
        }
    }

    //SubMenu para formar ID y URL final en decision al usuario
    private static int pedirID(int opcionBusqueda) {
        Scanner scanner = new Scanner(System.in);
        switch (opcionBusqueda) {
            case 1:
                System.out.println("Que pelicula deseas buscar?");
                System.out.println("1) A new hope");
                System.out.println("2) The empire Strikes Back");
                System.out.println("3) Return of The Jedi");
                System.out.println("4) The phantom menace");
                System.out.println("5) Attack of the clones");
                System.out.println("6) Revenge of the Sith");
                int opcionID = scanner.nextInt();
                return opcionID;
            default:
                System.out.println("Error categoria no valida");
                return pedirID(opcionBusqueda);
        }
    }

    //texto de confirmacion y JSON transoformado
    private static void mostrarInfo (Films film){
        System.out.println("Gran eleccion! Aqui tienes la informacion principal");
        System.out.println(film);
    }

    private static void despedida(){
        System.out.println("Muchas gracias por haber usado PLUSWARS");
        System.out.println("Que la fuerza te acompañe!");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Dada una URL con parámetros, crea una función que obtenga sus valores.
 * No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
 *
 * Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
 * los parámetros serían ["2023", "0"]
 */
public class Ejercicio59 {

    public static void main(String[] args) {
        System.out.println(parametros("https://retosdeprogramacion.com?year=2023&challenge=0"));
        System.out.println(parametros("https://www.flightbooker.com/search?origin=NYC&destination=LAX&departure_date=2022-06-15&return_date=2022-06-20"));
        System.out.println(parametros("https://www.socialapp.com/posts?tag=java&tag=programming&sort_by=latest"));
        System.out.println(parametros("https://www.example.com/posts?user_id=123456"));
    }

    private static String parametros(String url) {
        StringBuilder parametros = new StringBuilder();
        boolean parametro = false;
        for (int i = 0; i < url.length(); i++) {
            
            if (url.charAt(i) == '=') {
                parametro = true;
            } else if (url.charAt(i) == '&') {
                parametros.append(", ");
                parametro = false;
            } else {
                parametro = parametro;
            }

            parametros.append(((parametro) ? url.charAt(i) : ""));

        }
        return "Los parametros de la url son: [" + parametros.toString().replace("=", "") + "]";
    }
    
}

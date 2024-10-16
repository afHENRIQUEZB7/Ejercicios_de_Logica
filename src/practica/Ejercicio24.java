/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        String array[] = {"run", "jump", "jump", "run", "run"};

        String pista = "_||__";

        boolean validador = carrera(array, pista);
        
        if (validador) {
            System.out.println("El corredor paso la pista excelente");
        }else{
            System.out.println("el corredor no paso la pista excelente");
        }

    }

    private static Boolean carrera(String array[], String pista) {

        String prueba = "";

        for (int i = 0; i < array.length; i++) {

            switch (array[i]) {
                case "run":
                    prueba += (String.valueOf(pista.charAt(i)).equals("_")) ? "_" : "/";
                    break;
                case "jump":
                    prueba += (String.valueOf(pista.charAt(i)).equals("|")) ? "|" : "x";
                    break;
                default:
                    prueba = " ";
                    break;
            }

        }

        System.out.println("pista al finalizar del corredor: " + prueba);

        if (prueba.equals(pista)) {

            return true;

        } else {
            return false;
        }

    }
}

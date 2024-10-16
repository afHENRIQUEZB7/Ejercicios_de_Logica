/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que reciba un texto y muestre cada palabra en una línea,
 * formando un marco rectangular de asteriscos.
 * - ¿Qué te parece el reto? Se vería así:
 *   **********
 *   * ¿Qué   *
 *   * te     *
 *   * parece *
 *   * el     *
 *   * reto?  *
 *   **********
 */
public class Ejercicio36 {

//    public static void main(String[] args) {
//        String texto = "¿Que te parece el reto?";
//
//        imprimirTexto(texto);
//    }
//
//    private static void imprimirTexto(String texto) {
//
//        String palabra[] = texto.split(" ");
//
//        for (int i = 0; i < palabra.length; i++) {
//            System.out.print("*");
//            for (int j = 0; j < palabra.length - 1; j++) {
//                if (i == 0) {
//                    System.out.print("*");
//                }else if (i == palabra.length - 1) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//
//            System.out.println("*");
//        }
//    }
    
    // resuelto por chatgpt
    public static void main(String[] args) {
//        String texto = "¿Qué te parece el reto?";
        String texto = "JESUCRISTO ES EL SEÑOR, DIOS ES TODO PODEROSO";
        mostrarMarcoDeTexto(texto);
    }

    public static void mostrarMarcoDeTexto(String texto) {
        String[] palabras = texto.split(" ");
        int longitudMaxima = 0;

        // Encontrar la longitud de la palabra más larga
        for (String palabra : palabras) {
            if (palabra.length() > longitudMaxima) {
                longitudMaxima = palabra.length();
            }
        }

        // Imprimir la línea superior del marco
        imprimirLineaDeAsteriscos(longitudMaxima);

        // Imprimir cada palabra dentro del marco
        for (String palabra : palabras) {
            System.out.print("* " + palabra);
            for (int i = palabra.length(); i < longitudMaxima; i++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

        // Imprimir la línea inferior del marco
        imprimirLineaDeAsteriscos(longitudMaxima);
    }

    private static void imprimirLineaDeAsteriscos(int longitudMaxima) {
        System.out.print("**");
        for (int i = 0; i < longitudMaxima; i++) {
            System.out.print("*");
        }
        System.out.println("**");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String palabra = "Hola Mundo", salida= "";
        
        for (int i = 0; i < palabra.length(); i++) {
            salida = salida + palabra.charAt(palabra.length()-1-i);
        }
        
        // Utilizando funcionalidades del lenguaje
//        System.out.println("String Builder: " + new StringBuilder(palabra).reverse().toString());
        
        System.out.println(salida);
    }
}

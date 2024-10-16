/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
  * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String palabra = "Ana lleva al oso la avellana";
        
        if (comprobar(palabra)) {
            System.out.println("la palabara : " + palabra + "\033[1;33m" + " ES UN PALINDROME" + "\033[0m");
        }else{
            System.out.println("la palabara : " + palabra + "\033[1;33m" + " NO ES UN PALINDROME" + "\033[0m");
        }

        
        
    }
    
    public static boolean comprobar(String palabra){
        String prueba = new StringBuilder(palabra).reverse().toString();
        System.out.println(prueba.toLowerCase().replaceAll("[\\p{Punct}\\s]", ""));
        return prueba.toLowerCase().replaceAll("[\\p{Punct}\\s]", "").equals(palabra.toLowerCase().replaceAll("[\\p{Punct}\\s]", ""));
    }
}

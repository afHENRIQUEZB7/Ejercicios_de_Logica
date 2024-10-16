/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*

Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. 
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo A = 14 la salida será
14 es par
Si fuese por ejemplo A = 15 la salida será:
15 es impar

*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int A = 17;
        
        String salida = (A%2 == 0) ? "Es par" : "es impar";
        
        System.out.println(A + " " + salida);
    }
}

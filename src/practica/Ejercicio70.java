/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que reciba una expresión matemática (String)
 * y compruebe si es correcta. Retornará true o false.
 * - Para que una expresión matemática sea correcta debe poseer
 *   un número, una operación y otro número separados por espacios.
 *   Tantos números y operaciones como queramos.
 * - Números positivos, negativos, enteros o decimales.
 * - Operaciones soportadas: + - * / %
 *
 * Ejemplos:
 * "5 + 6 / 7 - 4" -> true
 * "5 a 6" -> false
 */

public class Ejercicio70 {
    public static void main(String[] args) {
        System.out.println(expresion("5 + 6 / 7 - 4"));
        System.out.println(expresion("5 a 6"));
        System.out.println(expresion("5.78 / 6"));
    }

    private static String expresion(String expresion) {
        String regex = "^[0-9+\\-*/%. ]+$";
     
        return "la expresion: " + "\033[0;36m" + expresion + "\033[0m" + (expresion.matches(regex) ? " es Valida." : " no es Valida");
    }
}

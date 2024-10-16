/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Crea una función que calcule el valor del parámetro perdido
 * correspondiente a la ley de Ohm.
 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
 *   el valor del tercero (redondeado a 2 decimales).
 * - Si los parámetros son incorrectos o insuficientes, la función retornará
 *   la cadena de texto "Invalid values".
 */

public class Ejercicio44 {
    public static void main(String[] args) {
//        System.out.println(ohm());
        System.out.println(ohm(5.0, null, null));
        System.out.println(ohm(5.0, 4.0, null));
        System.out.println(ohm(5.0, null, 4.0));
        System.out.println(ohm(null, 5.0, 4.0));
        System.out.println(ohm(5.125, 4.0, null));
        System.out.println(ohm(5.0, null, 4.125));
        System.out.println(ohm(null, 5.0, 4.125));
        System.out.println(ohm(5.0, 0.0, null));
        System.out.println(ohm(5.0, null, 0.0));
        System.out.println(ohm(null, 5.0, 0.0));
        System.out.println(ohm(5.0, 4.0, 3.0));
    }

    private static String ohm(Double v, Double r, Double i) {
        DecimalFormat formatter = new DecimalFormat("#.##");

        if (v != null && r != null && i == null) {
            return "I = " + formatter.format(v / r);
        } else if (v != null && i != null && r == null) {
            return "R = " + formatter.format(v / i);
        } else if (r != null && i != null && v == null) {
            return "V = " + formatter.format(r * i);
        }

        return "Invalid values";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        String p1 = "conooooo", p2 = "creio";
        recibir(p1, p2);

    }

    public static void recibir(String str1, String str2) {

        String out1 = "", out2 = "";


        // para str2
        boolean y = true;

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    y = false;
                }
            }

            if (y) {
                out1 = String.valueOf(str1.charAt(i));
                map.put(out1, out1);
            }

            y = true;

        }

        // para str2
        boolean t = true;

        Map<String, String> map2 = new HashMap<>();

        for (int i = 0; i < str2.length(); i++) {
            
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    t = false;
                }
            }

            if (t) {
                out2 = String.valueOf(str2.charAt(i));
                map2.put(out2, out2);
            }

            t = true;
        }

        // Salida para out1
        System.out.print("Salida str1: ");
        for (String l : map.values()) {
            System.out.print(l);
        }

        System.out.println();

        // Salida para out2
        System.out.print("Salida str2: ");
        for (String l : map2.values()) {
            System.out.print(l);
        }

        System.out.println();

    }
}

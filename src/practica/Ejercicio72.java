/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * Los primeros dispositivos móviles tenían un teclado llamado T9
 * con el que se podía escribir texto utilizando únicamente su
 * teclado numérico (del 0 al 9).
 *
 * Crea una función que transforme las pulsaciones del T9 a su
 * representación con letras.
 * - Debes buscar cuál era su correspondencia original
 * - Cada bloque de pulsaciones va separado por un guión.
 * - Si un bloque tiene más de un número, debe ser siempre el mismo.
 * - Ejemplo:
 *     Entrada: 6-666-88-777-33-3-33-888
 *     Salida: MOUREDEV
 */

/*
EJEMPLO DE TECLADO "T9"

    1 ,.?!¡¿  2 ABC   3 DEF
    4 GHI     5 JKL   6 MNO
    7 PQRS    8 TUV   9 WXYZ
    *         0       #


*/
public class Ejercicio72 {
    public static void main(String[] args) {
        System.out.println(tecladoT9("2-66-3-777-33-7777-0-333-33-555-7-33-0-44-33-66-777-444-77-33-9999-0-22-2-999-666-66-2"));
        System.out.println(tecladoT9("6-666-88-777-33-3-33-888"));
    }

    private static String tecladoT9(String string) {
        String array [] = string.split("-");
        StringBuilder texto = new StringBuilder();
        for (String string1 : array) {
            texto.append(caracter(string1));
        }
        return texto.toString();
    }

    private static String caracter(String string1) {
        Map<String,String> caracter = new HashMap<>();
        caracter.put("1", ",");
        caracter.put("11", ".");
        caracter.put("111", "?");
        caracter.put("1111", "!");
        caracter.put("1111", "¡");
        caracter.put("11111", "¿");
        caracter.put("2", "A");
        caracter.put("22", "B");
        caracter.put("222", "C");
        caracter.put("3", "D");
        caracter.put("33", "E");
        caracter.put("333", "F");
        caracter.put("4", "G");
        caracter.put("44", "H");
        caracter.put("444", "I");
        caracter.put("5", "J");
        caracter.put("55", "K");
        caracter.put("555", "L");
        caracter.put("6", "M");
        caracter.put("66", "N");
        caracter.put("666", "O");
        caracter.put("7", "P");
        caracter.put("77", "Q");
        caracter.put("777", "R");
        caracter.put("7777", "S");
        caracter.put("8", "T");
        caracter.put("88", "U");
        caracter.put("888", "V");
        caracter.put("9", "W");
        caracter.put("99", "X");
        caracter.put("999", "Y");
        caracter.put("9999", "Z");
        caracter.put("0", " ");
        
        String value = "";
        
        for (Map.Entry<String, String> entry : caracter.entrySet()) {
            if (string1.equalsIgnoreCase(entry.getKey())) {
                value = entry.getValue();
            }
        }
        return value;
    }
}

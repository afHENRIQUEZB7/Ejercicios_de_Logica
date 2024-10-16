/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        String naturalText = "Chocapic. Es una marca de cereales?";
        String morseText = decoder(naturalText);
        System.out.println(morseText);
        System.out.println(decoder(morseText));
    }

    private static String decoder(String input) {
        String decodedInput = "";

        Map<String, String> naturalDict = new HashMap<>();
        naturalDict.put("A", ".—");
        naturalDict.put("N", "—.");
        naturalDict.put("0", "—————");
        naturalDict.put("B", "—...");
        naturalDict.put("Ñ", "——.——");
        naturalDict.put("1", ".————");
        naturalDict.put("C", "—.—.");
        naturalDict.put("O", "———");
        naturalDict.put("2", "..———");
        naturalDict.put("CH", "————");
        naturalDict.put("P", ".——.");
        naturalDict.put("3", "...——");
        naturalDict.put("D", "—..");
        naturalDict.put("Q", "——.—");
        naturalDict.put("4", "....—");
        naturalDict.put("E", ".");
        naturalDict.put("R", ".—.");
        naturalDict.put("5", ".....");
        naturalDict.put("F", "..—.");
        naturalDict.put("S", "...");
        naturalDict.put("6", "—....");
        naturalDict.put("G", "——.");
        naturalDict.put("T", "—");
        naturalDict.put("7", "——...");
        naturalDict.put("H", "....");
        naturalDict.put("U", "..—");
        naturalDict.put("8", "———..");
        naturalDict.put("I", "..");
        naturalDict.put("V", "...—");
        naturalDict.put("9", "————.");
        naturalDict.put("J", ".———");
        naturalDict.put("W", ".——");
        naturalDict.put(".", ".—.—.—");
        naturalDict.put("K", "—.—");
        naturalDict.put("X", "—..—");
        naturalDict.put(",", "——..——");
        naturalDict.put("L", ".—..");
        naturalDict.put("Y", "—.——");
        naturalDict.put("?", "..——..");
        naturalDict.put("M", "——");
        naturalDict.put("Z", "——..");
        naturalDict.put("\"", ".—..—.");
        naturalDict.put("/", "—..—");

        Map<String, String> morseDict = new HashMap<>();
        for (Map.Entry<String, String> entry : naturalDict.entrySet()) {
            morseDict.put(entry.getValue(), entry.getKey());
        }

        if (input.matches(".*[a-zA-Z0-9].*")) {
            // Natural
            int index = 0;
            boolean ch = false;

            String upperInput = input.toUpperCase();
            for (char character : upperInput.toCharArray()) {
                if (!ch && character != ' ') {
                    int nextIndex = index + 1;
                    if (character == 'C' && nextIndex < input.length() && upperInput.charAt(nextIndex) == 'H') {
                        decodedInput += naturalDict.get("CH");
                        ch = true;
                    } else {
                        decodedInput += naturalDict.get(String.valueOf(character));
                    }
                    decodedInput += " ";
                } else {
                    if (!ch) {
                        decodedInput += " ";
                    }
                    ch = false;
                }
                index++;
            }

        } else if (input.contains(".") || input.contains("—")) {
            // Morse
            String[] words = input.split("  ");
            for (String word : words) {
                String[] symbolsArray = word.split(" ");
                for (String symbols : symbolsArray) {
                    if (!symbols.isEmpty()) {
                        decodedInput += morseDict.get(symbols);
                    }
                }
                decodedInput += " ";
            }
        }

        return decodedInput;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
public class Ejercicio15 {
//    public static void main(String[] args) {
//        String palabras [] = {"Jesucristo es la solucion","Jesucristo es la solucion", "todas","Jesucristo es la solucion", "Jesucristo es la solucion"};
//        int contPa =  0;
//        String igual;
//        
//        for (int i = 0; i < palabras.length; i++) {
//            igual = palabras[i];
//            
//        }
//        
//        
//    }

    public static void main(String[] args) {
        countWords("Hola, mi nombre es Brais. Mi nombre completo es Brais Moure (MoureDev).");
    }

    public static void countWords(String text) {
        Map<String, Integer> words = new HashMap<>();

        String[] splitText = text.toLowerCase().replaceAll("[^a-z0-9]", " ").split(" ");
        for (String key : splitText) {
            if (key.isEmpty()) {
                continue;
            }
            words.put(key, words.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + " se ha repetido " + word.getValue() + " " + (word.getValue() == 1 ? "vez" : "veces"));
        }
    }
}

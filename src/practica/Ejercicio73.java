/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que sea capaz de leer el número representado por el ábaco.
 * - El ábaco se representa por un array con 7 elementos.
 * - Cada elemento tendrá 9 "O" (aunque habitualmente tiene 10 para realizar
 *   operaciones) para las cuentas y una secuencia de "---" para el alambre.
 * - El primer elemento del array representa los millones, y el último las unidades.
 * - El número en cada elemento se representa por las cuentas que están a
 *   la izquierda del alambre.
 *
 * Ejemplo de array y resultado:
 * ["O---OOOOOOOO",
 *  "OOO---OOOOOO",
 *  "---OOOOOOOOO",
 *  "OO---OOOOOOO",
 *  "OOOOOOO---OO",
 *  "OOOOOOOOO---",
 *  "---OOOOOOOOO"]
 *
 *  Resultado: 1.302.790
 */
public class Ejercicio73 {

    public static void main(String[] args) {
        String array[] = {"O---OOOOOOOO",
            "OOO---OOOOOO",
            "---OOOOOOOOO",
            "OO---OOOOOOO",
            "OOOOOOO---OO",
            "OOOOOOOOO---",
            "---OOOOOOOOO"};

        System.out.println("Resultado: " + abaco(array));
    }

    private static String abaco(String[] array) {
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            char[] caracter = array[i].toCharArray();
            int cont = 0;
            for (char c : caracter) {
                if (c == 'O') {
                    cont++;
                } else {
                    break;
                }
            }

            numero.append(cont);
        }
        return formatNumber(numero.toString());
    }

    // metodo realizado por CHATGPT
    private static String formatNumber(String number) {
        int length = number.length();
        StringBuilder formatted = new StringBuilder();

        for (int i = 0; i < length; i++) {
            formatted.append(number.charAt(i));
            if ((length - i - 1) % 3 == 0 && i < length - 1) {
                formatted.append('.');
            }
        }

        return formatted.toString();
    }
}

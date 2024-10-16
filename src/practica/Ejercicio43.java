/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que sea capaz de dibujar el "Triángulo de Pascal"
 * indicándole únicamente el tamaño del lado.
 *
 * - Aquí puedes ver rápidamente cómo se calcula el triángulo:
 *   https://commons.wikimedia.org/wiki/File:PascalTriangleAnimated2.gif
 */
public class Ejercicio43 {
    
    // Solucion hecha por MoureDev by Brais Moure 

    public static void main(String[] args) {
        pascalTriangle(5);
//        pascalTriangle(1);
//        pascalTriangle(0);
//        pascalTriangle(-5);
    }

    private static void pascalTriangle(int size) {
        if (size < 1) {
            System.out.println("Invalid size: " + size);
            return;
        }

        java.util.List<Integer> lastRow = new java.util.ArrayList<>();

        for (int row = 0; row < size; row++) {
            java.util.List<Integer> currentRow = new java.util.ArrayList<>();
            StringBuilder triangleRow = new StringBuilder();

            for (int element = 0; element <= row; element++) {
                if (element > 0 && element < row) {
                    int value = lastRow.get(element - 1) + lastRow.get(element);
                    triangleRow.append(value).append(" ");
                    currentRow.add(value);
                } else {
                    triangleRow.append("1 ");
                    currentRow.add(1);
                }
            }

            System.out.println(repeat(" ", size - row) + triangleRow.toString());

            lastRow = currentRow;
        }
    }

    private static String repeat(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
}

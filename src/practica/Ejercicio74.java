/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que calcule el número de la columna de una hoja de Excel
 * teniendo en cuenta su nombre.
 * - Las columnas se designan por letras de la "A" a la "Z" de forma infinita.
 * - Ejemplos: A = 1, Z = 26, AA = 27, CA = 79.
 */
public class Ejercicio74 {
    
    // Solución propuesta por el creador
    public static void main(String[] args) {
        System.out.println(calculateColumnNumber("A"));    // 1
        System.out.println(calculateColumnNumber("Z"));    // 26
        System.out.println(calculateColumnNumber("AA"));   // 27
        System.out.println(calculateColumnNumber("CA"));   // 79
        System.out.println(calculateColumnNumber("XFD"));  // 16384
        System.out.println(calculateColumnNumber("ZZZZ")); // 475254
    }
    
     public static int calculateColumnNumber(String columnName) {
        int columnNumber = 0;
        int alphabetLength = 26;

        for (char letter : columnName.toUpperCase().toCharArray()) {
            columnNumber = (columnNumber * alphabetLength) + (letter - 'A' + 1);
        }

        return columnNumber;
    }

    
}

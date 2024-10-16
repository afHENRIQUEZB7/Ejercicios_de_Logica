/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/*
 * Crea una función que dibuje una espiral como la del ejemplo.
 * - Únicamente se indica de forma dinámica el tamaño del lado.
 * - Símbolos permitidos: ═ ║ ╗ ╔ ╝ ╚
 *
 * Ejemplo espiral de lado 5 (5 filas y 5 columnas):
 * ════╗
 * ╔══╗║
 * ║╔╗║║
 * ║╚═╝║
 * ╚═══╝
 */

public class Ejercicio66 {

    public static void main(String[] args) {
        int longitudLado;

        // Pido la longitud del lado
        System.out.print("Longitud del lado: ");
        longitudLado = new Scanner(System.in).nextInt();

        // Dibujo la espiral
        System.out.println(repetir("═", longitudLado - 1) + "╗");
        for (int fila = 0; longitudLado - 2 * fila - 3 >= 0; fila++) {
            System.out.println(repetir("║", fila)
                    + "╔"
                    + repetir("═", longitudLado - 2 * fila - 3)
                    + "╗"
                    + repetir("║", fila + 1));
        }
        for (int fila = longitudLado / 2 - 1; fila >= 0; fila--) {
            System.out.println(repetir("║", fila)
                    + "╚"
                    + repetir("═", longitudLado - 2 * fila - 2)
                    + "╝"
                    + repetir("║", fila));
        }
    }

    // Método para repetir una cadena
    private static String repetir(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}

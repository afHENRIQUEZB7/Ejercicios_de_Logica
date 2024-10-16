/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que dibuje una escalera según su número de escalones.
 * - Si el número es positivo, será ascendente de izquiera a derecha.
 * - Si el número es negativo, será descendente de izquiera a derecha.
 * - Si el número es cero, se dibujarán dos guiones bajos (__).
 *
 * Ejemplo: 4
 *         _
 *       _|
 *     _|
 *   _|
 * _|
 *
 */
public class Ejercicio63 {

//    public static void main(String[] args) {
//        int numero = -4;
//
//        pintarEscalera(numero);
//    }
//
//    private static void pintarEscalera(int numero) {
//        if (numero > 0) {
//
//            for (int i = numero + 1; i > 0; i--) {
//
//                for (int j = 0; j <= i; j++) {
//                    if (j != i) {
//                        System.out.print(" ");
//                    }
//
//                }
//                System.out.print("_");
//
//                if ((i != 0) && (i != numero + 1)) {
//                    System.out.println("|");
//                } else {
//                    System.out.println();
//                }
//
//            }
//
//        } else if (numero < 0) {
//            numero *= -1;
//
//            for (int i = 0; i < numero + 1; i++) {
//
//                for (int j = 0; j <= i; j++) {
//                    if (j != i) {
//                        System.out.print(" ");
//                    }
//
//                }
//
//               
//                if ((i != 0) && (i != numero + 1)) {
//                    System.out.print("|");
//                    System.out.println("_");
//                } else {
//                    System.out.println("_");
//                }
//
//            }
//
//        } else {
//            System.out.println("(__)");
//        }
//    }
    public static void main(String[] args) {
        int numero = 4;
        pintarEscalera(numero);
    }

    private static void pintarEscalera(int numero) {
        if (numero > 0) {
            for (int i = 0; i < numero; i++) {
                for (int j = 0; j < numero - i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("_");
                if (i > 0) {
                    System.out.print("|");
                }
                System.out.println();
            }
        } else if (numero < 0) {
            numero = -numero;
            for (int i = 0; i < numero; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                if (i > 0) {
                    System.out.print("|");
                }
                System.out.println("_");
            }
        } else {
            System.out.println("__");
        }
    }
}

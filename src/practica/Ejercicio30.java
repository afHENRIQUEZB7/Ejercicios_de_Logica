/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
 * ¿De cuántas maneras eres capaz de hacerlo?
 * Crea el código para cada una de ellas.
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        int suma = 0, cont = 1;
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("El conteo de uno en uno es: " + i);
//        }

//        while (cont <= 100) {
//            System.out.println("El conteo de uno en uno es: " + cont);
//            cont++;
//        }

        do {
            System.out.println("El conteo de uno en uno es: " + cont);
            cont++;
        } while (cont <= 100);

    }
}

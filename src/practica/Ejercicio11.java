/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        long n1 = 1, n2 = 0, res, cont = 0;
        while (cont < 50) {

            
            if (cont == 0) {
                res = 0;
            }else{
                res = n1 + n2;
                n1 = n2;
                n2 = res;
            }
            System.out.print(res + ", ");
            cont++;

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // Imprimir los números primos entre 1 y 100
        for (int number = 1; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number+", ");
            }
        }
        System.out.println();
    }
    
    // Método para comprobar si un número es primo
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

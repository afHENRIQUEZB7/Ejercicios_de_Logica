/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.math.BigDecimal;

/*
Los factores primos de 13195 son 5,7,13 y 29.

¿Cuál es el mayor factor primo del número? 600851475143?

 */
public class Ejercicio7 {

    public static void main(String[] args) {
        long number = 600851475143L;

        System.out.println("El mayor factor primo de " + number + " es: " + getLargestPrimeFactor(number));
    }

    public static long getLargestPrimeFactor(long number) {
        long largestFactor = 1;

        // Dividir el número por 2 hasta que ya no sea divisible
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Dividir el número por todos los números impares empezando desde 3
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // Si al final queda un número mayor que 2, es primo y es el mayor factor primo
        if (number > 2) {
            largestFactor = number;
        }

        return largestFactor;
    }
}

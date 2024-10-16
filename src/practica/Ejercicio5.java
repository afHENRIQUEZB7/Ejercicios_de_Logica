/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
Si enumeramos todos los números naturales a continuación 10 que son múltiplos de 3 o 5, obtenemos 3,5,6 y 9. La suma de estos múltiplos es 23.

Encuentra la suma de todos los múltiplos de 3 o 5 abajo 1000
.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        int numero = 3, suma = 0;
        for (int i = 1; i <1000; i++) {
            if (i%3 == 0 || i%5 == 0) {
                suma += i;
            }
        }
        
        System.out.println("La suma de los multiplos de 3 al 1000 es: " + suma);

    }
}

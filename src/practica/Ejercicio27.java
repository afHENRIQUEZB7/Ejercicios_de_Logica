/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        int numero1 = 1, numero2 = 2, segundos = 7, resultado = 0;

        //resultado = suma(numero1, numero2, segundos);

//        System.out.println("Resultado de la suma: " + resultado);


        System.out.println("Resultado de la suma: " + suma(numero1, numero2, segundos));
        System.out.println("Resultado de la suma: " + suma(numero1, numero2, segundos));

    }

    private static Integer suma(int numero1, int numero2, int segundos) {
        int suma = 0;
        try {
            Thread.sleep( segundos * 1000);
            suma = numero1 + numero2;
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.out);
        }
        
        return suma;
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.

  Ejemplo de como sacar un factorial:

    6!= 6*5*4*3*2*1 = 720
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        
        System.out.println("Ingrese el numero al cual desea sacarle el factorial:");
        int entrada = af.nextInt(), salida;
        
        salida = calcularFactorial(entrada);
        
        System.out.println("El factorial de "+ entrada + " es: " + salida);
    }
    
    
    private static Integer calcularFactorial(int entrada){
        int retorno=entrada;
        for (int i = entrada-1; i > 0; i--) {
            retorno *= i;
        }
        
        return retorno;
    }
}

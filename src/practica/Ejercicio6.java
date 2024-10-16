/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
Cada nuevo término en la secuencia de Fibonacci se genera sumando los dos términos anteriores. Al comenzar con 1 y 2, la primera 10 términos serán:

1,2,3,5,8,13,21,34,55,89,.....

Considerando los términos de la secuencia de Fibonacci cuyos valores no superan los cuatro millones, encuentre la suma de los términos pares.

 */
public class Ejercicio6 {

    public static void main(String[] args) {
        long cont = 1, cont2 = 0, res = 0, sum = 0;
        for (int i = 0; i < 50; i++) {
            res = cont + cont2;
            System.out.println("res = " + res);
//            if (res % 2 == 0) {
//                System.out.print(res + ", ");
//                
//                sum += res;
//            }

            cont2 = cont;
            cont = res;

        }

        System.out.println("suma de los pares es: " + sum);
        
        
//        while(res<50){
//            res = cont + cont2;
//            System.out.println("res = " + res);
////            if (res % 2 == 0) {
//////                System.out.print(res + ", ");
////                
////                sum += res;
////            }
//            cont2 = cont;
//            cont = res;
//        }
//        
//        System.out.println("suma de los pares es: " + sum);
        
        
        
        
        
        
        
        
        
        
        
        
        
//
//        int a = 1;
//        int b = 2;
//
//        while (a <= 10) {
//            if (a % 2 == 0) {
////                sum += a;
//            }
//            // Generar el siguiente término en la secuencia de Fibonacci
//            int next = a + b;
//            System.out.print(next + ", ");
//            a = b;
//            b = next;
//        }

//        int numTerms = 10; // El número de términos que queremos generar
//        int count = 0; // Contador para el número de términos generados
//
//        int a = 1;
//        int b = 2;
//
//        System.out.println("Los primeros " + numTerms + " términos de la serie de Fibonacci son:");
//
//        while (count < numTerms) {
//            if (count == 0) {
//                System.out.print(a); // El primer término
//            } else {
//                System.out.print(", " + a); // Los siguientes términos
//            }
//            count++;
//
//            // Generar el siguiente término en la secuencia de Fibonacci
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//
//        System.out.println();
    }
}

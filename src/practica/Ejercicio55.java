/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo,
 * fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
public class Ejercicio55 {

    public static void main(String[] args) {
        int numero = 14930352;

        //calculamos la magnitud
        long magnitud = (numero <= 99) ? 100 : numero * 10;

        System.out.println("magnitud = " + magnitud);

        // Comprobar si es primo;
        boolean primo = true;
        for (int i = 1; i < magnitud; i++) {
            if (i != numero && i != 1) {
                if (numero % i == 0) {
                    primo = false ;
                    break;
                }

            }
        }

        // Comprobar si es Fibonacci
        boolean fibonacci = true;
        long suma = 0, anterior = 0, siguiente = 1;
        for (int i = 1; i <= magnitud; i++) {
            suma = siguiente + anterior;
            if (suma == numero) {
                fibonacci = true;
                break;
            } else {
                fibonacci = false;
            }
            anterior = siguiente;
            siguiente = suma;

        }

        //Comprobar si es par
        boolean par = (numero % 2 == 0) ? true : false;

        String primoTex = (primo) ? " es primo " : " no es primo ";
        String fibonacciTex = (fibonacci) ? " es fibonacci " : " no es fibonacci ";
        String parTex = (par) ? " es par " : " es impar ";

        System.out.println(numero + primoTex + "," + fibonacciTex + " y " + parTex);

    }
}

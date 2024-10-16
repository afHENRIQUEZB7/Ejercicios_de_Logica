/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que reciba un número decimal y lo trasforme a Octal
 * y Hexadecimal.
 * - No está permitido usar funciones propias del lenguaje de programación que
 * realicen esas operaciones directamente.
 */


public class Ejercicio62 {
    public static void main(String[] args) {
        int numero = 646;
        
        System.out.println("Los numeros en octal y hexadecimal son: ");
        
        System.out.println(octal(numero)+ " " + hexadecimal(numero));
        System.out.println(octal(4952) + " " + hexadecimal(4952));
        System.out.println(octal(500)+ " " + hexadecimal(500));
        System.out.println(octal(95)+ " " + hexadecimal(95));
    }

    private static String octal(int numero) {
        StringBuilder octal = new StringBuilder();
        
        while(numero > 0 ){
            octal.append(numero %8);
            numero = numero / 8;
        }
        return octal.reverse().toString();
    }

    private static String hexadecimal(int numero) {
        StringBuilder hexadecimal = new StringBuilder();
        
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        
        while(numero > 0 ){
            int remainder = numero % 16;
            hexadecimal.append(hexChars[remainder]);
            numero = numero / 16;
        }
        return hexadecimal.reverse().toString();
    }
}

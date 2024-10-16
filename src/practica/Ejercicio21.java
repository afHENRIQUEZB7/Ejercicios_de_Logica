/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.

    Ejemplo de numero Armstrong o Narcisista:

    153 = 1^3 + 5^3 + 3^3 = 153
    (El numero Narcisista es aquel numero que la suma de  sus digitos elevados a la potencia de su numero de cifras)
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int numero = 20, canCifras, validador =0;
        
        String cadena = String.valueOf(numero);
        
        canCifras = cadena.length();
        
        for (int i = 0; i < canCifras; i++) {
            validador +=   Math.pow(Integer.parseInt(String.valueOf(cadena.charAt(i))), canCifras);
        }
        
        if (validador == numero) {
            System.out.println("El numero "+ numero + " es un Armstrong");
        }else{
            System.out.println("El numero "+ numero + " no es un Armstrong");
        }
        
        
    }
}

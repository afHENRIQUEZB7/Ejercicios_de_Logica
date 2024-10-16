/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int numero = 999999999;

        int resultado = 0;
        String salida = "";
        
        do{
           resultado = numero % 2;
           numero = numero / 2;
//            System.out.println(resultado);
            salida = salida + String.valueOf(resultado); 
        }while(numero>2);
        
        System.out.println(new StringBuilder(salida+"1").reverse());
    }
}

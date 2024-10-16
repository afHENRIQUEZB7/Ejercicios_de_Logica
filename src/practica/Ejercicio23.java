/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        String cadena = "¿hola      qué tal estás?";
        
        String conversion = conMayuscula(cadena);
        System.out.println("Primeras letra Mayusculas: " + conversion);
    }
    
    private static String conMayuscula(String cadena){
        String conversion [] = cadena.replaceAll("[^A-Za-zÀ-ú]", " ").split(" ");
        
        String cadenaNueva = "";
        for (int i = 0; i < conversion.length; i++) {
            for (int j = 0; j < conversion[i].length(); j++) {
                if (j==0) {
                    cadenaNueva += String.valueOf(conversion[i].charAt(j)).toUpperCase();
                }else{
                    cadenaNueva += String.valueOf(conversion[i].charAt(j));
                }
                
            }
            cadenaNueva += " ";
            
        }
        return cadenaNueva;
    }
}

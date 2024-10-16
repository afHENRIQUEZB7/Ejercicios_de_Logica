/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa se encargue de transformar un número binario
 * a decimal sin utilizar funciones propias del lenguaje que
 * lo hagan directamente.
 */

public class Ejercicio42 {
    public static void main(String[] args) {
        int numero = 48;
        
        String binario = conversionBinaria(numero);
        System.out.println("El numero "+ numero + " en binario es: " + binario);
        
        int decimal = conversionDecimal(binario);
        System.out.println("El numero binario "+ binario + " en decimal es: " + decimal);
    }
    
    private static String conversionBinaria(int numero){
        int cont = 0;
        String binario = "";
        
        while(numero>=1){
            binario = binario + String.valueOf(numero%2);
            numero = numero/2;
            cont++;
        }
        
        binario = new StringBuilder(binario).reverse().toString();
        return  binario;
    }
    
    private static int conversionDecimal(String binario){
        int decimal = 0;
        for (int i = 0; i < binario.length(); i++) {
            if (String.valueOf(binario.charAt(binario.length()-1)).equals("0") && i ==binario.length()-1) {
                decimal = decimal;
                break;
            }
            decimal += Math.pow(
                                    ( String.valueOf(binario.charAt(i)).equals("1") ) ? 2 : 0
                                    , binario.length() - (i+1)
                                );
        }
        return decimal;
    }
}

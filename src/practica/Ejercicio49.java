/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un función que reciba un texto y retorne la vocal que
 * más veces se repita.
 * - Ten cuidado con algunos casos especiales.
 * - Si no hay vocales podrá devolver vacío.
 */


public class Ejercicio49 {
    public static void main(String[] args) {
        char[] vocales = {'a','e','i','o','u'};
        
        String cadenaTexto = "Holaaaaaa a todos";
        
        
        System.out.println("La vocal que se repite más es: "+comparaVocales(vocales, cadenaTexto)); 
        System.out.println("La vocal que se repite más es: "+comparaVocales(vocales, "77777i")); 
        System.out.println("La vocal que se repite más es: "+comparaVocales(vocales, "77777454")); 
    }

    private static String comparaVocales(char[] vocales, String cadenaTexto) {
        int contVocal = 0;
        int comparar = 0;
        String retorno = "El texto no tiene vocales (vacio)";
        String texto = cadenaTexto.replace(" ", "").toLowerCase();
        for (int i = 0; i < vocales.length ; i++) {
            for (int j = 0; j < texto.length(); j++) {
                if (vocales[i]== texto.charAt(j)) {
                    contVocal++;
                }
                
            }
            if (contVocal> comparar ) {
                retorno = String.valueOf(vocales[i]);
                comparar = contVocal;
                
            }
            contVocal = 0;
        }
        return retorno;
    }
}

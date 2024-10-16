/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        String array1 [] = new String [3];
        
        String array2 [] = new String [3];
        
        array1[0] = "1";
        array1[1] = "1";
        array1[2] = "7";
        
        array2[0] = "8";
        array2[1] = "3";
        array2[2] = "1";
        
        boolean condicion = false;
        
        String resultado [] = similitud(array1, array2, condicion);
        
        
        if (condicion) {
            System.out.println("Elementos comunes de entre los dos array");
        }else{
            System.out.println("Elementos no comunes de entres los dos array");
        }
        
        for(String l : resultado){
            
            System.out.print(l + ", ");
        }
        
        System.out.println();
    }
   
    private static String [] similitud(String array1 [], String array2 [], boolean condicion){
        
        Map<String,String> map = new HashMap<>();
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                
                if (condicion) {
                    if (array1[i].equals(array2[j])) {
                        map.put(array1[i], array1[i]);
                    }
                }else{
                    if (array1[i]!=(array2[j])) {
                        map.put(array1[i], array1[i]);
                        map.put(array2[j], array2[j]);
                    }
                }
            }
        }
        
        // Se le asigna el tamaño que se obrtiene del map
        String resultado [] = new String[map.size()];
        
        
        // llenamos el array de vuelta
        int cont = 0;
        for (String contenido : map.values()) {
            resultado[cont] = contenido;
            cont++;
        }
        
        return resultado;
    }

}

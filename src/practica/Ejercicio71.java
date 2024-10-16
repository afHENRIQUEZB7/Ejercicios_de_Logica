/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea una función que reciba dos cadenas de texto casi iguales,
 * a excepción de uno o varios caracteres.
 * La función debe encontrarlos y retornarlos en formato lista/array.
 * - Ambas cadenas de texto deben ser iguales en longitud.
 * - Las cadenas de texto son iguales elemento a elemento.
 * - No se pueden utilizar operaciones propias del lenguaje
 *   que lo resuelvan directamente.
 *
 * Ejemplos:
 * - Me llamo mouredev / Me llemo mouredov -> ["e", "o"]
 * - Me llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]
 */
public class Ejercicio71 {

    public static void main(String[] args) {
        System.out.println(diferencia("Me llamo mouredev", "Me llemo mouredov"));
        System.out.println(diferencia("Me llamo.Brais Moure", "Me llamo brais moure"));
    }

    private static String diferencia(String texto1, String texto2) {
        if (texto1.length() != texto2.length()) {
            return "Las cadenas de textos tienen que ser de igual longitud \n"
                    + "Vuelva a ingresar de nuevo otra vez las palabras";
        }

//        // Arreglo donde voy almacenar los caracteres distintos
//        List<String> array = new ArrayList<>();

        String retorno = "[";
        for (int i = 0; i < texto1.length(); i++) {
            if (texto1.charAt(i) != texto2.charAt(i)) {
                retorno += "'"+texto2.charAt(i)+"'" + ", ";
            }
        }

        
        
        return retorno.substring(0,retorno.length()-2) + "]";
    }

}

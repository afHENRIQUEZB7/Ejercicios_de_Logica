/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;

/*

Un número palindrómico se lee igual en ambos sentidos. El palíndromo más grande hecho del producto de dos 2 -los números de dígitos son:
9009 = 91x99.

Encuentra el palíndromo más grande hecho del producto de dos 3 -números de dígitos.

 */
public class Ejercico10 {

    public static void main(String[] args) {
        int minRan = 100, maxRan = 999, cont2 = 100, asignacion;
        List<Integer> lista = new ArrayList<>();
        String comparacion,comparacion2;
        while (minRan <= maxRan) {
            while (cont2 <= maxRan) {
                asignacion = minRan * cont2;
                comparacion = String.valueOf(asignacion);
                comparacion2 = new StringBuilder(comparacion).reverse().toString();
                
                if (comparacion.equals(comparacion2)) {
                    lista.add(asignacion);
                }
                
                cont2++;
            }
            cont2 = 0;
            minRan++;
        }

        int mayor = 0, menor = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            menor = lista.get(i);
            if ( mayor < menor) {
                mayor = menor;
            }
            
        }

        
        
       System.out.println("el mayor palindrome es : " + mayor);

    }
}

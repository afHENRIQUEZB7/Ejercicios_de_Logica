/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        int numero1 = 180, numero2 = 324;

        MCD(numero1, numero2);
        System.out.println("El maximo comun divisor de " + numero1 + " y " + numero2 + " es: " + MCD(numero1, numero2));
//        
        System.out.println("El minimo comun multiplo de " + numero1 + " y " + numero2 + " es: " + mcm(numero1, numero2));
    }

    private static Integer MCD(int numero1, int numero2) {

        List<Integer> numerosPrimosNum1 = factorial(numero1);
        List<Integer> numerosPrimosNum2 = factorial(numero2);

        // Map para el numero 1
        Map<String, Integer> map1 = numPrimos(numerosPrimosNum1);

        // Map para el numero 2
        Map<String, Integer> map2 = numPrimos(numerosPrimosNum2);

//        System.out.println("Recorre el map  prueba");
//        
//        for (Map.Entry<String,Integer> resultado : map1.entrySet()) {
//            System.out.println("El numero "+ resultado.getKey() + " se repite " + resultado.getValue() + " veces");
//        }
//        
//        System.out.println("Recorre el map 2 prueba");
//        
//        for (Map.Entry<String,Integer> resultado : map2.entrySet()) {
//            System.out.println("El numero "+ resultado.getKey() + " se repite " + resultado.getValue() + " veces");
//        }
        int mcd = 1;

        if (map1.size() > map2.size()) {
            for (Map.Entry<String, Integer> t : map1.entrySet()) {
                if (map2.containsKey(t.getKey())) {
                    if (map2.get(t.getKey()) > t.getValue()) {
                        mcd *= Math.pow(Integer.parseInt(t.getKey()), t.getValue());
                    } else {
                        mcd *= Math.pow(Integer.parseInt(t.getKey()), map2.get(t.getKey()));
                    }
                }
            }
        } else {
            for (Map.Entry<String, Integer> t : map2.entrySet()) {
                if (map1.containsKey(t.getKey())) {
                    if (map1.get(t.getKey()) > t.getValue()) {
                        mcd *= Math.pow(Integer.parseInt(t.getKey()), t.getValue());
                    } else {
                        mcd *= Math.pow(Integer.parseInt(t.getKey()), map1.get(t.getKey()));
                    }
                }
            }
        }

        return mcd;
    }

    private static Integer mcm(int numero1, int numero2) {
        return (numero1 * numero2) / MCD(numero1, numero2);
    }

    // -------------------UTILIDADES-------------------
    private static List<Integer> factorial(int numero) {

        int cont = 2;
        List<Integer> numerosPrimos = new ArrayList<>();
        while (cont <= numero) {
            if (numero % cont == 0) {
                numerosPrimos.add(cont);
                numero /= cont;
                cont++;
                if (numero % (cont - 1) == 0) {
                    cont -= 1;
                }
            } else {
                cont++;
            }
        }

        return numerosPrimos;
    }

    private static Map<String, Integer> numPrimos(List<Integer> numerosPrimos) {

        Map<String, Integer> map = new HashMap<>();

        // Recorremos la lista de la descomposicion de los numeros primos 
        int comparativa = -1;
        int vecesNum1 = 0;
        for (int i = 0; i < numerosPrimos.size(); i++) {
            // tomar el primer valor de las lista para poder a hacer las comparativas
            if (i == 0) {
                comparativa = numerosPrimos.get(i);
            }

            if (numerosPrimos.get(i) == comparativa) {
                vecesNum1++;
                map.put(String.valueOf(numerosPrimos.get(i)), vecesNum1);
            } else {
                vecesNum1 = 1;
                map.put(String.valueOf(numerosPrimos.get(i)), vecesNum1 );
            }

            comparativa = numerosPrimos.get(i);

        }
        return map;
    }
}

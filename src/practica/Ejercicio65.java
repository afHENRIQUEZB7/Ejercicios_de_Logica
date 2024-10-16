package practica;

import java.util.List;
import java.util.ArrayList;


/*
 * Crea un programa que encuentre y muestre todos los pares de números primos
 * gemelos en un rango concreto.
 * El programa recibirá el rango máximo como número entero positivo.
 *
 * - Un par de números primos se considera gemelo si la diferencia entre
 *   ellos es exactamente 2. Por ejemplo (3, 5), (11, 13)
 *
 * - Ejemplo: Rango 14
 *   (3, 5), (5, 7), (11, 13)
 */
public class Ejercicio65 {

    public static void main(String[] args) {
        int rangoPrimos = 100;

        paresNumerosPrimos(rangoPrimos);
    }

    private static void paresNumerosPrimos(int rangoPrimos) {
        // Lista para los numero primos
        List<Integer> numPrimos = new ArrayList<>();

        // Lista para seleccionar los pares primos
        List<String> pares = new ArrayList<>();

        // Sacar los nuemeros primos en el rango dado
        boolean primo = true;
        for (int i = 1; i <= rangoPrimos; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            // Agregamos los numeros a la lista
            if (primo) {
                numPrimos.add(i);
            } else {
                primo = true;
            }
        }

        // Sacamos los pares de los primos
        int anterior = 0;
        for (Integer num : numPrimos) {
            if (num - anterior == 2) {
                String par = "(" + String.valueOf(anterior) + "," + String.valueOf(num) + ")";
                pares.add(par);
            }
            anterior = num;
        }

        // Imprimimos los pares
        System.out.println("Los numero primos  pares son: \n"
                + pares);
    }
    
    
    // SOLUCION REALIZADA POR CHATGPT  
    
    
//    public static void main(String[] args) {
//        int rangoPrimos = 100;
//        paresNumerosPrimos(rangoPrimos);
//    }
//
//    private static void paresNumerosPrimos(int rangoPrimos) {
//        // Lista para los números primos
//        List<Integer> numPrimos = new ArrayList<>();
//
//        // Sacar los números primos en el rango dado
//        for (int i = 2; i <= rangoPrimos; i++) {
//            if (esPrimo(i)) {
//                numPrimos.add(i);
//            }
//        }
//
//        // Sacamos los pares de primos gemelos
//        List<String> pares = new ArrayList<>();
//        for (int i = 0; i < numPrimos.size() - 1; i++) {
//            int num1 = numPrimos.get(i);
//            int num2 = numPrimos.get(i + 1);
//            if (num2 - num1 == 2) {
//                pares.add("(" + num1 + ", " + num2 + ")");
//            }
//        }
//
//        // Imprimimos los pares
//        System.out.println("Los números primos gemelos son:");
//        for (String par : pares) {
//            System.out.println(par);
//        }
//    }
//
//    private static boolean esPrimo(int numero) {
//        if (numero <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(numero); i++) {
//            if (numero % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}

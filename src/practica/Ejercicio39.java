/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;

/*
 * Dado un array de enteros ordenado y sin repetidos,
 * crea una función que calcule y retorne todos los que faltan entre
 * el mayor y el menor.
 * - Lanza un error si el array de entrada no es correcto.
 */
public class Ejercicio39 {

    public static void main(String[] args) {
        int numeros[] = {2, 4, 6, 3, 8, 10};

        int respuesta[] = retorno(numeros);

        System.out.println("Los numero que faltan son: ");
        for (Integer res : respuesta) {
            System.out.print(res + ", ");
        }

        System.out.println();
    }

    private static int[] retorno(int numeros[]) {

        // Recorrer el arreglo para saber cual es el mayor
        int numeroMayor = 0;
        for (Integer resultado : numeros) {
            if (resultado > numeroMayor) {
                numeroMayor = resultado;
            }
        }

        //  Se recorre el arreglo para saber cuales son los numeros que hacen falta
        List<Integer> retorno = new ArrayList<>();
        boolean validador = false;
        for (int i = 0; i <= numeroMayor; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (i == numeros[j]) {
                    validador = false;
                    break;
                } else {
                    validador = true;
                }
            }
            if (validador) {
                retorno.add(i);
                validador = false;
            }

        }
        return retorno.stream().mapToInt(Integer::intValue).toArray();

    }

    // SOLUCION HECHA POR CHATGPT
    /*
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumerosFaltantes {
    public static void main(String[] args) {
        int numeros[] = {2, 4, 6, 3, 8, 10};

        int respuesta[] = encontrarFaltantes(numeros);

        if (respuesta.length == 0) {
            System.out.println("El array de entrada no es correcto o no hay números faltantes.");
        } else {
            System.out.println("Los números que faltan son: ");
            for (int res : respuesta) {
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

    private static int[] encontrarFaltantes(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return new int[0];  // Array vacío si el array de entrada no es correcto.
        }

        // Verificar que no hay duplicados usando un Set
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (!set.add(num)) {
                return new int[0];  // Array vacío si hay duplicados.
            }
        }

        // Ordenar el array
        Arrays.sort(numeros);

        int numeroMenor = numeros[0];
        int numeroMayor = numeros[numeros.length - 1];

        // Crear una lista para los números faltantes
        List<Integer> faltantes = new ArrayList<>();

        // Encontrar los números faltantes
        for (int i = numeroMenor + 1; i < numeroMayor; i++) {
            if (Arrays.binarySearch(numeros, i) < 0) {
                faltantes.add(i);
            }
        }

        // Convertir la lista de faltantes a un array de int
        return faltantes.stream().mapToInt(Integer::intValue).toArray();
    }
}

     */
}

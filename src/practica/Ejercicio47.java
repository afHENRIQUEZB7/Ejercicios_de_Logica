/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;

/*
 * Crea una función que retorne el número total de bumeranes de
 * un array de números enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
 *   seguidos, en el que el primero y el último son iguales, y el segundo
 *   es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2]
 *   y [4, 2, 4]).
 */
public class Ejercicio47 {

    public static void main(String[] args) {
        int numero[] = {2, 1, 2, 3, 3, 4, 2, 4};
        int numero2[] = {3, 1, 2, 3, 5, 3, 2, 4};

        System.out.println("La cantidade de Bumeran son: " + encontrarBumeran(numero));
        System.out.println("La cantidade de Bumeran son: " + encontrarBumeran(numero2));
    }

    private static int encontrarBumeran(int[] numero) {
        ArrayList<String> list = new ArrayList<>();
        int cantidaBomeran = 0;
        for (int i = 0; i < numero.length; i++) {
            String bumeran = String.valueOf(numero[i]);
            int con = 0;
            for (int j = i + 1; j < numero.length; j++) {
                if (con < 2) {
                    bumeran = bumeran + "," + String.valueOf(numero[j]);
                }
                con++;
            }

            if (bumeran.length() == 5) {
                if (bumeran.charAt(0) == bumeran.charAt(bumeran.length() - 1) && bumeran.charAt(0) != bumeran.charAt(bumeran.length() - 3) && bumeran.length() > 1) {
                    list.add(bumeran);
                    cantidaBomeran++;
                }
            }

        }
        System.out.println("Bumeran encontrado: ");
        for (String string : list) {
            System.out.println(string);
        }
        return cantidaBomeran;
    }

    // SOLUCION HECHA POR EL QUE PROPUSO EL PROBLEMA
    
//     public static void main(String[] args) {
//        System.out.println(numberOfBoomerangs(new int[]{2, 1, 2, 3, 3, 4, 2, 4}));
//        System.out.println(numberOfBoomerangs(new int[]{2, 1, 2, 1, 2}));
//        System.out.println(numberOfBoomerangs(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(numberOfBoomerangs(new int[]{2, 2, 2, 2, 2}));
//        System.out.println(numberOfBoomerangs(new int[]{2, -2, 2, -2, 2}));
//        System.out.println(numberOfBoomerangs(new int[]{2, -2}));
//        System.out.println(numberOfBoomerangs(new int[]{2}));
//        System.out.println(numberOfBoomerangs(new int[]{}));
//    }
//
//    private static int numberOfBoomerangs(int[] numbers) {
//        if (numbers.length < 3) return 0;
//
//        int boomerangs = 0;
//
//        for (int i = 1; i < numbers.length - 1; i++) {
//            int prev = numbers[i - 1];
//            int current = numbers[i];
//            int next = numbers[i + 1];
//
//            if (prev == next && prev != current) {
//                System.out.println("[" + prev + ", " + current + ", " + next + "]");
//                boomerangs++;
//            }
//        }
//
//        return boomerangs;
//    }
    
    
}

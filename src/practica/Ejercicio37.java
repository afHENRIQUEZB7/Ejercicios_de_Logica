/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que imprima los 30 próximos años bisiestos
 * siguientes a uno dado.
 * - Utiliza el menor número de líneas para resolver el ejercicio.
 */
public class Ejercicio37 {

    public static void main(String[] args) {
        anosBisiestos(2024);
    }

    private static void anosBisiestos(int ano) {
        System.out.println("Los próximos 30 años bisiestos son:");
        int count = 0;
        while (count < 30) {
            ano++;
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano);
                count++;
            }
        }
    }
}

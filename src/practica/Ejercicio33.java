/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa que determine si dos vectores son ortogonales.
 * - Los dos array deben tener la misma longitud.
 * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        int vector1[] = new int[2];
        int vector2[] = new int[2];

        /*
        
        // Ejemplo de ortogonales
        vector1[0] = 10;
        vector1[1] = 20;
        vector2[0] = 20;
        vector2[1] = -10;
        
         */
        
        // Ejemplo de no ortogonales
        vector1[0] = 12;
        vector1[1] = 34;
        vector2[0] = 56;
        vector2[1] = 78;

        // Comprobar si los array son de la misma longitud
        if (vector1.length <= 2 && vector1.length >= 0 && vector1 != null && vector2.length <= 2 && vector2.length >= 0 && vector2 != null) {

            System.out.println((ortogonal(vector1, vector2) != 0) ? "Los vectores no son Ortogonales" : "Los vectores  son Ortogonales");

        } else {
            System.out.println("Revise la longitud de los dos array, tienen que tener una misma longitud");
        }
    }

    private static Integer ortogonal(int vector1[], int vector2[]) {
        int ortogonal = 0;

        for (int i = 0; i < vector1.length; i++) {
            ortogonal += vector1[i] * vector2[i];
        }

        return ortogonal;
    }
}

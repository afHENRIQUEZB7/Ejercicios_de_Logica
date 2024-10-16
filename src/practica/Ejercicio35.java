/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que ordene y retorne una matriz de números.
 * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
 *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
 *   o de mayor a menor.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
 *   automáticamente.
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        int matriz[] = {2, 7, 6, 8, 9};
        // "Asc" o "Desc"
        String ordenar = "Desc";

        int retorno[] = ordenarMatriz(matriz, ordenar);

        for (int i = 0; i < retorno.length; i++) {
            System.out.println(retorno[i]);
        }
    }

    private static int[] ordenarMatriz(int matriz[], String ordenar) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                switch (ordenar) {
                    case "Desc":
                        if (matriz[i] > matriz[j]) {
                            int variable = matriz[i];
                            matriz[i] = matriz[j];
                            matriz[j] = variable;
                        }
                        break;
                    case "Asc":
                        if (matriz[i] < matriz[j]) {
                            int variable = matriz[i];
                            matriz[i] = matriz[j];
                            matriz[j] = variable;
                        }
                        break;
                    default:
                        matriz[i] = 0;
                        break;
                        
                }

            }
        }

        return matriz;
    }
}

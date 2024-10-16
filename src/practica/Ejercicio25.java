/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */
public class Ejercicio25 {

    public static void main(String[] args) {
//        String matriz[][] = new String[4][3];
        String matriz[][] = new String[3][3];

        matriz[0][0] = "X";
        matriz[0][1] = "O";
        matriz[0][2] = "O";
        matriz[1][0] = "X";
        matriz[1][1] = "O";
        matriz[1][2] = "X";
        matriz[2][0] = "";
        matriz[2][1] = "";
        matriz[2][2] = "";
        matriz[2][2] = "";
//        matriz[3][0] = "";
//        matriz[3][1] = "";
//        matriz[3][2] = "";

        int conX = 0, conO = 0;
        boolean nulo = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                switch (matriz[i][j]) {
                    case "X":
                        conX++;
                        break;
                    case "O":
                        conO++;
                        break;
                    case "":
                        break;
                    default:
                        // validacion por si la proporcion e "X", de "O" no es correcta.
                        nulo = true;
                        break;
                }
            }
        }

        System.out.println("SOLUCION");
        // Validacion para saber si la proporcion de la matriz no es correcta y la de las "X" o "O" de lo que puede contener una matriz 3x3.
        if (conX > 9 || conO > 9 || matriz.length > 3 || matriz[0].length > 3) {
            nulo = true;
        }

        if (nulo) {
            System.out.println("Nulo");
        } else {

            if (conX > 0 && conX > conO) {
                System.out.println("X");
            }

            if (conO > 0 && conO > conX) {
                System.out.println("O");
            }

            if (conX == conO) {
                System.out.println("Empate");
            }
        }
    }
}

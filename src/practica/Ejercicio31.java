/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
 *   o "S" (tijera).
 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        List<String> listado = new ArrayList();
        
        // R = piedra, P = papel, S = tijera
        
        listado.add("P,R");
        listado.add("P,P");
        listado.add("P,P");
        
        int player1 = 0, player2 = 0;
        
        boolean valido = true;
        
        for (String resultado : listado) {
            switch (resultado) {
                case "R,P":
                    player2++;
                    break;
                case "P,R":
                    player1++;
                    break;
                case "R,S":
                    player2++;
                    break;
                case "S,R":
                    player1++;
                    break;
                case "P,S":
                    player2++;
                    break;
                case "S,P":
                    player1++;
                    break;
                case "R,R":
                    break;
                case "P,P":
                    break;
                case "S,S":
                    break;
                default:
                    valido = false;
                    break;
            }
        }
        
        if (valido) {
            
            if (player1> player2) {
                System.out.println("Ganador : Player 1");
            }else if (player1 < player2){
                System.out.println("Ganador : Player 2");
            }else{
                System.out.println("Tie (Juego en empate)");
            }
            
        }else{
            System.out.println("Valores incorrectos del juego, revise bien que este bien configurado la lista con"
                    + " R = piedra, P = papel, S = tijera");
        }
        
    }

}

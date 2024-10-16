/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Crea una función que reciba dos parámetros para crear una cuenta atrás.
 * - El primero, representa el número en el que comienza la cuenta.
 * - El segundo, los segundos que tienen que transcurrir entre cada cuenta.
 * - Sólo se aceptan números enteros positivos.
 * - El programa finaliza al llegar a cero.
 * - Debes imprimir cada número de la cuenta atrás.
 */

public class Ejercicio69 {
    public static void main(String[] args) {
       int param1 = 7;
       int param2 = 2;
       
       conteo(param1, param2);
    }

    private static void conteo(int param1, int param2) {
        if (param1 <= 0 || param2 <= 0) {
            System.out.println("Los parametros tiene que ser positivos, no se aceptan negativos\n"
                    + "por favor vuelva a ingresar los valores.");
            return;
        }
        
        System.out.println("Empieza el conteo");
        for (int i = param1; i >= 0; i--) {
            System.out.print(i +(i == 0 ? ". " : ", "));
            try {
                Thread.sleep(param2*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio69.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}

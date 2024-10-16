/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un generador de números pseudoaleatorios entre 0 y 100.
 * - No puedes usar ninguna función "random" (o semejante) del
 *   lenguaje de programación seleccionado.
 *
 * Es más complicado de lo que parece...
 */
public class Ejercicio56 {

    public static int random() {
        return (int) (System.nanoTime() % 101);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            System.out.println(random());
        }
    }

    /*
                
        Método random:

                System.nanoTime() obtiene la hora actual en nanosegundos.
                El resultado se obtiene al hacer el módulo 101 de este valor, garantizando así un número entre 0 y 100.



        Método main:

                Se ejecuta un bucle 101 veces para generar y imprimir números pseudoaleatorios entre 0 y 100.
    
     */
}

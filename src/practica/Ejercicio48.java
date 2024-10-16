/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Calcula dónde estará un robot (sus coordenadas finales) que se
 * encuentra en una cuadrícula representada por los ejes "x" e "y".
 * - El robot comienza en la coordenada (0, 0).
 * - Para idicarle que se mueva, le enviamos un array formado por enteros
 *   (positivos o negativos) que indican la secuencia de pasos a dar.
 * - Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos, se detiene,
 *   luego 5, se detiene, y finalmente 2.
 *   El resultado en este caso sería (x: -5, y: 12)
 * - Si el número de pasos es negativo, se desplazaría en sentido contrario al
 *   que está mirando.
 * - Los primeros pasos los hace en el eje "y". Interpretamos que está mirando
 *   hacia la parte positiva del eje "y".
 * - El robot tiene un fallo en su programación: cada vez que finaliza una
 *   secuencia de pasos gira 90 grados en el sentido contrario a las agujas
 *   del reloj.
 */
public class Ejercicio48 {

//    public static void main(String[] args) {
//        int pasos[] = {-10, -5, 2};
//
//        calculoPosicion(pasos);
//
//    }
//
//    private static void calculoPosicion(int[] pasos) {
//        int x = 0;
//        int y = 0;
//        int sentido = 1;
//        int pasosRobot = 0;
//        for (int i = 0; i < pasos.length; i++) {
//            pasosRobot = pasos[i] * sentido;
//            if (i % 2 == 0) {
//
//                //  Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
//                y += (pasos[i] < 0) ? pasosRobot * -1 : pasosRobot * 1;
//
//            } else {
//                //  Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.
//                x += (pasos[i] < 0) ? pasosRobot * -1 : pasosRobot * 1;
//            }
//
//            // validador de cuando se termina de dar pasos el robor para cambiar el sentido en y
//            sentido = (sentido > 0) ? -1 : 1;
//
//        }
//
//        System.out.println("posiciones: x= " + x + ", y= " + y);
//    }
    
    
    // Solucion de chatgpt
    
       public static void main(String[] args) {
        int pasos[] = {-10, -5, 2, 4, -8};
        calculoPosicion(pasos);
    }

    private static void calculoPosicion(int[] pasos) {
        int x = 0;
        int y = 0;
        // 0 = mirando hacia arriba (eje y positivo), 1 = mirando hacia la izquierda (eje x negativo)
        // 2 = mirando hacia abajo (eje y negativo), 3 = mirando hacia la derecha (eje x positivo)
        int direccion = 0; 

        for (int i = 0; i < pasos.length; i++) {
            switch (direccion) {
                case 0: // Mirando hacia arriba
                    y += pasos[i];
                    break;
                case 1: // Mirando hacia la izquierda
                    x -= pasos[i];
                    break;
                case 2: // Mirando hacia abajo
                    y -= pasos[i];
                    break;
                case 3: // Mirando hacia la derecha
                    x += pasos[i];
                    break;
            }
            // Cambiar la dirección 90 grados en sentido antihorario
            direccion = (direccion + 1) % 4;
        }

        System.out.println("posiciones: x= " + x + ", y= " + y);
    }
}

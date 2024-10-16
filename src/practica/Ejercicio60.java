/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 * Crea una función que sea capaz de detectar si existe un viernes 13
 * en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */

public class Ejercicio60 {
    public static void main(String[] args) {
        System.out.println("En la fecha indicada hay un viernes 13 = " + fecha(2023,10));
    }

    private static boolean fecha(int año, int mes) {
        // Crear una fecha con el día 13 del mes y año dados
        LocalDate fecha = LocalDate.of(año, mes, 13);
        
        // Comprobar si el día 13 es un viernes
        return fecha.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}

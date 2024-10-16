/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * ¡Han anunciado un nuevo "The Legend of Zelda"!
 * Se llamará "Tears of the Kingdom" y se lanzará el 12 de mayo de 2023.
 * Pero, ¿recuerdas cuánto tiempo ha pasado entre los distintos
 * "The Legend of Zelda" de la historia?
 * Crea un programa que calcule cuántos años y días hay entre 2 juegos de Zelda
 * que tú selecciones.
 * - Debes buscar cada uno de los títulos y su día de lanzamiento 
 *   (si no encuentras el día exacto puedes usar el mes, o incluso inventártelo)
 */

public class Ejercicio41 {
    public static void main(String[] args) {
        String fechaInicio = "21/02/1986";
        String fechaFinal = "12/05/2023";
        String formatoFecha = "dd/MM/yyyy";
        
        DateFormat formato = new SimpleDateFormat(formatoFecha);
        
        long dias = 0, diferencia;
        
        try {
            Date inicio = formato.parse(fechaInicio);
            Date finaDate = formato.parse(fechaFinal);
            
            if (inicio.before(finaDate)) {
               diferencia = finaDate.getTime() - inicio.getTime();
            }else{
                diferencia = inicio.getTime() - finaDate.getTime();
            }
            
            dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
            
            long años = dias / 365;
            System.out.println("Los años que han pasado son: "+ años);
            System.out.println("Los dias que han pasadi son: "+ dias);
            
            
        } catch (ParseException ex) {
            ex.printStackTrace(System.out);
        }

        
        
         
    }
}

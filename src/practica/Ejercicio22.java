/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;

/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        String fecha1 = "18/05/2024", fecha2 = "20/05/2024", formatoFecha = "dd/MM/yyyy";

        long cantidad = calculoFecha(fecha1, fecha2, formatoFecha);

        if (cantidad == 0) {
            System.out.println("La fechas estan  mal escritas,  tiene que ir es este formato: dd/MM/yyyy");
        } else {
            System.out.println("La diferencia de dias que hay entre: " + fecha1 + " y " + fecha2 + " es: " + cantidad);
        }
    }

    private static long calculoFecha(String fecha1, String fecha2, String formatoFecha) {
        DateFormat dtf = new SimpleDateFormat(formatoFecha);
        long dias = 0 ,diferencia;
        try {
            
            Date f1 = dtf.parse(fecha1);
            Date f2 = dtf.parse(fecha2);
            
            // comprobar si la fecha Nº1 es antes que la Nº2
            if (f1.before(f2)) {
                diferencia = f2.getTime() - f1.getTime();
            }else{
                diferencia = f1.getTime() - f2.getTime();
            }

            
            dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);

        } catch (ParseException e) {
            return dias;

        }

        return dias;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que transforme grados Celsius en Fahrenheit
 * y viceversa.
 *
 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
 *   y su unidad ("C" o "F").
 * - En caso contrario retornará un error.
 */
public class Ejercicio45 {

    public static void main(String[] args) {
        // ºC = Celsius, ºF = Fahrenheit

        String grados = "35"+ tipoGrado.FAHRENHEIT.valor;
        
        System.out.println(conversion(grados));
        System.out.println(conversion("200" +tipoGrado.CELSIUS.valor));
        System.out.println(conversion("3"+tipoGrado.CELSIUS.valor));
        System.out.println(conversion("5"+tipoGrado.FAHRENHEIT.valor));
        System.out.println(conversion("36"+tipoGrado.CELSIUS.valor));
        System.out.println(conversion("100"+tipoGrado.FAHRENHEIT.valor));

    }
    
    enum tipoGrado{
        FAHRENHEIT("ºF"),
        CELSIUS("ºC");
        
        String valor;
        private tipoGrado(String valor) {        
            this.valor = valor;
        }
    }

    private static String conversion(String grado) {
        double resultado;
        switch (String.valueOf(grado.substring(grado.length() - 2, grado.length()))) {
            case "ºF":
                resultado = (Double.parseDouble(grado.replace("ºF", " ")) - 32) * 5 / 9;
                return String.valueOf(resultado) + " ºC";
            case "ºC":
                resultado = (Double.parseDouble(grado.replace("ºC", " ")) * 9 / 5) + 32;
                return String.valueOf(resultado) + " ºF";
            default:
                return "Error";
        }
    }
}

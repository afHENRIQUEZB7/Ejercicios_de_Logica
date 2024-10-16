package practica;

/*
 * Crea un programa que analice texto y obtenga:
 * - Número total de palabras.
 * - Longitud media de las palabras.
 * - Número de oraciones del texto (cada vez que aparecen un punto).
 * - Encuentre la palabra más larga.
 *
 * Todo esto utilizando un único bucle.
 */
public class Ejercicio64 {

    public static void main(String[] args) {
        String texto = "Jesucristo es el señor por los siglos de los siglos ¡AMÉÉÉÉN!. "
                + "Cristo es mi salvador a él sea la gloria por siempre.";
        
        calcularString(texto);
        
        System.out.println("");
        
        calcularString("El rápido zorro marrón salta sobre el perro perezoso. Es una frase de prueba con varias palabras y oraciones.");
    }

    private static void calcularString(String texto) {

        // Sacamos el numero de palabras
        String array[] = texto.split(" ");

        int longitudMedia = 0;
        int numOraciones = 0;
        int contPalabraLarga = 0;
        String palabraLarga = "";

        for (int i = 0; i < array.length; i++) {
            //Sumar la longitud de cada palabra para sacar la longitud
            longitudMedia += array[i].length();

            //Mirar cuantas oraciones tiene el texto
            if (array[i].substring(array[i].length()-1).equals(".")) {
                numOraciones++;
            }
            
            //Encontrara la palabra más larga
            if (array[i].length() > contPalabraLarga) {
                palabraLarga = array[i];
                contPalabraLarga = array[i].length();
            }
        }
        
        // Imprimimos resultados
        
        // Numero total de palabra
        System.out.println("El numero total de palabras del texto es: " + array.length);
        
        // Calculamos la longitud media de cada palabra
        System.out.println("La longitud media es: " + longitudMedia/array.length);
        
        // Mostrar el numero de oraciones del texto
        System.out.println("El numero de oraciones es: " + numOraciones);
        
        // Mostrar la palabra más larga
        System.out.println("La palabra más larga que contiene el texto es: " + palabraLarga);
    }
    
    
    // SOLUCION REALIZADA POR CHATGPT
    
//    public static void main(String[] args) {
//        String texto = "Jesucristo es el señor por los siglos de los siglos ¡AMÉÉÉÉN!. "
//                + "Cristo es mi salvador a él sea la gloria por siempre.";
//
//        calcularString(texto);
//
//        System.out.println("");
//
//        calcularString("El rápido zorro marrón salta sobre el perro perezoso. Es una frase de prueba con varias palabras y oraciones.");
//    }
//
//    private static void calcularString(String texto) {
//        // Sacamos las palabras removiendo signos de puntuación
//        String palabras[] = texto.split("\\s+");
//        int numPalabras = 0;
//        int longitudTotal = 0;
//        int numOraciones = 0;
//        String palabraLarga = "";
//
//        for (String palabra : palabras) {
//            // Removemos signos de puntuación de las palabras
//            String palabraLimpia = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");
//
//            // Contamos palabras válidas
//            if (!palabraLimpia.isEmpty()) {
//                numPalabras++;
//                longitudTotal += palabraLimpia.length();
//
//                // Encontrar la palabra más larga
//                if (palabraLimpia.length() > palabraLarga.length()) {
//                    palabraLarga = palabraLimpia;
//                }
//            }
//
//            // Contar oraciones basadas en los puntos
//            if (palabra.endsWith(".")) {
//                numOraciones++;
//            }
//        }
//
//        // Imprimimos resultados
//        // Numero total de palabras
//        System.out.println("El número total de palabras del texto es: " + numPalabras);
//
//        // Calculamos la longitud media de cada palabra
//        System.out.println("La longitud media es: " + (numPalabras > 0 ? (double) longitudTotal / numPalabras : 0));
//
//        // Mostrar el número de oraciones del texto
//        System.out.println("El número de oraciones es: " + numOraciones);
//
//        // Mostrar la palabra más larga
//        System.out.println("La palabra más larga que contiene el texto es: " + palabraLarga);
//    }
}

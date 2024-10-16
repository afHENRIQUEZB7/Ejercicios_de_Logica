/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa que realize el cifrado César de un texto y lo imprima.
 * También debe ser capaz de descifrarlo cuando así se lo indiquemos.
 *
 * Te recomiendo que busques información para conocer en profundidad cómo
 * realizar el cifrado. Esto también forma parte del reto.
 */
public class Ejercicio68 {

    private static final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) {
        String palabra = "Jesucristo es el señor  z";
        int desplazamiento = 10030;
        System.out.println("La palabra " + palabra + " en el cifrado cesar es: " + cifrarCesar(palabra, desplazamiento));

        String palabra2 = "VQFHOEUFGB QF QX FQABE  M";

        System.out.println("La palabra " + palabra2 + " decifrada cesar es: " + decifrarCesar(palabra2, desplazamiento));

    }

    private static String cifrarCesar(String palabra, int desplazamiento) {

        return cifrar(palabra, desplazamiento);

    }

    private static String decifrarCesar(String palabra, int desplazamiento) {
        return decifrar(palabra, desplazamiento);
    }

    private static String cifrar(String palabra, int desplazamiento) {

        // Validar que el desplazamiento no sea mayor que el arreglo del alfabeto
        char palabraChar[] = palabra.toUpperCase().toCharArray();

        for (int i = 0; i < palabraChar.length; i++) {

            for (int j = 0; j < alfabeto.length; j++) {
                if (palabraChar[i] == alfabeto[j]) {
                    // Verificamos la cantidad que se va a mover para hacer la respectiva encryptación
                    int posicion = (j + desplazamiento < alfabeto.length) ? j + desplazamiento : (j + desplazamiento) - (alfabeto.length);
                    if (j == 26) {
                        System.out.println("hola");
                    }
                    while (posicion >= alfabeto.length) {
                        posicion -= alfabeto.length;
                    }
                    palabraChar[i] = alfabeto[posicion];
//                    posicion = 0;
                    break;
                }
            }
        }

        return String.valueOf(palabraChar);
    }

    private static String decifrar(String palabra, int desplazamiento) {

        char palabraChar[] = palabra.toCharArray();

        for (int i = 0; i < palabraChar.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (palabraChar[i] == alfabeto[j]) {
                    int posicion = (j - desplazamiento > 0) ? j - desplazamiento : (j - desplazamiento) + (alfabeto.length);
                    while(posicion < 0 ){
                        posicion += alfabeto.length;
                    }
                    palabraChar[i] = alfabeto[posicion];
                    break;
                }
            }
        }

        return String.valueOf(palabraChar);
    }
    
    // SOLUCION MEJORADA POR CHATGPT
    
//    private static final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P',
//        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//
//    public static void main(String[] args) {
//        String palabra = "Jesucristo es el señor z";
//        int desplazamiento = 10030;
//        System.out.println("La palabra \"" + palabra + "\" en el cifrado César es: " + cifrarCesar(palabra, desplazamiento));
//
//        String palabra2 = "VQFHOEUFGB QF QX FQABE M";
//        System.out.println("La palabra \"" + palabra2 + "\" descifrada en César es: " + decifrarCesar(palabra2, desplazamiento));
//    }
//
//    private static String cifrarCesar(String palabra, int desplazamiento) {
//        return cifrar(palabra, desplazamiento);
//    }
//
//    private static String decifrarCesar(String palabra, int desplazamiento) {
//        return cifrar(palabra, -desplazamiento); // Usamos cifrar con desplazamiento negativo para descifrar
//    }
//
//    private static String cifrar(String palabra, int desplazamiento) {
//        // Normalizamos el desplazamiento al tamaño del alfabeto
//        desplazamiento = (desplazamiento % alfabeto.length + alfabeto.length) % alfabeto.length;
//
//        char[] palabraChar = palabra.toUpperCase().toCharArray();
//
//        for (int i = 0; i < palabraChar.length; i++) {
//            for (int j = 0; j < alfabeto.length; j++) {
//                if (palabraChar[i] == alfabeto[j]) {
//                    // Calculamos la nueva posición con el desplazamiento
//                    int posicion = (j + desplazamiento) % alfabeto.length;
//                    palabraChar[i] = alfabeto[posicion];
//                    break;
//                }
//            }
//        }
//
//        return String.valueOf(palabraChar);
//    }
}

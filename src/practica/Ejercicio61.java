/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/*
 * Crea un pequeño juego que consista en adivinar palabras en un número máximo de intentos:
 * - El juego comienza proponiendo una palabra aleatoria incompleta
 *   - Por ejemplo "m_ur_d_v", y el número de intentos que le quedan
 * - El usuario puede introducir únicamente una letra o una palabra (de la misma longitud que
 *   la palabra a adivinar)
 *   - Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta
 *     uno al número de intentos
 *   - Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno
 *     al número de intentos
 *   - Si el contador de intentos llega a 0, el jugador pierde
 * - La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar
 *   ocultando más del 60%
 * - Puedes utilizar las palabras que quieras y el número de intentos que consideres
 */
public class Ejercicio61 {

    private static Scanner af = new Scanner(System.in);

    public static void main(String[] args) {

        String arrayPlabra[] = {"Jesucristo te ama", "Jesucristo es el senor", "Gloria a Dios", "YO SOY EL QUE SOY"};

        int intentos = 0;

        int inicio = 0;

        System.out.println("Bienvenido al juego de palabras");
        String palabra = "";
        String muestra = "";

        boolean continuar = true;

        // Iniciamos el ciclo para empezar el juego
        do {

            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");

            if (inicio == 0) {
                int palabraAletoria = (int) (Math.random() * arrayPlabra.length);
                palabra = arrayPlabra[palabraAletoria].toUpperCase();
//                palabra = arrayPlabra[1].toUpperCase();
                muestra = descontarPalabra(palabra);
                intentos = (palabra.replace(" ", "").length() * 50 / 100) + 2;
                System.out.println("la palabra que te toco es:  " + "\033[0;36m" + muestra + "\033[0m" );
                System.out.println("Tienes " + intentos + " intentos para poder tratar de adivinar la frase");
                inicio++;
            }

            // Verificar si el usuario se quedo sin intentos
            if (intentos == 0) {
                System.out.println("Has superado el limite de intentos");
                System.out.println("La frase era: " + palabra);
                System.out.println("NO TE RINDAS, VUELVE A INTENTARLO OTRA VEZ");

                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

                // Preguntamos al usuario si desea continuar jugando
                System.out.println("Desea seguir jugando marque y/n");

                String continuarJuego = af.nextLine().toLowerCase();

                switch (continuarJuego.charAt(0)) {
                    case 'y':
                        // reiniciamos el inicio para volver a sacar una nueva palabra;
                        inicio = 0;
                        continue;
                    case 'n':
                        System.out.println("Muchas gracias por utilizar nuestor juego".toUpperCase());
                        continuar = false;
                        break;
                    default:
                        System.out.println("Ingresa bien los datos");
                        continue;
                }
            }

            // Verificar si la palabra siempre se  completo para dar por termindo el juego
            if (muestra.equals(palabra)) {
                System.out.println("Felicidades terminaste con exito completando la frase");
                System.out.println("La frase era: " + "\033[0;36m" + muestra + "\033[0m" );
                System.out.println("Terminaste con " + intentos + " intentos de sobra");
                // reiniciamos el inicio para volver a sacar una nueva palabra;
                inicio = 0;

                // Preguntamos al usuario si desea continuar jugando
                System.out.println("Desea seguir jugando marque y/n");
                String continuarJuego = af.nextLine().toLowerCase();

                switch (continuarJuego.charAt(0)) {
                    case 'y':
                        continue;
                    case 'n':
                        System.out.println("Muchas gracias por utilizar nuestor juego".toUpperCase());
                        continuar = false;
                        break;
                    default:
                        System.out.println("Ingresa bien los datos");
                        continue;
                }
            }

            // Validar si el juego continua o no
            if (continuar) {
                System.out.println("¿ Desea completar la frase con una letra o quieres completar la palabra completa ? Ingrese: \n"
                        + "1. para completar por letra,\n"
                        + "2. para completar la frase por completo");

                String entrada = af.nextLine();

                if ((entrada.equals("1")) || (entrada.equals("2"))) {
                    switch (Integer.parseInt(entrada)) {
                        case 1:

                            String array[] = letra(palabra, muestra, intentos);
                            muestra = array[0];
                            intentos = Integer.parseInt(array[1]);

                            break;
                        case 2:
                            String array2[] = palabra(palabra, muestra, intentos);
                            muestra = array2[0];
                            intentos = Integer.parseInt(array2[1]);
                            break;
                        default:
                            System.out.println("Ingrese bien los campos");
                            continue;
                    }
                } else {
                    System.out.println("Ingrese bien los datos");
                    continue;
                }

            }

//            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
//            System.out.println("\n");
        } while (continuar);

    }

    public static String[] letra(String palabra, String muestra, int intentos) {

        String entrada;

        System.out.println("Ingrese la letra para completar la frase ---> " + "\033[0;36m" + muestra + "\033[0m" + " <---");
        entrada = af.nextLine().toUpperCase();
        System.out.println();

        char resultado[] = muestra.toCharArray();

        boolean correcto = false;

        for (int i = 0; i < palabra.length(); i++) {
            if (entrada.charAt(0) == palabra.charAt(i) && entrada.charAt(0) != muestra.charAt(i)) {
                resultado[i] = entrada.charAt(0);
                muestra = String.valueOf(resultado);
                correcto = true;
            } else {
                muestra = String.valueOf(resultado);
            }
        }

        intentos = (correcto) ? intentos : intentos - 1;

        System.out.println((correcto)
                ? "Bien hecho ahora la frase quedo:  " + muestra
                : "La letra que ingresaste no esta en la palabra a adivinar, la frase es: " + muestra);
        System.out.println("Te quedan " + intentos + " intentos");

        // LLenamos el array para enviarlo
        String array[] = {muestra, String.valueOf(intentos)};
        return array;

    }

    public static String[] palabra(String palabra, String muestra, int intentos) {

        System.out.println("La frase que va a completar es: " + "\033[0;36m" + muestra + "\033[0m" );
        System.out.println("Ingrese la posible solucion del texto");

        String texto = af.nextLine().toUpperCase();

        // Validar si la entrada  
        if (texto.equals(palabra)) {
            muestra = texto;

        } else {
            intentos--;
            System.out.println("Ingresaste mal el texto, vuelve a intentarlo");
            System.out.println("Te quedan " + intentos + " intentos");
        }

        // iniciar el array
        String array[] = {muestra, String.valueOf(intentos)};

        return array;
    }

    public static String descontarPalabra(String palabra) {

        int porcentanje = palabra.length() * 50 / 100;

        char separarPalabra[] = palabra.toCharArray();

        // Decontar la palbra hasta el 60%
        for (int i = 0; i < porcentanje; i++) {
            int random = (int) (Math.random() * palabra.length());
            if (palabra.charAt(random) != ' ') {
                separarPalabra[random] = '_';
//                muestra = muestra.replace(String.valueOf(muestra.charAt(random)), "_");
            }

        }

        return String.valueOf(separarPalabra).toUpperCase();
    }
    
    // SOLUCION DE CHATGPT MEJORANDO MI SOLUCION
    
    
//    private static Scanner af = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String[] arrayPalabra = {"Jesucristo te ama", "Jesucristo es el senor", "Gloria a Dios", "YO SOY EL QUE SOY"};
//        boolean continuar = true;
//
//        System.out.println("Bienvenido al juego de palabras");
//
//        while (continuar) {
//            String palabra = elegirPalabraAleatoria(arrayPalabra);
//            String muestra = descontarPalabra(palabra);
//            int intentos = calcularIntentos(palabra);
//
//            System.out.println("La palabra que te tocó es: " + "\033[0;36m" + muestra + "\033[0m");
//            System.out.println("Tienes " + intentos + " intentos para tratar de adivinar la frase");
//
//            boolean adivinada = false;
//
//            while (intentos > 0 && !adivinada) {
//                System.out.println("¿Desea completar la frase con una letra o quiere completar la palabra completa?");
//                System.out.println("1. Completar por letra");
//                System.out.println("2. Completar la frase completa");
//                String entrada = af.nextLine();
//
//                if (entrada.equals("1")) {
//                    String[] resultado = letra(palabra, muestra, intentos);
//                    muestra = resultado[0];
//                    intentos = Integer.parseInt(resultado[1]);
//                } else if (entrada.equals("2")) {
//                    String[] resultado = palabra(palabra, muestra, intentos);
//                    muestra = resultado[0];
//                    intentos = Integer.parseInt(resultado[1]);
//                } else {
//                    System.out.println("Ingrese bien los datos");
//                    continue;
//                }
//
//                if (muestra.equals(palabra)) {
//                    adivinada = true;
//                    System.out.println("¡Felicidades! Completaste la frase.");
//                    System.out.println("La frase era: " + "\033[0;36m" + muestra + "\033[0m");
//                    System.out.println("Terminaste con " + intentos + " intentos de sobra.");
//                } else if (intentos == 0) {
//                    System.out.println("Has superado el límite de intentos.");
//                    System.out.println("La frase era: " + palabra);
//                    System.out.println("NO TE RINDAS, VUELVE A INTENTARLO OTRA VEZ.");
//                }
//            }
//
//            System.out.println("¿Desea seguir jugando? (y/n)");
//            String continuarJuego = af.nextLine().toLowerCase();
//            if (!continuarJuego.equals("y")) {
//                continuar = false;
//                System.out.println("Muchas gracias por utilizar nuestro juego".toUpperCase());
//            }
//        }
//
//        af.close();
//    }
//
//    private static String elegirPalabraAleatoria(String[] arrayPalabra) {
//        int palabraAleatoria = (int) (Math.random() * arrayPalabra.length);
//        return arrayPalabra[palabraAleatoria].toUpperCase();
//    }
//
//    private static int calcularIntentos(String palabra) {
//        return (palabra.replace(" ", "").length() * 50 / 100) + 2;
//    }
//
//    public static String[] letra(String palabra, String muestra, int intentos) {
//        System.out.println("Ingrese la letra para completar la frase ---> " + "\033[0;36m" + muestra + "\033[0m");
//        String entrada = af.nextLine().toUpperCase();
//
//        char[] resultado = muestra.toCharArray();
//        boolean correcto = false;
//
//        for (int i = 0; i < palabra.length(); i++) {
//            if (entrada.charAt(0) == palabra.charAt(i) && muestra.charAt(i) == '_') {
//                resultado[i] = entrada.charAt(0);
//                correcto = true;
//            }
//        }
//
//        muestra = String.valueOf(resultado);
//        intentos = correcto ? intentos : intentos - 1;
//
//        System.out.println(correcto
//                ? "Bien hecho, ahora la frase es: " + muestra
//                : "La letra que ingresaste no está en la palabra a adivinar. La frase es: " + muestra);
//        System.out.println("Te quedan " + intentos + " intentos");
//
//        return new String[]{muestra, String.valueOf(intentos)};
//    }
//
//    public static String[] palabra(String palabra, String muestra, int intentos) {
//        System.out.println("La frase que va a completar es: " + "\033[0;36m" + muestra + "\033[0m");
//        System.out.println("Ingrese la posible solución del texto:");
//
//        String texto = af.nextLine().toUpperCase();
//
//        if (texto.equals(palabra)) {
//            muestra = texto;
//        } else {
//            intentos--;
//            System.out.println("Ingresaste mal el texto. Vuelve a intentarlo.");
//            System.out.println("Te quedan " + intentos + " intentos.");
//        }
//
//        return new String[]{muestra, String.valueOf(intentos)};
//    }
//
//    public static String descontarPalabra(String palabra) {
//        int porcentaje = palabra.replace(" ", "").length() * 50 / 100;
//        char[] separarPalabra = palabra.toCharArray();
//
//        for (int i = 0; i < porcentaje; i++) {
//            int random;
//            do {
//                random = (int) (Math.random() * palabra.length());
//            } while (separarPalabra[random] == ' ' || separarPalabra[random] == '_');
//            separarPalabra[random] = '_';
//        }
//
//        return String.valueOf(separarPalabra).toUpperCase();
//    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Random;
import java.util.Scanner;

/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
public class Ejercicio54 {

    public static void main(String[] args) {

        Scanner af = new Scanner(System.in);

        boolean activo = true, escrito = true;

        while (activo) {

            if (escrito) {
                System.out.println("La contraseña aleatoria es: " + generarContraseña());
            }

            System.out.println("¿ Desea genera una contraseña aleatoria ?\n"
                    + "Si marque Y. NO marque N");

            String entrada = af.nextLine();
            if (entrada.equals("n") || entrada.equals("N")) {
                activo = false;
            } else if (entrada.equals("y") || entrada.equals("Y")) {
                escrito = true;
                continue;
            } else {
                System.out.println("ingrese los datos nuevamente en la comprobacion");
                escrito = false;
            }

        }
    }

    private static String generarContraseña() {
        Random random = new Random();

        StringBuilder contrasena = new StringBuilder();
        int longitud = random.nextInt(9) + 8;
        System.out.println("longitud = " + longitud);
        for (int i = 0; i < longitud; i++) {
            int numero = (random.nextInt(122 - 33 + 1) + 33);
            char caracter = (char) numero;
            contrasena.append(String.valueOf(caracter));
        }
        return contrasena.toString();
    }

    // El que hizo CHAT GPT
    /*
    import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean activo = true;

        while (activo) {
            System.out.println("¿Desea generar una contraseña aleatoria? (y/n)");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("n")) {
                activo = false;
            } else if (entrada.equalsIgnoreCase("y")) {
                System.out.println("Ingrese la longitud de la contraseña (entre 8 y 16):");
                int longitud = Integer.parseInt(scanner.nextLine());

                System.out.println("¿Incluir letras mayúsculas? (y/n)");
                boolean incluirMayusculas = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("¿Incluir números? (y/n)");
                boolean incluirNumeros = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("¿Incluir símbolos? (y/n)");
                boolean incluirSimbolos = scanner.nextLine().equalsIgnoreCase("y");

                String contrasena = generarContraseña(longitud, incluirMayusculas, incluirNumeros, incluirSimbolos);
                System.out.println("La contraseña aleatoria es: " + contrasena);
            } else {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }
    }

    private static String generarContraseña(int longitud, boolean incluirMayusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

        StringBuilder conjuntoCaracteres = new StringBuilder(letrasMinusculas);
        if (incluirMayusculas) {
            conjuntoCaracteres.append(letrasMayusculas);
        }
        if (incluirNumeros) {
            conjuntoCaracteres.append(numeros);
        }
        if (incluirSimbolos) {
            conjuntoCaracteres.append(simbolos);
        }

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(conjuntoCaracteres.length());
            contrasena.append(conjuntoCaracteres.charAt(indiceAleatorio));
        }
        return contrasena.toString();
    }
}

     */
}

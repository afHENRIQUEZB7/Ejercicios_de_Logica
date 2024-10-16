/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);

        System.out.println("Acontinuacion se mostraran las areas respectivas de los datos para un Triangulo, Cuadrado y un Rectandulo");

        int entrada1, entrada2, resultado;
        boolean y = true;
        while (y) {
            System.out.println("De que quieres calcular el area \n"
                    + "1. Triangulo 2. Cuadrado 3. Rectangulo");
            int entrada = Integer.parseInt(af.nextLine());
            if (entrada == 1) {
                System.out.println("Ingrese la altura del Triangulo");
                entrada1 = Integer.parseInt(af.nextLine());
                System.out.println("Ingrese la base del Triangulo");
                entrada2 = Integer.parseInt(af.nextLine());
                resultado = calcularArea(entrada, entrada1, entrada2);
                System.out.println("El area del Triangulo es: " + resultado);
            } else if (entrada == 2) {
                System.out.println("Ingrese el LADO Nº1 del Cuadrado");
                entrada1 = Integer.parseInt(af.nextLine());
                System.out.println("Ingrese el LADO Nº2 del Cuadrado");
                entrada2 = Integer.parseInt(af.nextLine());
                resultado = calcularArea(entrada, entrada1, entrada2);
                System.out.println("El area del Cuadrado es: " + resultado);
            } else if (entrada == 3) {
                System.out.println("Ingrese el largo del Rectangulo");
                entrada1 = Integer.parseInt(af.nextLine());
                System.out.println("Ingrese el ancho  del Rectangulo");
                entrada2 = Integer.parseInt(af.nextLine());
                resultado = calcularArea(entrada, entrada1, entrada2);
                System.out.println("El area del Rectangulo es: " + resultado);
            } else {
                System.out.println("Vuelva a ingresar bien los datos");
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Desea seguir utilizando el programa\n"
                    + "Si. - No.");

            String r = af.nextLine();

            if (r.equalsIgnoreCase("no")|| r.equals("NO")) {
                System.out.println("Gracias por utilizar el servicio");
                y = false;
            }

            System.out.println("--------------------------------------------------");

        }

    }

    private static Integer calcularArea(int entrada, int entrada1, int entrada2) {
        if (entrada == 1) {
            return entrada1 * entrada2 / 2;
        } else if (entrada == 2) {
            return entrada1 * entrada2;
        } else {
            return entrada1 * entrada2;
        }
    }
}

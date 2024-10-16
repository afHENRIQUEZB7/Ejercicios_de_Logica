/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 * - EXTRA: ¿Eres capaz de dibujar más figuras?
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 1; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else if (i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");

        }

        System.out.println("");
        
        
        // Hecho por chatgpt

        int height = 5; // Altura del triángulo
        for (int i = 1; i <= height; i++) {
            // Imprimir espacios en blanco antes del primer asterisco
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            // Imprimir el borde del triángulo
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Imprimir asteriscos en los bordes del triángulo
                if (k == 1 || k == (2 * i - 1) || i == height) {
                    System.out.print("*");
                } else {
                    // Imprimir espacios en el interior del triángulo
                    System.out.print(" ");
                }
            }
            // Pasar a la siguiente línea después de cada fila
            System.out.println();
        }

        System.out.println("");
    }
    
    
    
    
    /* 
    NOTA: Codigo hecho por el repositorio 
    
     */
 /*
    public static void main(String[] args) {
        drawPolygon(10, PolygonType.SQUARE);
        drawPolygon(15, PolygonType.TRIANGLE);
        drawPolygon(12, PolygonType.DIAMOND);
    }

    private enum PolygonType {
        SQUARE, TRIANGLE, DIAMOND
    }

    private static void drawPolygon(int size, PolygonType type) {
        if (size < 2) {
            System.out.println("El tamaño debe ser mayor a 1");
            return;
        }

        int totalSize = size;
        if (type == PolygonType.DIAMOND) {
            totalSize *= 2;
        }

        for (int value = 1; value <= totalSize; value++) {
            switch (type) {
                case SQUARE:
                    System.out.println(repeat("* ", totalSize));
                    break;
                case TRIANGLE:
                    System.out.println(repeat("* ", value));
                    break;
                case DIAMOND:
                    if (value <= size) {
                        System.out.println(repeat("* ", value));
                    } else {
                        System.out.println(repeat("  ", value - size) + repeat("* ", totalSize - value));
                    }
                    break;
            }
        }

        System.out.println();
    }

    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
     */
}

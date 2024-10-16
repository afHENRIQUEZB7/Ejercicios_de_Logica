/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        int dias = 7,  horas = 7,  minutos = 7,  segundos= 7;
        
        long milisegundos = conteo(dias,horas,minutos, segundos);
        
        System.out.println("El tiempo en milisegundos convertido de "+ dias + " dias " + horas + " horas "
                + minutos + " minutos " + segundos + " segundos es: " + milisegundos);
        
        
    }
    
    private static long conteo(int dias, int horas, int minutos, int segundos){
        long milisegundos = 0;
        // multiplicamos los dias, horas, minutos, segundos por el tiempo equivalente a milisegundos.
        milisegundos = dias * 86400000 + horas * 3600000 + minutos * 60000 + segundos * 6000; 
        return milisegundos;
    }
}

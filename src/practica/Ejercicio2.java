/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
Incrementar N en 77.
Decrementarla en 3.
Duplicar su valor.
Si por ejemplo N = 1 la salida del programa será:
Valor inicial de N = 1                                                                  
N + 77 = 78                                                                                                       
N - 3 = 75                                                                                                        
N * 2 = 150

*/
public class Ejercicio2 {
    public static void main(String[] args) {
        int N = 1;
        System.out.println("Valor incial de N = " + N);
        N += 77;
        System.out.println("N + 77 = "+ N );
        N -=3;
        System.out.println("N - 3 = " + N);
        N *= 2;
        System.out.println("N * 2 = "+ N);
    }
}

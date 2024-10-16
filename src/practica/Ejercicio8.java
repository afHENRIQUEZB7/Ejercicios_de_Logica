/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
  Ejercicio hecho de la pagina Project Euler, el de sacar la diferencia de suma cuadrada

La suma de los cuadrados de los diez primeros números naturales es:

                            1^2 +2^2 + ..... + 10^2 = 385.

El cuadrado de la suma de los primeros diez números naturales es,

                            (1+2+......+10)^2 = 55^2 = 3025.

Por tanto, la diferencia entre la suma de los cuadrados de los primeros diez números naturales y el cuadrado de la suma es
                             3025 - 385 = 2640.

Encuentra la diferencia entre la suma de los cuadrados de los primeros cien números naturales y el cuadrado de la suma.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int suma1 = 0, suma2 = 0, cont1 = 0, cont2 = 0, diferencia ;
        
        while(cont1<100){
            ++cont1;
            suma1 += cont1*cont1;
        }
        
        while(cont2 < 100){
            ++cont2;
            suma2 += cont2;
        }
        
        diferencia = (suma2*suma2) - suma1;
        
        System.out.println("la suma: "+ diferencia);
          
        
        
    }
}

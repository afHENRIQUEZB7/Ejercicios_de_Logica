/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Dado un listado de números, encuentra el SEGUNDO más grande
 */
public class Ejercicio38 {

    public static void main(String[] args) {
        int listado[] = {2, 6, 5, 7, 10,12,24};

        int mayor = 0, segundoMayor = 0, menor = Integer.MAX_VALUE, segundoMenor = Integer.MAX_VALUE;

        for (int i = 0; i < listado.length; i++) {
            if (mayor < listado[i]) {
                segundoMayor = mayor;
                mayor = listado[i];
            }
            
//            if (i==0) {
//                menor = menor=listado[i];
//            }
            if (listado[i]<menor) {
                segundoMenor = menor;
                menor=listado[i];
            }else if (listado[i] > menor && listado[i] < segundoMenor) {
                segundoMenor = listado[i];
            }
//            else
//            menor = listado[i];
        }
        
        System.out.println("El segundo mayor es: " + segundoMayor);
         System.out.println("El menor es: " + segundoMenor);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/*
Crea un programa que tenga un arreglo con nombres completos de personas. Ademas, debe permitir reealizar una búsqueda pro el nombre de la persona
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner af = new Scanner(System.in);

        String arreglo[] = {"Sofia Andrade", "Tomas", "Andrea", "Matias", "Alexander", "Gabriela"};
        String entrada;

        boolean busqueda = false, f = true;
        do {
            System.out.println("Ingrese el nombre de la persona que desea buscar");
            entrada = af.nextLine();

            for (String l : arreglo) {
                if (entrada.equalsIgnoreCase(l)) {
                    busqueda = true;
                    break;
                }
            }
            
            System.out.println((busqueda) ? "El nombre se encuentra en el arreglo" : "el nombre no se encuentra");
            
            System.out.println("Desea buscar otro nombre\n"
                    + "Ingrese Y para Si. y  N para No.");
            
             char e = af.nextLine().charAt(0);
            if (e=='n' || e =='N') {
                System.out.println("Esta seguro de lo que esta realizando SI o NO");
                String L = af.nextLine();
                if(L.equals("no") || L.equals("NO")){
                    f = false;
                };
            } 
            
            
        } while (f);

        
        System.out.println("Gracias por utilizar el sistema");

        
    }
}

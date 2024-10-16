/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;

/*
    2520 es el número más pequeño que se puede dividir por cada uno de los números de 1 a 10 sin ningún resto.

    ¿Cuál es el número positivo más pequeño que es? divisiblepor todos los números de 1 a 20?
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            if (i%1==0 && i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 && i%10==00 
                    && i%11==00 && i%12==00 && i%13==00 && i%14==00 && i%15==00 && i%16==00 && i%17==00 && i%18==00 && i%19==00 && i%20==0) {
                res.add(i);
            }
        }
        
        for(Integer d : res){
            System.out.println(d);
        }
    }
}

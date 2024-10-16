/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.Random;

/*
 * Este es un Reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 * o Trato" y un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará arrayDulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos arrayDulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 * - En caso contrario retornará un error.
 */
public class Ejercicio46 {

    public static void main(String[] args) {
        // LLenamos la lista con los objetos de persona
        ArrayList<Personas> list = new ArrayList<>();

        list.add(new Personas("Karla", 7, "137 cm"));
        list.add(new Personas("Juan Carlos", 12, "161 cm"));
        list.add(new Personas("Esteban", 9, "143 cm"));
        list.add(new Personas("Maria Alejandra", 11, "155 cm"));
        list.add(new Personas("Sandra Petricia", 7, "135 cm"));

        String p = "Juan Carlos";

        System.out.println(p.replace(" ", "").length());
        sorpresa(Reto.TRATO, list);

    }

    private static void sorpresa(Reto reto, ArrayList<Personas> list) {
        int contSustos = 0;
        int contDulces = 0;
        int totalHeight = 0;
        switch (reto) {
            case TRUCO:
                for (Personas personas : list) {
                    totalHeight += Integer.parseInt(personas.altura.replace(" cm", ""));
                }

                for (Personas personas : list) {
                    // Un susto por cada 2 letras del nombre por persona
                    contSustos += personas.nombre.replace(" ", "").length() / 2;
                    // Dos sustos por cada edad que sea un número par
                    contSustos += (personas.edad % 2 == 0) ? 2 : 0;
                }

                // Tres sustos por cada 100 cm de altura entre todas las personas
                contSustos += (totalHeight / 100) * 3;

                String arraySustos[] = {"🎃", "👻", "💀", "🕷", "🕸", "🦇"};
                System.out.println("La cantidad de sustos son: " + contSustos);

                System.out.println("Sustos");

                for (int i = 0; i < contSustos; i++) {
                    int randon = (int) (Math.random() * arraySustos.length);
                    System.out.print(arraySustos[randon] + " ");
                }
                break;
            case TRATO:
                for (Personas personas : list) {
                    // Un dulce por cada letra de nombre
                    contDulces += personas.nombre.replace(" ", "").length();
                    // Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
                    contDulces += Math.min(personas.edad / 3, 10);
                    // Dos arrayDulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
                    contDulces += (Integer.parseInt(personas.altura.replace(" cm", "")) >= 50 || Integer.parseInt(personas.altura.replace(" cm", "")) <= 150) ? 2 : 0;
                }

                String[] arrayDulces = {"🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩"};

                for (int i = 0; i < contDulces; i++) {
                    int rando = (int) (Math.random() * arrayDulces.length);
                    System.out.print(arrayDulces[rando] + " ");
                }

                break;

            default:
                System.out.println("Revise bien el reto ha ingresado");
        }
    }

    enum Reto {
        TRUCO,
        TRATO,
        END
    }

    static class Personas {

        private String nombre;
        private int edad;
        private String altura;

        public Personas() {
        }

        public Personas(String nombre, int edad, String altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getAltura() {
            return altura;
        }

        public void setAltura(String altura) {
            this.altura = altura;
        }

    }
}

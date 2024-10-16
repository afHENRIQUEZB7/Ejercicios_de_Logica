/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.HashMap;
import java.util.Map;

/*
 * ¡La Tierra Media está en guerra! En ella lucharán razas leales
 * a Sauron contra otras bondadosas que no quieren que el mal reine
 * sobre sus tierras.
 * Cada raza tiene asociado un "valor" entre 1 y 5:
 * - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3),
 *   Númenóreanos (4), Elfos (5)
 * - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2),
 *   Huargos (3), Trolls (5)
 * Crea un programa que calcule el resultado de la batalla entre
 * los 2 tipos de ejércitos:
 * - El resultado puede ser que gane el bien, el mal, o exista un empate.
 *   Dependiendo de la suma del valor del ejército y el número de integrantes.
 * - Cada ejército puede estar compuesto por un número de integrantes variable
 *   de cada raza.
 * - Tienes total libertad para modelar los datos del ejercicio.
 * Ej: 1 Peloso pierde contra 1 Orco
 *     2 Pelosos empatan contra 1 Orco
 *     3 Pelosos ganan a 1 Orco
 */
public class Ejercicio40 {

    public static void main(String[] args) {
        // LLenar los ejerciotos de cada batallon
        // Raza bondadosa
        Map<String, Integer> bondadosa = razaBondadosa();
        // Raza malvada
        Map<String, Integer> malvada = razaMalvada();

        int totalBuena = totalEjercitoBueno(bondadosa);
        int totalMala = totalEjercitoMalo(malvada);

//        System.out.println("Ejercito bueno: " + totalBuena);
//        System.out.println("Ejercito malo: " + totalMala);
        System.out.println("El equipo que gano fue: " + ((totalBuena > totalMala) ? "Raza bondadosa" : "Raza malvada"));

    }

    private static Map<String, Integer> razaBondadosa() {
        Map<String, Integer> bondadosa = new HashMap<>();

        bondadosa.put("Pelosos", 1);
        bondadosa.put("Sureños buenos", 1);
        bondadosa.put("Enanos", 1);
        bondadosa.put("Númenóreanos", 1);
        bondadosa.put("Elfos", 1);

        return bondadosa;
    }

    private static Map<String, Integer> razaMalvada() {
        Map<String, Integer> malvada = new HashMap<>();

        malvada.put("Sureños malos", 1);
        malvada.put("Orcos", 1);
        malvada.put("Goblins", 1);
        malvada.put("Huargos", 1);
        malvada.put("Trolls", 1);

        return malvada;
    }

    private static int totalEjercitoBueno(Map<String, Integer> bondadosa) {
        int sumatoriaEjercito = 0;

        for (Map.Entry<String, Integer> resultado : bondadosa.entrySet()) {
            switch (resultado.getKey()) {
                case "Pelosos":
                    sumatoriaEjercito += resultado.getValue() * 1;
                    break;
                case "Sureños buenos":
                    sumatoriaEjercito += resultado.getValue() * 2;
                    break;
                case "Enanos":
                    sumatoriaEjercito += resultado.getValue() * 3;
                    break;
                case "Númenóreanos":
                    sumatoriaEjercito += resultado.getValue() * 4;
                    break;
                case "Elfos":
                    sumatoriaEjercito += resultado.getValue() * 5;
                    break;
                default:
                    sumatoriaEjercito = 0;
            }
        }
        return sumatoriaEjercito;
    }

    private static int totalEjercitoMalo(Map<String, Integer> malvada) {
        int sumatoriaEjercito = 0;

        for (Map.Entry<String, Integer> resultado : malvada.entrySet()) {
            switch (resultado.getKey()) {
                case "Sureños malos":
                    sumatoriaEjercito += resultado.getValue() * 2;
                    break;
                case "Orcos":
                    sumatoriaEjercito += resultado.getValue() * 2;
                    break;
                case "Goblins":
                    sumatoriaEjercito += resultado.getValue() * 2;
                    break;
                case "Huargos":
                    sumatoriaEjercito += resultado.getValue() * 3;
                    break;
                case "Trolls":
                    sumatoriaEjercito += resultado.getValue() * 5;
                    break;
                default:
                    sumatoriaEjercito = 0;
            }
        }
        return sumatoriaEjercito;
    }

    // Solucion de CHATGPT
    /*
    
     public static void main(String[] args) {
        // Ejemplo de ejércitos
        Map<RazaBondadosa, Integer> ejercitoBondadoso = new HashMap<>();
        ejercitoBondadoso.put(RazaBondadosa.PELOSOS, 1);
        ejercitoBondadoso.put(RazaBondadosa.SURENOS_BUENOS, 2);
        ejercitoBondadoso.put(RazaBondadosa.ENANOS, 3);
        ejercitoBondadoso.put(RazaBondadosa.NUMENOREANOS, 1);
        ejercitoBondadoso.put(RazaBondadosa.ELFOS, 1);

        Map<RazaMalvada, Integer> ejercitoMalvado = new HashMap<>();
        ejercitoMalvado.put(RazaMalvada.SURENOS_MALOS, 1);
        ejercitoMalvado.put(RazaMalvada.ORCOS, 1);
        ejercitoMalvado.put(RazaMalvada.GOBLINS, 1);
        ejercitoMalvado.put(RazaMalvada.HUARGOS, 1);
        ejercitoMalvado.put(RazaMalvada.TROLLS, 1);

        int totalBondadoso = calcularTotalBondadoso(ejercitoBondadoso);
        int totalMalvado = calcularTotalMalvado(ejercitoMalvado);

        System.out.println("El ejército bondadoso tiene un total de: " + totalBondadoso);
        System.out.println("El ejército malvado tiene un total de: " + totalMalvado);

        if (totalBondadoso > totalMalvado) {
            System.out.println("El ejército bondadoso gana.");
        } else if (totalBondadoso < totalMalvado) {
            System.out.println("El ejército malvado gana.");
        } else {
            System.out.println("Es un empate.");
        }
    }

    private static int calcularTotalBondadoso(Map<RazaBondadosa, Integer> ejercito) {
        return ejercito.entrySet().stream().mapToInt(entry -> entry.getKey().valor * entry.getValue()).sum();
    }

    private static int calcularTotalMalvado(Map<RazaMalvada, Integer> ejercito) {
        return ejercito.entrySet().stream().mapToInt(entry -> entry.getKey().valor * entry.getValue()).sum();
    }
}

enum RazaBondadosa {
    PELOSOS(1), SURENOS_BUENOS(2), ENANOS(3), NUMENOREANOS(4), ELFOS(5);

    int valor;

    RazaBondadosa(int valor) {
        this.valor = valor;
    }
}

enum RazaMalvada {
    SURENOS_MALOS(2), ORCOS(2), GOBLINS(2), HUARGOS(3), TROLLS(5);

    int valor;

    RazaMalvada(int valor) {
        this.valor = valor;
    }
    
    
     */
}

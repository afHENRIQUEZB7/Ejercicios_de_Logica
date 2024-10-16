/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */



/*
    *Heterograma
        Un heterograma es una palabra o frase en la que no se repite ninguna letra.

        Ejemplo:

        Palabra: "murciélago"
        Frase: "the quick brown fox"

    *Isograma

        Un isograma es una palabra o frase en la que cada letra aparece el mismo número de veces.

        Ejemplo:

        Palabra: "deified" (cada letra aparece una vez)
        Palabra: "nonprofit" (cada letra aparece exactamente una vez)

    *Pangrama

        Un pangrama es una frase que contiene todas las letras del alfabeto al menos una vez.

        Ejemplo:

        Frase: "The quick brown fox jumps over the lazy dog"
        Frase (en español): "El veloz murciélago hindú comía feliz cardillo y kiwi"
*/
public class Ejercicio57 {

    public static void main(String[] args) {
        
        System.out.println(heterograna("murciélago"));
        System.out.println(heterograna("the quick brown fox"));
        System.out.println();

        System.out.println(isograma("deified"));
        System.out.println(isograma("nonprofit"));
        System.out.println(isograma("Dialogue"));
        System.out.println();

        System.out.println(pangrama("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangrama("El veloz murciélago hindú comía feliz cardillo y kiwi"));

    }

    public static String heterograna(String texto) {
        boolean heterograna = false;
        String array[] = texto.split(" ");
        for (String object : array) {
            for (int i = 0; i < object.toCharArray().length; i++) {
                for (int j = i + 1; j < object.toCharArray().length; j++) {
                    if (object.charAt(i) != object.charAt(j)) {
                        heterograna = true;
                    } else {
                        heterograna = false;
                    }
                }
            }
        }
        return (heterograna) ? "La palabra " + texto + " es un heterograma" : "La palabra " + texto + " no es un heterograma";
    }

    private static String isograma(String texto) {

        boolean isograma = false;

        String array1[] = texto.split(" ");

        int cont = 0;
        for (String resultado : array1) {
            for (int i = 0; i < resultado.toCharArray().length; i++) {
                for (int j = i + 1; j < resultado.toCharArray().length; j++) {
                    if (resultado.charAt(i) == resultado.charAt(j) && cont<=0) {
                        isograma = true;
                        cont++;
                    }

                }
                
                cont = 0;
            }
        }

        return (isograma) ? "El texto ***" + texto + "*** es un ISOGRAMA" : "El texto ***" + texto + "*** no es un ISOGRAMA";
    }

    private static String pangrama(String texto) {

        boolean pangrama = false;

        char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        String textoTest = texto.replaceAll(" ", "").toUpperCase();

        for (int i = 0; i < alfabeto.length; i++) {

            for (int j = 0; j < textoTest.length(); j++) {
                if (alfabeto[i] == textoTest.charAt(j)) {
                    pangrama = true;
                    break;
                }else{
                    pangrama = false;
                }
            }
        }

        return (pangrama) ? "El texto: ***" + texto + "*** es un  Pangrama." : "El texto: ***" + texto + "*** no es un  Pangrama.";
    }

}

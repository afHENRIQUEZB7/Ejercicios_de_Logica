/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Crea una función que sea capaz de encriptar y desencriptar texto
 * utilizando el algoritmo de encriptación de Karaca
 * (debes buscar información sobre él).
 */
public class Ejercicio51 {

    public static void main(String[] args) {
        String cadena = "apple";
        String cadena2 = "1lpp0aca";

        encriptar(cadena);

        desEncriptar(cadena2);

    }

    private static void encriptar(String cadena) {
        String invertido = new StringBuilder(cadena).reverse().toString().toLowerCase();

        StringBuilder convertir = new StringBuilder();

        for (int i = 0; i < invertido.length(); i++) {
            switch (invertido.charAt(i)) {
                case 'a':
                    convertir.append(ENCRYP.a.valor);
                    break;
                case 'e':
                    convertir.append(ENCRYP.e.valor);
                    break;
                case 'i':
                    convertir.append(ENCRYP.i.valor);
                    break;
                case 'o':
                    convertir.append(ENCRYP.o.valor);
                    break;
                case 'u':
                    convertir.append(ENCRYP.u.valor);
                    break;
                default:
                    convertir.append(invertido.charAt(i));
                    break;
            }
        }

        convertir.append("aca");

        System.out.println("Encryptacion de " + cadena + " es en KARACA es: " + convertir.toString());
    }

    private static void desEncriptar(String cadena2) {
        String texto = cadena2;
        StringBuilder convertir = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case '0':
                    convertir.append(DESENCRYP.CERO.valor);
                    break;
                case '1':
                    convertir.append(DESENCRYP.UNO.valor);
                    break;
                case '2':
                    convertir.append(DESENCRYP.DOS.valor);
                    break;
                case '3':
                    convertir.append(DESENCRYP.TRES.valor);
                    break;
                case '4':
                    convertir.append(DESENCRYP.CUATRO.valor);
                    break;
                default:
                    convertir.append(cadena2.charAt(i));
                    break;
            }
        }
        
        
        System.out.println("EL texto "+ cadena2 +" desencryptado es: " + convertir.reverse().toString().replace("aca", ""));

    }

    enum ENCRYP {
        a(0),
        e(1),
        i(2),
        o(3),
        u(4);

        int valor;

        ENCRYP(int valor) {
            this.valor = valor;
        }
    }

    enum DESENCRYP {
        CERO("a"),
        UNO("e"),
        DOS("i"),
        TRES("o"),
        CUATRO("u");

        private String valor;

        DESENCRYP(String valor) {
            this.valor = valor;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */


public class Ejercicio53 {
    public static void main(String[] args) {
        System.out.println("el texto leet en lenguaje hacker es: "+ convertirHacker("leet"));
        System.out.println("el texto leet en lenguaje hacker es: "+ convertirHacker("Aquí está un texto de prueba para ver si funciona el reto!"));
    }

    private static String convertirHacker(String palabra) {
        
        StringBuilder palabraHacker = new StringBuilder();
        
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.toUpperCase().charAt(i)) {
                case 'A':
                    palabraHacker.append(ALFABETO.A.valor);
                    break;
                    case 'B':
                    palabraHacker.append(ALFABETO.B.valor);
                    break;
                case 'C':
                    palabraHacker.append(ALFABETO.C.valor);
                    break;
                case 'D':
                    palabraHacker.append(ALFABETO.D.valor);
                    break;
                case 'E':
                    palabraHacker.append(ALFABETO.E.valor);
                    break;
                case 'F':
                    palabraHacker.append(ALFABETO.F.valor);
                    break;
                case 'G':
                    palabraHacker.append(ALFABETO.G.valor);
                    break;
                case 'H':
                    palabraHacker.append(ALFABETO.H.valor);
                    break;
                case 'I':
                    palabraHacker.append(ALFABETO.I.valor);
                    break;
                case 'J':
                    palabraHacker.append(ALFABETO.J.valor);
                    break;
                case 'K':
                    palabraHacker.append(ALFABETO.K.valor);
                    break;
                case 'L':
                    palabraHacker.append(ALFABETO.L.valor);
                    break;
                case 'M':
                    palabraHacker.append(ALFABETO.M.valor);
                    break;
                case 'N':
                    palabraHacker.append(ALFABETO.N.valor);
                    break;
                case 'O':
                    palabraHacker.append(ALFABETO.O.valor);
                    break;
                case 'P':
                    palabraHacker.append(ALFABETO.P.valor);
                    break;
                case 'Q':
                    palabraHacker.append(ALFABETO.Q.valor);
                    break;
                case 'R':
                    palabraHacker.append(ALFABETO.R.valor);
                    break;
                case 'S':
                    palabraHacker.append(ALFABETO.S.valor);
                    break;
                case 'T':
                    palabraHacker.append(ALFABETO.T.valor);
                    break;
                case 'U':
                    palabraHacker.append(ALFABETO.U.valor);
                    break;
                case 'V':
                    palabraHacker.append(ALFABETO.V.valor);
                    break;
                case 'W':
                    palabraHacker.append(ALFABETO.W.valor);
                    break;
                case 'X':
                    palabraHacker.append(ALFABETO.X.valor);
                    break;
                case 'Y':
                    palabraHacker.append(ALFABETO.Y.valor);
                    break;
                case 'Z':
                    palabraHacker.append(ALFABETO.Z.valor);
                    break;
                case '0':
                    palabraHacker.append(NUMEROS.CERO.valor);
                    break;
                case '1':
                    palabraHacker.append(NUMEROS.UNO.valor);
                    break;
                case '2':
                    palabraHacker.append(NUMEROS.DOS.valor);
                    break;
                case '3':
                    palabraHacker.append(NUMEROS.TRES.valor);
                    break;
                case '4':
                    palabraHacker.append(NUMEROS.CUATRO.valor);
                    break;
                case '5':
                    palabraHacker.append(NUMEROS.CINCO.valor);
                    break;
                case '6':
                    palabraHacker.append(NUMEROS.SEIS.valor);
                    break;
                case '7':
                    palabraHacker.append(NUMEROS.SIETE.valor);
                    break;
                case '8':
                    palabraHacker.append(NUMEROS.OCHO.valor);
                    break;
                case '9':
                    palabraHacker.append(NUMEROS.NUEVE.valor);
                    break;
                default:
                    palabraHacker.append(palabra.charAt(i));
                    break;
            }
        }
        return palabraHacker.toString();
    }
    
    enum ALFABETO{
        A("4"),
        B("I3"),
        C("["),
        D(")"),
        E("3"),
        F("|="),
        G("&"),
        H("#"),
        I("1"),
        J(",_|"),
        K(">|"),
        L("1"),
        M("/\\/\\"),
        N("^/"),
        O("0"),
        P("|*"),
        Q("(_,)"),
        R("I2"),
        S("5"),
        T("7"),
        U("(_)"),
        V("\\/"),
        W("\\/\\/"),
        X("><"),
        Y("j"),
        Z("2");
        
        private String valor;
        
        ALFABETO(String valor){
            this.valor = valor;
        }
    }
    
    enum NUMEROS{
        UNO("l"),
        DOS("2"),
        TRES("3"),
        CUATRO("A"),
        CINCO("S"),
        SEIS("b"),
        SIETE("T"),
        OCHO("B"),
        NUEVE("g"),
        CERO("o");
        
        private String valor;
        
        NUMEROS(String valor){
            this.valor = valor;
        }
    }
}

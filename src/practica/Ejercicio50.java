/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Crea una función que sea capaz de detectar y retornar todos los
 * handles de un texto usando solamente Expresiones Regulares.
 * Debes crear una expresión regular para cada caso:
 * - Handle usuario: Los que comienzan por "@"
 * - Handle hashtag: Los que comienzan por "#"
 * - Handle web: Los que comienzan por "www.", "http://", "https://"
 *   y finalizan con un dominio (.com, .es...)
 */
public class Ejercicio50 {

    public static void main(String[] args) {
        System.out.println(handlesDetector("En esta actividad de @mouredev, resolvemos #retos de #programacion desde https://retosdeprogramacion.com/semanales2022, que @braismoure aloja en www.github.com"));
    }

    private static Map<String, List<String>> handlesDetector(String text) {
        Map<String, List<String>> handles = new HashMap<>();

        handles.put("user", findAllMatches("@(\\w{2,15})", text));
        handles.put("hashtag", findAllMatches("#[^ !@$^#&,.?():%<>{}\\[\\]|\"]+", text));
        handles.put("url", findAllMatches("((https?://(www\\.)?)|www\\.)[\\w#+\\=]{2,256}\\.[a-zA-Z]{2,7}[\\w\\/?=&.+-]*", text));

        return handles;
    }

    private static List<String> findAllMatches(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        return matches;
    }
}

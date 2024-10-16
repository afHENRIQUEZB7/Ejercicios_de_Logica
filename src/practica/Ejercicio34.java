/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Simula el funcionamiento de una máquina expendedora creando una operación
 * que reciba dinero (array de monedas) y un número que indique la selección
 * del producto.
 * - El programa retornará el nombre del producto y un array con el dinero
 *   de vuelta (con el menor número de monedas).
 * - Si el dinero es insuficiente o el número de producto no existe,
 *   deberá indicarse con un mensaje y retornar todas las monedas.
 * - Si no hay dinero de vuelta, el array se retornará vacío.
 * - Para que resulte más simple, trabajaremos en céntimos con monedas
 *   de 5, 10, 50, 100 y 200.
 * - Debemos controlar que las monedas enviadas estén dentro de las soportadas.
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        // Inicializar monedas;
        List<Integer> monedas = arrayMonedasUsuario();

        // Lista para devolver el cambio
        List<Integer> monedasDevuelta = new ArrayList<>();

        // Selecion del producto que se va a selecionar;
        int seleccion = 1;

        Map<String, Integer> mapProductos = new LinkedHashMap<>();

        mapProductos.put("Coca-Cola", 150);
        mapProductos.put("Pepsi", 100);
        mapProductos.put("Manzana", 60);
        mapProductos.put("Naranja", 65);

        Collection<?> valores = mapProductos.entrySet();

        List<String> listaproductos = new ArrayList(valores);

        String producto = "";
        int precio = 0;

        if (seleccion >= 0 && seleccion < listaproductos.size()) {
            String array[] = String.valueOf(listaproductos.get(seleccion)).split("=");
            Map<String, Integer> mapRespuesta = new HashMap<>();

            mapRespuesta.put(array[0], Integer.parseInt(array[1]));

            for (Map.Entry<String, Integer> r : mapRespuesta.entrySet()) {
                producto = r.getKey();
                precio = r.getValue();
            }

            // Recorrer la lista de las moneas para hacer el respectivo desconteo
            int sum = 0;
            for (Integer money : monedas) {
                sum += money;
                if (sum > precio) {
                    monedasDevuelta.add(money);
                }
            }

            // validadar si la sumatoria de el arreglo de monedas es igual al precio del producto seleccionado
            if (sum == precio) {
                monedasDevuelta.clear();
            }

            System.out.println("El producto que selecciono es:  " + producto + ""
                    + " y le quedan de monedas: " + monedasDevuelta);

        } else {

            System.out.println("La opcion " + seleccion + " no se encuentra en la lista de productos disponibles");

        }

    }

    private static List<Integer> arrayMonedasUsuario() {

        List<Integer> monedas = new ArrayList<>();
        monedas.add(5);
        monedas.add(10);
        monedas.add(50);
        monedas.add(100);
        monedas.add(200);

        // validar que las monedas esten en el rango indicado 5, 10, 50, 100 y 200.
        boolean validador = false;
        for (Integer money : monedas) {
            validador = (money == 5 || money == 10 || money == 15 || money == 50 || money == 100 || money == 200) ? true : false;
        }
        return (validador) ? monedas : null;
    }

    // Solucion hecha por chatgpt
    /*
    
     // Listado de productos y sus precios
    private static final String[] productos = {"Agua", "Coca Cola", "Chocolate", "Galletas", "Patatas"};
    private static final int[] precios = {50, 150, 200, 120, 100};

    // Valores de las monedas soportadas
    private static final int[] monedasSoportadas = {5, 10, 50, 100, 200};

    public static void main(String[] args) {
        int[] dinero = {100, 50, 10, 10, 5}; // Ejemplo de monedas introducidas
        int seleccionProducto = 2; // Ejemplo de selección de producto (Chocolate)

        Object[] resultado = procesarCompra(dinero, seleccionProducto);
        System.out.println("Producto: " + resultado[0]);
        System.out.println("Cambio: " + Arrays.toString((int[]) resultado[1]));
    }

    public static Object[] procesarCompra(int[] dinero, int seleccionProducto) {
        // Validar selección del producto
        if (seleccionProducto < 0 || seleccionProducto >= productos.length) {
            return new Object[]{"Producto no existe", dinero};
        }

        // Validar monedas introducidas
        int totalDinero = 0;
        for (int moneda : dinero) {
            if (!esMonedaValida(moneda)) {
                return new Object[]{"Moneda no soportada", dinero};
            }
            totalDinero += moneda;
        }

        int precioProducto = precios[seleccionProducto];

        // Verificar si el dinero es suficiente
        if (totalDinero < precioProducto) {
            return new Object[]{"Dinero insuficiente", dinero};
        }

        // Calcular el cambio
        int cambio = totalDinero - precioProducto;
        int[] cambioMonedas = calcularCambio(cambio);

        // Si no hay cambio, devolver un array vacío
        if (cambioMonedas.length == 0) {
            return new Object[]{productos[seleccionProducto], new int[0]};
        } else {
            return new Object[]{productos[seleccionProducto], cambioMonedas};
        }
    }

    private static boolean esMonedaValida(int moneda) {
        for (int valor : monedasSoportadas) {
            if (valor == moneda) {
                return true;
            }
        }
        return false;
    }

    private static int[] calcularCambio(int cambio) {
        List<Integer> cambioList = new ArrayList<>();
        for (int i = monedasSoportadas.length - 1; i >= 0; i--) {
            while (cambio >= monedasSoportadas[i]) {
                cambio -= monedasSoportadas[i];
                cambioList.add(monedasSoportadas[i]);
            }
        }
        // Convertir la lista de cambio a un array de int
        return cambioList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    
     */
}

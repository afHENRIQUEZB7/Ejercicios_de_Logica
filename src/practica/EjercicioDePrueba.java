/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import static java.lang.Math.random;
import java.lang.reflect.Field;
import java.util.Random;

/**
 *
 * @author WPOSS
 */
public class EjercicioDePrueba {

//    private static boolean venta_6260 = false;
//    private static boolean venta_simple_qr_6260 = false;
//    private static boolean venta_simple_qr_9220 = false;
//    private static boolean anulacion_6260 = false;
//    private static boolean anulacion_9220 = false;
//    private static boolean duplicado_6260 = false;
//    private static boolean duplicado_9220 = false;
//    private static boolean duplicado_uuid_na_9220 = false;
//    private static boolean cierre_6260 = false;
//    private static boolean cierre_9220 = false;
//    private static boolean cierre_simple_qr_6260 = false;
//    private static boolean cierre_simple_qr_9220 = false;
//    private static boolean venta_promociones_y_descuentos_9220 = false;
//    private static boolean venta_simple_9220 = false;
//    private static boolean venta_cuotas_9220 = false;
//    private static boolean venta_propinas_9220 = false;
//    private static boolean venta_banca_joven_9220 = false;
//    private static boolean venta_cashback_9220 = false;
//    private static boolean venta_reservas_9220 = false;
//    private static boolean venta_golazo_9220 = false;
//    private static boolean venta_banx_9220 = false;
//    private static boolean revertida_tigomoney_9220 = false;
//    private static boolean borradoCierre = false;
//    private static boolean testSoat_9220 = false;
    private static String nombre = "Andres";

    public static void main(String[] args) {
//        int inicio = 0;
//
//        Random random = new Random();
//
//        do {
////            inicio = (int) (Math.random() * (122 - 33 + 1) + 33);
//            inicio = (random.nextInt(122 - 33 + 1) + 33);
////            inicio = (int) (Math.random() * 122);
//            System.out.println("inicio = " + inicio);
//        } while (inicio != 32);

//          venta_promociones_y_descuentos_9220 = true;
        capturarNombreVariableEnTrue();

    }

    public static String capturarNombreVariableEnTrue() {
        Class<?> instancia =  EjercicioDePrueba.class;
        Field[] fields = EjercicioDePrueba.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == String.class) {
                try {
                    field.setAccessible(true);
                    System.out.println("el nombre es: " + field.get(null));
                    return field.getName();

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;  // Si no hay ninguna variable en true
    }
}

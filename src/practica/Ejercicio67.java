/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Realiza una conexión desde el lenguaje que hayas seleccionado a la siguiente
  * base de datos MySQL:
 * - Host: mysql-5707.dinaserver.com
 * - Port: 3306
 * - User: mouredev_read
 * - Password: mouredev_pass
 * - Database: moure_test
 *
 * Una vez realices la conexión, lanza la siguiente consulta e imprime el resultado:
 * - SELECT * FROM `challenges`
 *
 * Se pueden usar librerías para realizar la lógica de conexión a la base de datos.
 */
public class Ejercicio67 {

    private static final String URL = "jdbc:mysql://mysql-5707.dinaserver.com:3306/moure_test";
    private final static String USER = "mouredev_read";
    private final static String PASSWORD = "mouredev_pass";

    public static void main(String[] args) throws SQLException {
        System.out.println("Bienvenido a la conexion a la base de datos");
        listarResultado();
    }

    private static Connection conexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static void listarResultado() throws SQLException {
        String consulta = "SELECT * FROM `challenges`";

        try (Connection con = conexion();
             PreparedStatement pstm = con.prepareStatement(consulta);
             ResultSet rs = pstm.executeQuery()) {

            System.out.println("Resultado:");
            while (rs.next()) {
                System.out.println(rs);
            }
        }
    }
    
}

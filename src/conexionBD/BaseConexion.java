package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import leer.Leer;

/**
 *
 * @author Código Lite - https://codigolite.com
 */
public class BaseConexion {

    public static Connection cns = null;
    private static String host = "localhost";
    private static String dataBase = "buenCamino"; //nombre base de datos
    private static String user = "root"; // usuario de la base de datos
    private static String pass = "root"; // contraseña de la base de datos

    public static void init() {
        try {
            if (cns == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://" + host + ":3306/" + dataBase + "";
                cns = DriverManager.getConnection(url, user, pass);
            }
        } catch (ClassNotFoundException ex) {
            Leer.showDatos("Fue imposible conectarse con el servidor");
            ex.printStackTrace();
        } catch (SQLException ex) {
            Leer.showDatos("No se pudo establecer conexión");
            System.exit(0);
        } catch (NullPointerException ex) {
            Leer.showDatos("Se está pasando un objeto nulo");
            ex.printStackTrace();
        }

    }

}

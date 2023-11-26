package leer;

import javax.swing.JOptionPane;

/**
 *
 * @author Dax Sánchez
 */
public class Leer {

    public static String leerCadena(String msj) {
        return JOptionPane.showInputDialog(null, msj);
    }

    public static int leerEntero(String msj) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, msj));
    }

    public static Double leerDouble(String msj) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, msj));
    }

    public static void showDatos(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

}

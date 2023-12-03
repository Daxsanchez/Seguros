package excepciones;

/**
 *
 * @author Dax Sánchez
 */
public class ExcNumero extends Exception {
    //7.1
    public void errorNumNegativo() {
        leer.Leer.showDatos("No se permiten numeros negativos");
    }
}

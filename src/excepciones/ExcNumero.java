package excepciones;

/**
 *
 * @author Dax Sánchez
 */
public class ExcNumero extends Exception {

    public void errorNumNegativo() {
        leer.Leer.showDatos("No se permiten numeros negativos");
    }
}

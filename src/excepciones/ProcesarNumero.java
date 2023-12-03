package excepciones;

/**
 *
 * @author Dax Sánchez
 */
public class ProcesarNumero {
      //7.1
    //Si el booleano es true entonces es un Double
    //Si el booleano es falso entonces es un Int 
    public void validarNum(Number num, boolean tipo) throws ExcNumero {
        if (tipo) {
            if (num.doubleValue() < 0.0) {
                throw new ExcNumero();
            }
        } else {
            if (num.intValue() < 0) {
                throw new ExcNumero();
            }
        }
    }
}

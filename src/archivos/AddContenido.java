package archivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Dax Sánchez
 */
public class AddContenido extends ObjectOutputStream {

    public AddContenido(OutputStream out) throws IOException {
        super(out);
    }

    public AddContenido() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
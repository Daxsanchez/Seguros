package archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import vehiculos.Vehiculo;
import ventas.Venta;

/**
 *
 * @author Dax Sánchez
 */
public class ArchivoBin {

    private String fileName;

    public ArchivoBin(String fileName) {
        this.fileName = fileName;
        ObjectOutputStream outPutStream = null;
        File f = new File(this.fileName);

        try {
            if (!f.exists()) {
                outPutStream = new ObjectOutputStream(new FileOutputStream(this.fileName));

                outPutStream.close();
            } else {
                System.out.println("El archivo: " + this.fileName + " ya existe");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Excepción de tipo: " + ex.getClass().getSimpleName());
        } catch (IOException ex) {
            System.out.println("Excepción de tipo: " + ex.getClass().getSimpleName());
        }
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        AddContenido outPutSteam;
        try {
            outPutSteam = new AddContenido(new FileOutputStream(this.fileName, true));
            outPutSteam.writeObject(vehiculo);
            outPutSteam.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Excepción de tipo: " + ex.getClass().getSimpleName());
        } catch (IOException ex) {
            System.out.println("Excepción de tipo: " + ex.getClass().getSimpleName());
        }
    }

    public Vehiculo getVehiculoArchivo() {
        ObjectInputStream inputStream = null;
        Vehiculo vehiculo = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream(this.fileName));

            while (true) {
                vehiculo = (Vehiculo) inputStream.readObject();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Excepción de tipo: " + ex.getClass().getSimpleName());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Se terminó la lectura del archivo");
        }
        return vehiculo;
    }

}

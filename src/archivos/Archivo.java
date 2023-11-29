package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Renovaciones.Renovacion;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Dax Sánchez
 */
public class Archivo {

    private File archivo;
    private String nameArchivo;
    private String nameCarpeta;

    public Archivo(String nameArchivo, String nameCarpeta) {
        this.nameArchivo = nameArchivo;
        this.nameCarpeta = nameCarpeta;

        File carpeta = new File(this.nameCarpeta);
        archivo = new File(this.nameCarpeta + "\\" + this.nameArchivo + ".txt");

        try {
            if (!carpeta.exists()) {
                if (carpeta.mkdir()) {
                    System.out.println("Se ha creado correctamente la carpeta: " + nameCarpeta);
                }
            }
            if (nameArchivo == null) {
                return;
            }
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado correctamente el archivo: " + nameArchivo);
                }
            }
        } catch (IOException ex) {
            System.out.println("Exepción de tipo: " + ex.getClass().getSimpleName());
        }
    }

    public void escribrir(String texto) {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribir);
            buffer.write(texto);
            buffer.newLine();
            buffer.close();
            escribir.close();
        } catch (IOException ex) {
            System.out.println("El archivo es de tipo: " + ex.getClass().getSimpleName());
        }
    }

    public void leerArchivo() {
        try {
            FileReader leer = new FileReader(this.archivo);
            BufferedReader buffer = new BufferedReader(leer);

            String linea = buffer.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = buffer.readLine();
            }
        } catch (IOException ex) {
            System.out.println("El tipo de excepción es: " + ex.getClass().getSimpleName());
        }
    }

}

package vehiculos;

import archivos.Archivo;
import archivos.ArchivoBin;
import java.io.Serializable;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */
//Sobrecarga de métodos
public class Vehiculo implements Serializable {

    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private int age;
    //Variable para validar en que constructor entró
    private int constructor = 0;

    //Constructor vacío
    public Vehiculo() {
        this.placa = "Por definir";
        this.marca = "Por definir";
        this.modelo = "Por definir";
        this.color = "Por definir";
        this.age = -1;
    }

    //Vehiculo de tipo grande 1
    public Vehiculo(String placa, String marca, String modelo, String color, int age) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.age = age;
        this.constructor = 1;
    }

    //Vehiculo de tipo chico 2
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.constructor = 2;
    }

    //Vehiculo de tipo mediano 3
    public Vehiculo(String placa, String color, int age) {
        this.placa = placa;
        this.color = color;
        this.age = age;
        this.constructor = 3;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo").append("\n");
        sb.append("Placa: ").append(placa).append("\n");
        if (constructor == 1) {
            sb.append("Marca: ").append(marca).append("\n");
            sb.append("Modelo: ").append(modelo).append("\n");
            sb.append("Color: ").append(color).append("\n");
            sb.append("Año: ").append(age).append("\n");
        } else if (constructor == 2) {
            sb.append("Marca: ").append(marca).append("\n");
            sb.append("Modelo: ").append(modelo).append("\n");
        } else if (constructor == 3) {
            sb.append("Color: ").append(color).append("\n");
            sb.append("Año: ").append(age).append("\n");
        }
        return sb.toString();
    }

    //Solo muestra la placa
    public void obtenerInformacion() {
        String info = "Información del vehiculo: \nPlaca: " + placa;
        Leer.showDatos(info);
    }

    // Método sobrecargado para obtener información detallada del vehículo
    public void obtenerInformacion(boolean detallada) {
        obtenerInformacion();

        if (detallada) {
            Leer.showDatos("Detalles adicionales:\n" + toString());
        }
    }

    public void guardarArchivoVehiculo() {
        new Archivo(null, "Vehiculos");//Crea carpeta ventas si no existe, se manda un null en el primer parámetro para que no creé un archivo
        ArchivoBin archivoBin = new ArchivoBin("Vehiculos//Vehiculo_" + this.placa + ".bin");
        archivoBin.agregarVehiculo(this);
    }

    public Vehiculo getVehiculoArchivo() {
        ArchivoBin archivoBin = new ArchivoBin("Vehiculos//Vehiculo_" + this.placa + ".bin");
        return archivoBin.getVehiculoArchivo();
    }

}

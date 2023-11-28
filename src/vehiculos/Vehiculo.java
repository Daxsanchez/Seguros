package vehiculos;

import archivos.Archivo;
import archivos.ArchivoBin;
import java.io.Serializable;

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

    //Constructor vacío
    public Vehiculo() {
        this.placa = "Por definir";
        this.marca = "Por definir";
        this.modelo = "Por definir";
        this.color = "Por definir";
        this.age = -1;
    }

    //Vehiculo de tipo grande
    public Vehiculo(String placa, String marca, String modelo, String color, int age) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.age = age;
    }

    //Vehiculo de tipo chico
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Vehiculo de tipo mediano
    public Vehiculo(String placa, String color, int age) {
        this.placa = placa;
        this.color = color;
        this.age = age;
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
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Año: ").append(age).append("\n");
        return sb.toString();
    }

    public void obtenerInformacion() {
        String info = "Información del vehiculo: \nPlaca: " + placa + "\nModelo: " + modelo;
        System.out.println(info);
    }

    // Método sobrecargado para obtener información detallada del vehículo
    public void obtenerInformacion(boolean detallada) {
        obtenerInformacion();

        if (detallada) {
            System.out.println("Detalles adicionales:\n" + toString());
        }
    }

    public void guardarArchivoVehiculo() {
        new Archivo(null, "Vehiculos");//Crea carpeta ventas si no existe, se manda un null en el primer parámetro para que no creé un archivo
        ArchivoBin archivoBin = new ArchivoBin("Vehiculos//Vehiculo_" + this.placa + ".bin");
        archivoBin.agregarVehiculo(this);
    }

    public Vehiculo getVehiculo() {
        ArchivoBin archivoBin = new ArchivoBin("Vehiculos//Vehiculo_" + this.placa + ".bin");
        return archivoBin.getVehiculoArchivo();
    }

}

package Persona;

/**
 *
 * @author rafae
 */
public abstract class Empleado extends Persona {
    
    private int id;
    private String puesto;
    private Double salario;
    
    public Empleado(int id, String puesto, Double salario, String nombre, String apellido, String numTelefonon) {
        super(nombre, apellido, numTelefonon);
        this.id = id;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public Double getSalario() {
        return salario;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Empleado:\n");
        sb.append(super.toString());
        sb.append("Id: ").append(id).append("\n");
        sb.append("Puesto: ").append(puesto).append("\n");
        sb.append("Salario: ").append(salario).append("\n");
        return sb.toString();
    }
    
    
    public abstract double calcSueldo();
    public abstract String getData();
    
}

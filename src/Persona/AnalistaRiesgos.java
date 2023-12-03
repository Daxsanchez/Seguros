package Persona;

/**
 *
 * @author rafae
 */
//3.2
public class AnalistaRiesgos extends Empleado {

    private int productividad;

    public AnalistaRiesgos(int id, String puesto, Double salario, String nombre, String apellido, String numTelefonon, int productividad) {
        super(id, puesto, salario, nombre, apellido, numTelefonon);
        this.productividad = productividad;
    }

    public int getProductividad() {
        return productividad;
    }

    public void setProductividad(int productividad) {
        this.productividad = productividad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Analista de Riesgos: ").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public double calcSueldo() {
        calcProduc(productividad);
        return super.getSalario();
    }

    @Override
    public String getData() {
        return "Informacion de Agente Seguros: " + toString() + "\nSueldo: " + calcSueldo();
    }

    private void calcProduc(int productividad) {
        if (productividad > 80) {
            super.setSalario(super.getSalario() + (super.getSalario() * 0.80));
        }
        if (productividad > 30 && productividad < 50) {
            super.setSalario(super.getSalario() + (super.getSalario() * 0.30));
        }
        if (productividad < 30) {
            super.setSalario(super.getSalario() + (super.getSalario() * 0.05));
        }

    }

}

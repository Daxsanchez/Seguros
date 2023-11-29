package ventas;

import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */

//1.2 Métodos para calcular Ventas
public class ProcesarVenta {

    
    
    public void totalVentasSeguros(Venta[] ventas) {
        double total = 0.0;
        for (Venta v : ventas) {
            total += v.calcVenta();
        }
        Leer.showDatos("El total de ventas de seguros es: " + total);
    }

    public void totalPagoAseguradora(Venta[] ventas) {
        double total = 0.0;
        for (Venta v : ventas) {
            while(v.getDeducible() > v.getSeguro().getMontoAsegurado()){
                Leer.showDatos("El deducible no puede ser mayor al monto de la aseguradora");
                v.setDeducible(Leer.leerDouble("Ingrese el monto del deducible: "));
            }
            total += v.calcPagoAseguradora();
        }
        Leer.showDatos("El total a pagar por la aseguradora es: " + total);
    }
}

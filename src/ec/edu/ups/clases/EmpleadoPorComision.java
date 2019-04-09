/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class EmpleadoPorComision extends Empleado {

    private double ventasMensuales;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double ventasMensuales, int codigo,
            String nombre, String cedula, double salario, Date fechaContrato) {
        super(codigo, nombre, cedula, salario, fechaContrato);
        this.ventasMensuales = ventasMensuales;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    /**
     * Método calcularSalarioFinal
     *
     * Si el empleado realizó ventas entre $500 y $1000 se le otorga una
     * comisión del 10% sobre las ventas totales
     *
     * Si el empleado realizó ventas entre $1001 y $5000 se le otorga una
     * comisión del 15% sobre las ventas totales
     *
     * Si el empleado realizó ventas superiores a $5001 se le otorga una
     * comisión del 20% sobre las ventas totales
     *
     * @return
     */
    @Override
    public double calcularSalarioFinal() {
        if ((ventasMensuales >= 500) && (ventasMensuales <= 1000)) {
            double comision = (ventasMensuales * 0.10);
            return super.getSalario() + comision;
        } else if ((ventasMensuales >= 1001) && (ventasMensuales <= 5000)) {
            double comision = (ventasMensuales * 0.15);
            return super.getSalario() + comision;
        } else if (ventasMensuales > 5000) {
            double comision = (ventasMensuales * 0.20);
            return super.getSalario() + comision;
        } else {
            return super.getSalario();
        }
    }

}

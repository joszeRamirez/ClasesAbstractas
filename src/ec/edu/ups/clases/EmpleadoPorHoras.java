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
public class EmpleadoPorHoras extends Empleado {

    private int numHorasExtra;
    private double costoHoraExtra;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int numHorasExtra, double costoHoraExtra,
            int codigo, String nombre, String cedula, double salario,
            Date fechaContrato) {
        super(codigo, nombre, cedula, salario, fechaContrato);
        this.numHorasExtra = numHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public int getNumHorasExtra() {
        return numHorasExtra;
    }

    public void setNumHorasExtra(int numHorasExtra) {
        this.numHorasExtra = numHorasExtra;
    }

    public double getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(double costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }

    @Override
    public double calcularSalarioFinal() {
        double totalSalario = numHorasExtra * costoHoraExtra;
        return super.getSalario() + totalSalario;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorHoras{" + "numHorasExtra="
                + numHorasExtra + ", costoHoraExtra=" + costoHoraExtra;
    }

}

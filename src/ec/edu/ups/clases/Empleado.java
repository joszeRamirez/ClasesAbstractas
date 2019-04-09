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
public abstract class Empleado {

    private int codigo;
    private String nombre;
    private String cedula;
    private double salario;
    private Date fechaContrato;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String cedula, double salario, Date fechaContrato) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", cedula=" + cedula + ", salario=" + salario
                + ", fechaContrato=" + fechaContrato;
    }

    public abstract double calcularSalarioFinal();
}

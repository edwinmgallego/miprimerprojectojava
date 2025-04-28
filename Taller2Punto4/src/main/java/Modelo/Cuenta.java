/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cript
 */


import java.time.LocalDate;

public abstract class Cuenta {
    protected String numero;
    protected String nombreDueno;
    protected LocalDate fechaApertura;
    protected double saldo;

    public Cuenta(String numero, String nombreDueno, LocalDate fechaApertura, double saldo) {
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getNombreDueno() { return nombreDueno; }
    public void setNombreDueno(String nombreDueno) { this.nombreDueno = nombreDueno; }

    public LocalDate getFechaApertura() { return fechaApertura; }
    public void setFechaApertura(LocalDate fechaApertura) { this.fechaApertura = fechaApertura; }

    public double getSaldo() { return saldo; }

    // Métodos comunes
    public void consignar(double valor) {
        saldo += valor;
    }

    public abstract boolean retirar(double valor); // cada subclase lo implementa

    public String obtenerSaldo() {
        return "Saldo actual: $" + saldo;
    }

    @Override
    public String toString() {
        return "Número: " + numero +
               "\nDueño: " + nombreDueno +
               "\nFecha Apertura: " + fechaApertura +
               "\nSaldo: $" + saldo;
    }
}


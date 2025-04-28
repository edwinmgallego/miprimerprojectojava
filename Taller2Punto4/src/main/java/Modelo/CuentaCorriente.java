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

public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(String numero, String nombreDueno, LocalDate fechaApertura, double saldo, double cupoSobregiro) {
        super(numero, nombreDueno, fechaApertura, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double valor) {
        if (valor <= saldo + cupoSobregiro) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Sobrecarga
    public boolean retirar(double valor, boolean notificar) {
        boolean exito = retirar(valor);
        if (notificar) {
            System.out.println("Intento de retiro: " + (exito ? "Exitoso" : "Fallido"));
        }
        return exito;
    }

    public double getCupoSobregiro() { return cupoSobregiro; }
    public void setCupoSobregiro(double cupoSobregiro) { this.cupoSobregiro = cupoSobregiro; }

    @Override
    public String toString() {
        return "Cuenta Corriente:\n" + super.toString() +
               "\nCupo de Sobregiro: $" + cupoSobregiro;
    }
}


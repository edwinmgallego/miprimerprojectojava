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

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numero, String nombreDueno, LocalDate fechaApertura, double saldo) {
        super(numero, nombreDueno, fechaApertura, saldo);
    }

    @Override
    public boolean retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Sobrecarga de método con estructura anidada
    public String mensajeRetiro(double valor) {
        if (retirar(valor)) {
            return "Retiro exitoso de $" + valor;
        } else {
            return "Fondos insuficientes";
        }
    }

    public String mensajeRetiro(double valor, boolean imprimirSaldo) {
        String mensaje = mensajeRetiro(valor);
        if (imprimirSaldo) {
            mensaje += "\n" + obtenerSaldo();
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorros:\n" + super.toString();
    }
}

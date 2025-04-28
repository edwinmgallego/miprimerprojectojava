/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

/**
 *
 * @author cript
 */

import Modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class Taller2Punto4 {

   public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("123", "Juan Pérez", LocalDate.of(2023, 5, 1), 5000));
        cuentas.add(new CuentaCorriente("456", "Ana Gómez", LocalDate.of(2022, 8, 15), 2000, 1000));
        cuentas.add(new CuentaAhorros("789", "Carlos Ruiz", LocalDate.of(2024, 1, 10), 3000));

        // Ejecutamos la función que retorna la cadena de información
        String resultado = filtrarCuentasPorNombre(cuentas, "Ana");

        System.out.println("Resultado filtrado:\n" + resultado);
    }

    public static String filtrarCuentasPorNombre(ArrayList<Cuenta> lista, String nombreParcial) {
        StringBuilder sb = new StringBuilder();

        for (Cuenta c : lista) {
            if (c.getNombreDueno().toLowerCase().contains(nombreParcial.toLowerCase())) {
                sb.append(c.toString()).append("\n-----------------\n");
            }
        }
        return sb.toString();
    }
}

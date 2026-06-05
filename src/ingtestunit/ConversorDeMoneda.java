/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingtestunit;

/**
 *
 * @author patri
 */
public class ConversorDeMoneda {

    public ConversorDeMoneda() {
    }

    public static double convertir(double cantidad, double cotizacion) {
        return cantidad * cotizacion;
    }

    public static double calcularCotizacion(double cantidadEntregada, double cantidadRecibida) {
        if (cantidadRecibida == 0) {
            System.out.println("no hay nada que cotizar!");
            return 0;//no  se si esta bien... o lanzar exception
        }
        return cantidadEntregada / cantidadRecibida;
    }

    public static double aumentarSaldo(double saldoActual, double montoComprado) {
        return saldoActual + montoComprado;
    }

    public static void simularRetiroFisico(double saldoTotal, int denominacion) {
        if (denominacion <= 0) {
            System.out.println("La denominacion del billete debe ser mayor a cero.");
            return;
        }

        int cantidadBilletes = (int) (saldoTotal / denominacion);

        double saldoRestante = saldoTotal % denominacion;

        System.out.println("Simulacion de Retiro Fisico ");
        System.out.println("Saldo total a retirar: U$S " + saldoTotal);
        System.out.println("Billetes entregados (" + denominacion + "): " + cantidadBilletes);
        System.out.println("Saldo restante en cuenta: U$S " + saldoRestante);
    }
}

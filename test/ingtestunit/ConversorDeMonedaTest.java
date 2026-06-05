/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ingtestunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class ConversorDeMonedaTest {

    public static ConversorDeMoneda conversor;

    public ConversorDeMonedaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        conversor = new ConversorDeMoneda();
    }

    @BeforeEach
    public static void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada!");

    }

    @Test
    public void testConvertir() {
        System.out.println("convertir");
        double cantidad = 200;
        double cotizacion = conversor.calcularCotizacion(cantidad, cantidad);
        double expResult = 0.0;
        double result = conversor.convertir(cantidad, cotizacion);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCotizacion method, of class ConversorDeMoneda.
     */
    @Test
    public void testCalcularCotizacion() {
        System.out.println("calcularCotizacion");
        double cantidadEntregada = 0.0;
        double cantidadRecibida = 0.0;
        double expResult = 0.0;
        double result = ConversorDeMoneda.calcularCotizacion(cantidadEntregada, cantidadRecibida);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentarSaldo method, of class ConversorDeMoneda.
     */
    @Test
    public void testAumentarSaldo() {
        System.out.println("aumentarSaldo");
        double saldoActual = 0.0;
        double montoComprado = 0.0;
        double expResult = 0.0;
        double result = ConversorDeMoneda.aumentarSaldo(saldoActual, montoComprado);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simularRetiroFisico method, of class ConversorDeMoneda.
     */
    @Test
    public void testSimularRetiroFisico() {
        System.out.println("simularRetiroFisico");
        double saldoTotal = 0.0;
        int denominacion = 0;
        ConversorDeMoneda.simularRetiroFisico(saldoTotal, denominacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

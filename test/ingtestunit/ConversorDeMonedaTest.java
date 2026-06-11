/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ingtestunit;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;      
import org.junit.Test;       
import static org.junit.Assert.*; 
import java.lang.ArithmeticException;
import org.junit.AfterClass;


public class ConversorDeMonedaTest {

    public static ConversorDeMoneda conversor;

    public ConversorDeMonedaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        conversor = new ConversorDeMoneda();
        System.out.println("Bienvenido al sistema de conversion");
    }

    @Before
    public void setUp() {
        System.out.println("Iniciando prueba...");
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en $0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }

    @Test
    public void testConvertir() {
        System.out.println("convertir");

        double cantidad = 200;
        double cotizacion = 1000;
        double expResult = 200000;

        double result = conversor.convertir(cantidad, cotizacion);

    //fail("The test case is a prototype.");
        assertEquals(expResult, result, 0.001);
    }      
    /**
     * Test of calcularCotizacion method, of class ConversorDeMoneda.
     */
    @Test
    public void testCalcularCotizacion() {
        System.out.println("calcularCotizacion");

        double cantidadEntregada = 1700;
        double cantidadRecibida = 17;
        double expResult = 100;

        double result = ConversorDeMoneda.calcularCotizacion(
                cantidadEntregada,
                cantidadRecibida);

        assertEquals(expResult, result, 0.001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testCalcularCotizacionArith() {
      ConversorDeMoneda.calcularCotizacion(1700.0, 0.0);
    }
    /**
     * Test of aumentarSaldo method, of class ConversorDeMoneda.
     */
    @Test
    public void testAumentarSaldo() {
        System.out.println("aumentarSaldo");

        double saldoActual = 0.0;
        double montoComprado = 500;
        double expResult = 500;

        double result = ConversorDeMoneda.aumentarSaldo(
                saldoActual,
                montoComprado);

        assertEquals(expResult, result, 0);
    }

    /**
     * Test of simularRetiroFisico method, of class ConversorDeMoneda.
     */
  @Test
    public void testSimularRetiroFisico() {
        System.out.println("simularRetiroFisico");
        double saldoTotal = 500;
        int denominacion = 100;
        ConversorDeMoneda.simularRetiroFisico(
                saldoTotal,
                denominacion);
        assertTrue(true);
    }
}

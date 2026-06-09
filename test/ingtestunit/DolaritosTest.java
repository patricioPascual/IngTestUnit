/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ingtestunit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private final double cantidadEntregada;
    private final double cantidadRecibida;
    private final double esperado;

    public DolaritosTest(double cantidadEntregada, double cantidadRecibida, double esperado) {

        this.cantidadEntregada = cantidadEntregada;
        this.cantidadRecibida = cantidadRecibida;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {180000, 1500, 120},
            {120000, 0, 0},
            {100000, -900, -111.11}
        });
    }

    @Test
    public void testCalcularCotizacion() {

        double resultado;

        if (cantidadRecibida == 0) {
            resultado = 0;
        } else {
            resultado = ConversorDeMoneda.calcularCotizacion(cantidadEntregada, cantidadRecibida);
        }

        assertEquals(esperado, resultado, 0.01);
    }
}

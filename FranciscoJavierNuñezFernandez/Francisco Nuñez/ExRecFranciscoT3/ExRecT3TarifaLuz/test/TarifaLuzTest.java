/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNOS-FP
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TarifaLuzTest {

    ExRecT3TarifaLuz tarifa = new ExRecT3TarifaLuz();

    @Test
    public void testCalcularCosteValle() {
        double resultado = tarifa.calcularCoste(100, false);
        assertEquals(10.0, resultado, 0.001);
    }

    @Test
    public void testCalcularCostePunta() {
        double resultado = tarifa.calcularCoste(100, true);
        assertEquals(25.0, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularCosteNegativo() {
        tarifa.calcularCoste(-10, true);
    }

    @Test
    public void testAplicarDescuentoNormal() {
        double resultado = tarifa.aplicarDescuento(100, 10);
        assertEquals(90.0, resultado, 0.001);
    }

    @Test
    public void testAplicarDescuentoCero() {
        double resultado = tarifa.aplicarDescuento(100, 0);
        assertEquals(100.0, resultado, 0.001);
    }

    @Test
    public void testAplicarDescuento100() {
        double resultado = tarifa.aplicarDescuento(100, 100);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAplicarDescuentoImporteNegativo() {
        tarifa.aplicarDescuento(-50, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAplicarDescuentoPorcentajeInvalido() {
        tarifa.aplicarDescuento(100, 150);
    }

    @Test
    public void testRecargoPotenciaBajo() {
        assertEquals(5.0, tarifa.recargoPotencia(3.3), 0.001);
    }

    @Test
    public void testRecargoPotenciaMedio() {
        assertEquals(8.0, tarifa.recargoPotencia(5.0), 0.001);
    }

    @Test
    public void testRecargoPotenciaAlto() {
        assertEquals(12.0, tarifa.recargoPotencia(6.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRecargoPotenciaInvalida() {
        tarifa.recargoPotencia(0);
    }

    @Test
    public void testCalcularImpuestosNormal() {
        double resultado = tarifa.calcularImpuestos(100);
        assertEquals(126.0, resultado, 0.001);
    }

    @Test
    public void testCalcularImpuestosCero() {
        assertEquals(0.0, tarifa.calcularImpuestos(0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularImpuestosNegativo() {
        tarifa.calcularImpuestos(-10);
    }

    @Test
    public void testClasificarConsumoBajo() {
        assertEquals("BAJO", tarifa.clasificarConsumo(50));
    }

    @Test
    public void testClasificarConsumoMedio() {
        assertEquals("MEDIO", tarifa.clasificarConsumo(200));
    }

    @Test
    public void testClasificarConsumoAlto() {
        assertEquals("ALTO", tarifa.clasificarConsumo(400));
    }

    @Test
    public void testClasificarConsumoLimite100() {
        assertEquals("MEDIO", tarifa.clasificarConsumo(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClasificarConsumoNegativo() {
        tarifa.clasificarConsumo(-1);
    }

    @Test
    public void testElegibleBonoSocialTrue() {
        assertTrue(tarifa.esElegibleBonoSocial(800, 3));
    }

    @Test
    public void testElegibleBonoSocialFalseIngreso() {
        assertFalse(tarifa.esElegibleBonoSocial(1000, 3));
    }

    @Test
    public void testElegibleBonoSocialFalseMiembros() {
        assertFalse(tarifa.esElegibleBonoSocial(800, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElegibleBonoSocialIngresoNegativo() {
        tarifa.esElegibleBonoSocial(-100, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElegibleBonoSocialMiembrosInvalidos() {
        tarifa.esElegibleBonoSocial(800, 0);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrect3tarifaluz;

/**
 *
 * @author ALUMNOS-FP
 */
public class ExRecT3TarifaLuz {
    // Precio base por kWh en horario valle
    private static final double PRECIO_VALLE = 0.10;

    // Precio base por kWh en horario punta
    private static final double PRECIO_PUNTA = 0.25;

    // Devuelve el coste de una factura simple dada una cantidad de kWh y si es horario punta
    public double calcularCoste(double kWh, boolean esPunta) {
        if (kWh < 0) {
            throw new IllegalArgumentException("Los kWh no pueden ser negativos");
        }
        double precio = esPunta ? PRECIO_PUNTA : PRECIO_VALLE;
        return kWh * precio;
    }

    // Aplica un descuento en porcentaje al importe (por ejemplo 10 = 10%)
    public double aplicarDescuento(double importe, int porcentaje) {
        if (importe < 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo");
        }
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        double factor = 1 - (porcentaje / 100.0);
        return importe * factor;
    }

    // Calcula un recargo fijo por potencia contratada según el tramo
    // <= 3.3 kW -> 5 euros, <= 5.5 kW -> 8 euros, > 5.5 kW -> 12 euros
    public double recargoPotencia(double potenciaContratada) {
        if (potenciaContratada <= 0) {
            throw new IllegalArgumentException("La potencia debe ser mayor que 0");
        }
        if (potenciaContratada <= 3.3) {
            return 5.0;
        }
        if (potenciaContratada <= 5.5) {
            return 8.0;
        }
        return 12.0;
    }

    // Calcula impuestos sobre un importe: IVA 21% + impuesto eléctrico 5%
    public double calcularImpuestos(double importe) {
        if (importe < 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo");
        }
        double iva = importe * 0.21;
        double impuestoElectrico = importe * 0.05;
        return importe + iva + impuestoElectrico;
    }

    // Clasifica un consumo mensual en: "BAJO", "MEDIO" o "ALTO"
    // < 100 kWh -> BAJO, entre 100 y 300 -> MEDIO, > 300 -> ALTO
    public String clasificarConsumo(double kWhMes) {
        if (kWhMes < 0) {
            throw new IllegalArgumentException("Los kWh no pueden ser negativos");
        }
        if (kWhMes < 100) return "BAJO";
        if (kWhMes <= 300) return "MEDIO";
        return "ALTO";
    }

    // Indica si un cliente es elegible para un bono social:
    // ingresoMensual < 900 y numeroMiembros >= 3 -> true, en otro caso false
    public boolean esElegibleBonoSocial(double ingresoMensual, int numeroMiembros) {
        if (ingresoMensual < 0) {
            throw new IllegalArgumentException("El ingreso mensual no puede ser negativo");
        }
        if (numeroMiembros <= 0) {
            throw new IllegalArgumentException("El número de miembros debe ser mayor que 0");
        }
        return ingresoMensual < 900 && numeroMiembros >= 3;
    }
}

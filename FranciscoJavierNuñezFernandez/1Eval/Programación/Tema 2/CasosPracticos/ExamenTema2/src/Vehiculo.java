/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNOS-FP
 */
public class Vehiculo {
    private double precioCombustible;

    public Vehiculo() {
        this.precioCombustible = 1.85;
    }

    public Vehiculo(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    public double calcularConsumo(double distancia, double consumoMedio) {
        return (distancia * consumoMedio) / 100;
    }

    public double calcularGasto(double distancia, double consumoMedio) {
        double litrosConsumidos = calcularConsumo(distancia, consumoMedio);
        return litrosConsumidos * precioCombustible;
    }

    public void eficiencia(double consumoMedio) {
        if (consumoMedio < 6) {
            System.out.println("Conduccion eficiente");
        } else {
            System.out.println("Debe emplear tecnicas de conduccion mas eficientes");
        }
    }
}
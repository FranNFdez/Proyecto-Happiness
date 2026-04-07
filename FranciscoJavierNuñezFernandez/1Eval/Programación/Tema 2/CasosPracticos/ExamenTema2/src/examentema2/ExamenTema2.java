/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentema2;

import java.util.Scanner;

public class ExamenTema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio;
        double consumoMedio;
        double gastoTotal;
        double distancia;

        System.out.println("¿Cuál es el precio del combustible?");
        precio = teclado.nextDouble();
        System.out.println("¿Cuál es el consumo medio del coche (litros/100 km)?");
        consumoMedio = teclado.nextDouble();
        System.out.println("¿Qué distancia va a recorrer (en km)?");
        distancia = teclado.nextDouble();
        Vehiculo v = new Vehiculo(precio);
        gastoTotal = v.calcularGasto(distancia, consumoMedio);
        System.out.printf("El gasto estimado de su viaje es: %.2f €\n", gastoTotal);
        v.eficiencia(consumoMedio);
    }
}

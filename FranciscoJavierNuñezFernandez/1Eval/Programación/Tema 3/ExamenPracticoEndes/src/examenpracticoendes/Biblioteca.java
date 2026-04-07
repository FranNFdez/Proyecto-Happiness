/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpracticoendes;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class Biblioteca {

    // Número máximo de libros que puede albergar la biblioteca
    private static final int CAPACIDAD_MAXIMA = 100;

    // Número actual de libros en la biblioteca
    private int totalLibros;

    // Constructor: inicializa la biblioteca vacía
    public Biblioteca() {
        this.totalLibros = 0;
    }

    /**
    * Establece directamente el número de libros en la biblioteca.
    * Lanza IllegalArgumentException si el valor es menor que 0 o mayor que 100.
    */
    public void setTotalLibros(int totalLibros) {
    if (totalLibros < 0 || totalLibros > CAPACIDAD_MAXIMA) {
        throw new IllegalArgumentException("El total de libros debe estar entre 0 y 100");
    }
    this.totalLibros = totalLibros;
}

    /**
     * Registra la entrada de nuevos libros a la biblioteca.
     * Devuelve el nuevo total de libros tras la entrada.
     * Lanza IllegalArgumentException si la cantidad es menor que 1.
     * Lanza IllegalStateException si se supera la capacidad máxima de 100 libros.
     */
    public int agregarLibros(int cantidad) {
        if (cantidad < 1) {
            throw new IllegalArgumentException("La cantidad debe ser al menos 1");
        }
        if (totalLibros + cantidad > CAPACIDAD_MAXIMA) {
            throw new IllegalStateException("Se superaría la capacidad máxima de la biblioteca");
        }
        totalLibros += cantidad;
        return totalLibros;
    }

    /**
     * Registra la salida de libros de la biblioteca (préstamos, bajas, etc.).
     * Devuelve el nuevo total de libros tras la retirada.
     * Lanza IllegalArgumentException si la cantidad es menor que 1.
     * Lanza IllegalStateException si se intenta retirar más libros de los que hay.
     */
    public int retirarLibros(int cantidad) {
        if (cantidad < 1) {
            throw new IllegalArgumentException("La cantidad debe ser al menos 1");
        }
        if (cantidad > totalLibros) {
            throw new IllegalStateException("No hay suficientes libros para retirar");
        }
        totalLibros -= cantidad;
        return totalLibros;
    }

    /**
     * Clasifica la biblioteca según su nivel de ocupación:
     * - "VACÍA"  si hay 0 libros
     * - "BAJA"   si hay entre 1 y 33 libros
     * - "MEDIA"  si hay entre 34 y 66 libros
     * - "ALTA"   si hay entre 67 y 100 libros
     */
    public String clasificarOcupacion() {
        if (totalLibros == 0) return "VACÍA";
        if (totalLibros <= 33) return "BAJA";
        if (totalLibros <= 66) return "MEDIA";
        return "ALTA";
    }

    /**
     * Devuelve el número de libros que se pueden añadir antes de llegar a la capacidad máxima.
     */
    public int espacioDisponible() {
        return CAPACIDAD_MAXIMA - totalLibros;
    }

    /**
     * Indica si la biblioteca está llena (ha alcanzado la capacidad máxima).
     * Devuelve true si totalLibros es igual a la capacidad máxima, false en caso contrario.
     */
    public boolean estaLlena() {
        return totalLibros == CAPACIDAD_MAXIMA;
    }

    /**
     * Indica si una cantidad solicitada de libros puede ser atendida con el stock actual.
     * Devuelve true si hay suficientes libros, false en caso contrario.
     * Lanza IllegalArgumentException si la cantidad es menor que 1.
     */
    public boolean hayStockSuficiente(int cantidad) {
        if (cantidad < 1) {
            throw new IllegalArgumentException("La cantidad debe ser al menos 1");
        }
        return cantidad <= totalLibros;
    }
}    
    


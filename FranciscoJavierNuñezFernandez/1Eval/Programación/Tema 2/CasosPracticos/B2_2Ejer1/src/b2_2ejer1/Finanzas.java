/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejer1;

/**
 *
 * @author ALUMNOS-FP
 */

public class Finanzas {
//Atributos
private double cambio;

//Constructores
public Finanzas(){
cambio=1.36;    
}

public Finanzas(double cambio){
    this.cambio=cambio;
}

//Setter
public void  setCambio(double cambio){
    this.cambio = cambio;
}

public double getCambio(){
    return cambio;
}

public double dolaresToEuros(double cantidad){
    return cantidad*cambio;
}
 
public double eurosToDolares(double cantidad){
    return cantidad/cambio;
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer5;

/**
 *
 * @author ALUMNOS-FP
 */
public class Rebajas {
    /*private double rebaja, original, porcentaje;
    
    public void setOriginal(double original){
    this.original=original;}
    
    public void setRebaja(double rebaja){
    this.rebaja=rebaja;}
    
    public double descubrePorcentaje(){
    this.porcentaje=100*(original-rebaja)/original;
    return porcentaje;
    }*/
    
    public double descubrePorcentaje(double original, double rebaja){
    return ((original-rebaja)/original)*100;
    }
    
        
    }
    
    
    
    
    
    
    
    
    
    
}

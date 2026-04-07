/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
public class Coche {
    private int velocidad;
    public Coche(){velocidad=0 ;}
    
    //Para saber la velocidad que lleva el vehiculo 
    public int getVelocidad(){
        return velocidad;
    }
    
    
    public void acelera(int cantidad){
    velocidad=velocidad+cantidad;
    }
            
            
    public void frena(int cantidad){
    if (velocidad - cantidad >= 0){
        velocidad = velocidad-cantidad;
                }
    else{
     velocidad = 0;   
    }
    }
}

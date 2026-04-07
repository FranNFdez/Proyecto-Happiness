/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_4ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
public class ArreglosPantalones {
    
    private double cintura,largo;
    
    public ArreglosPantalones(){
        this.cintura=60;
        this.largo=90;
    }
    
    public ArreglosPantalones(double largo,double cintura){
        this.cintura=cintura;
        this.largo=largo;
    }
    
    public double getLargo(){
        return this.largo;
    }
    
    public double getCintura(){
        return this.cintura;
    }
    
    public void setLargo(double largo){
        this.largo=largo;
    }
    
    public void setCintura(double cintura){
        this.cintura=cintura;
    }
    
    public double cortarLargo(double cantidad){
        if((this.largo-cantidad)>0)
             this.largo-=cantidad;
        else
            this.largo=0;
        return this.largo;
    }
    
    
}

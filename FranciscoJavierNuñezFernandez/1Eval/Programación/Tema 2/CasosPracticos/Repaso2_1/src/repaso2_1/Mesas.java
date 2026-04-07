/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2_1;

/**
 *
 * @author ALUMNOS-FP
 */
public class Mesas {
    private double largo, ancho,alto;
    private String material;
    
    public Mesas(){
        this.alto=1.5;
        this.ancho=2;
        this.largo=1;
        this.material="madera";
    }
    
    public Mesas(double ancho,double largo,String material){
        this.alto=1.5;
        this.ancho=ancho;
        this.largo=largo;
        this.material=material;
    }
    
    
    
    
    
    
}

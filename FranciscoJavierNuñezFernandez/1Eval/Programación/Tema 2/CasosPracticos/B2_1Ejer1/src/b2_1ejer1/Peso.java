/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
public class Peso {
    private double peso;
    public Peso(double peso, String medida)
  /*  switch(medida){
    case "Lb":
        this.peso = peso*getLibras();
        break;
    case "Li":
        this.peso = peso*getLingotes();
        break;
    case "Oz":
        this.peso = peso*getOnzas();
        break;
    case "P":
        this.peso = peso+getPeniques();
        break;
    case "G":
        this.peso = peso/1000;
        break;
    case "Q":
        this.peso = peso+getQuintales();
        break;
    default:
        System.out.println("Medida inexistente, se asumio como kilos");
        this.peso = peso;
        break;
    }*/
    this.peso = peso
            if (peso.equalsIgnoreCase("Lb")){
                this.peso = peso*getLibras();
            }
            
            if (peso.equalsIgnoreCase("Li")){
                this.peso = peso*getLingotes();
            }
            
            if (peso.equalsIgnoreCase("P")){
                this.peso = peso*getPeniques();
            }
            
            if (peso.equalsIgnoreCase("Q")){
                this.peso = peso*getQuintales();
            }
            
            if (peso.equalsIgnoreCase("Oz")){
                this.peso = peso*getOnzas();
            }
            
            if (peso.equalsIgnoreCase("G")){
                this.peso = peso/1000;            }
}
public double getLibras(){
    return peso/0.473;
}

public double getLingotes(){
    return peso/14.59;
}

public double getOnzas(){
    return peso/0.02835;
}

public double getPeniques(){
    return peso/0,00155;
}

public double getLibras(){
    return peso/0.453;
}

public double getQuintales(){
    return peso/43,3;
}

public double getPeso(String medida){
double resultado;

 switch(medida)
    case "Lb":
    return getLibras;
    case "Li":
        return getLingotes();
    case "Oz":
        return getOnzas();
       
    case "P":
        return getPeniques();
    case "K":
        return peso();
        
    case "G":
        return peso*1000;
      
    case "Q":
        return getQuintales();
       
    default://Kilos por defecto

    
}
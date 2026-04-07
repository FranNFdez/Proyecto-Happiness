/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
public class Número {
//Atributo    
private int numero;

//Constructores
public Número(){
numero=0;    
}    

public Número(int numero){
this.numero=numero;
}

//Metodos
public void aniade(int numero){
this.numero = this.numero+numero;
}

public void resta(int numero){
this.numero = this.numero-numero;
}

//Getters
public int getValor(){
return numero;
}

public int getDoble(){
return numero*2;
}

public int getTriple(){
return numero*3;
}

//Setters
public void setNumero(int numero){
this.numero=numero;
}

}

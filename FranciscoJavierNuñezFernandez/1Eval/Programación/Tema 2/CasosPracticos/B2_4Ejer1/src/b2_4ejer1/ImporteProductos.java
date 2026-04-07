/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_4ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
public class ImporteProductos {
   
    private double importe; 
    
    public ImporteProductos(){
        importe=0;
    }
    
    public double getImporteFinal(){
        return importe;
    }
   
   public void setImporteProductos(double importeDeseado){
           this.importe=importeDeseado;}
           
   public double PorcentajeIVA(double iva, double importeDeseado){
       return importe=importeDeseado+importeDeseado*(iva/100);
   }
    
   public double Año(int año, double importeDeseado){
       if (año<2020){
           System.out.println("\nEs outlet");
       
           return this.importe = importe-10;}
       
       else {
           System.out.println("\nNo es outlet");
           return this.importe;}  
   }

   
}
           
           
           
           
           


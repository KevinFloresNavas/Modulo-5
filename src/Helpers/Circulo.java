/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author kevin
 */
public class Circulo extends Formas {
     public Circulo()
    {
     
     Dibujar("Circulo");
     EstablecerColor("Rojo");
     
    }
    
 
    @Override
  public void Calcular()
  {
   double pi=3.14159265359;
   double radio=3;

   
   setArea(pi*(radio*radio));
   
      
        
   
  }
}

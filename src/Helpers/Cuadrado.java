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
public class Cuadrado extends Formas {
    public Cuadrado()
    {
     Dibujar("Cuadrado");
     EstablecerColor("Amarillo");
    }
     @Override
  public void Calcular()
  {
   //area de cuadrado= Largo x Ancho
   int l=5;
   int a=3;
   
   setArea(l*a);
      
  } 
}

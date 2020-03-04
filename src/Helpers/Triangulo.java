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
public class Triangulo  extends Formas{
     public Triangulo()
    {
     Dibujar("Triangulo");
     EstablecerColor("Azul");
    }
     @Override
  public void Calcular()
  {
  
      double  base, altura;
      base=5;
      altura=3;
      
      setArea((base*altura)/2);
     
      
      
       
  }
  
}

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
public class Formas {
   //Constructor
    public Formas()
    {
    }
    
   //Atributos 
    private  String Color;
    private String NombreFigura;
    private double Area;

    //Metodos de acceso
  
    public void EstablecerColor(String Color) {
        this.Color = Color;
    }
    public void Dibujar(String NombreFigura) {
        this.NombreFigura = NombreFigura;
    }
     public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }
   
    public void Dibujar()
    {}
    public void Calcular()
    {}
    public void imprimir()
    {
        System.out.println("Forma: "+NombreFigura);
        System.out.println("Color: "+Color);
        System.out.println("Area:  "+ Area);
    } 
}

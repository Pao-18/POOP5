/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *Esta clase se llama circulo y contiene los atributos del circulo 
 * @author estudiante
 */
public class Circulo {
    
    final float PI = 3.14f;
    private float radio;
    
    /**
     *Creacion del constructor vacio de la clase Circulo
     */
    public Circulo(){
    }
    
    /**
     *Creacion del constructor lleno de la clase circulo 
     * @param radio 
     */
    public Circulo(float radio){
        this.radio = radio;
    }
    
    /**
     *Metodo que regresa Radio del circulo 
     * @return radio 
     */
    public float getRadio(){
        return radio;
    }
    
    /**
     *Metodo que recibe el radio del circulo 
     * @param radio
     */
    public void setRadio(float radio){
        this.radio = radio;
    }
    
    /**
     *Metodo que calcula el perimetro del circulo y imprime el perimetro 
     */
    public void calcularPerimetro(){
        System.out.println("Perimetro: "+ 2*PI*radio);
    }
    
    /**
     *Metodo que calcula el area del circulo y imprime el area
     */
    public void calcularArea(){
        System.out.println("Area: " + PI*radio*radio);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *Esta es la clase Persona que contiene loas atributos de persona 
 * @author estudiante
 */
public class Persona {
    private int edad;
    private float altura;
    private String nombre;
    private Fecha fechaDeNacimiento;
    private String ocupacion;
    
    /**
     * Constructor vacio de la clase persona
     */
    public Persona(){
    }

    /**
     *Constructor lleno de la clase Persona 
     * @param edad
     * @param altura
     * @param nombre
     * @param fechaDeNacimiento
     * @param ocupacion
     */
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento, String ocupacion){
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.ocupacion = ocupacion;
    }
    /**
     * metodo que regresa edad
     * @return edad
     */
    public int getEdad(){
        return edad;
    }
    
    /**
     *Metodo que recibe edad 
     * @param edad
     */
    public void setEdad(int edad){
         this.edad = edad;
    }
    
    /**
     *Metodo que regresa altura 
     * @return altura
     */
    public float getAltura(){
        return altura;
    }
    
    /**
     *Metodo que recibe altura
     * @param altura
     */
    public void setAltura(float altura){
         this.altura = altura;
    }
    
    /**
     *Metodo que regresa nombre 
     * @return nombre 
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     *Metodo que recibe nombre 
     * @param nombre
     */
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    
    /**
     *Metodo que regresa la fecha de nacimiento 
     * @return fecha de nacimiento
     */
    public Fecha getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    
    /**
     *Metodo qye recibe la fecha de naciemiento de la persona 
     * @param fechaDeNacimiento
     */
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    /**
     *Metodo que regresa ocupacion de la persona 
     * @return ocupacionn 
     */
    public String getOcupacion(){
        return ocupacion;
    }
    
    /**
     *Metodo que recibe la ocupacion de la persona
     * @param ocupacion
     */
    public void setOcupacion(String ocupacion){
         this.ocupacion = ocupacion;
    }
    
    /**
     *Metodo que imprime los datos de la persona 
     */
    public void imprimirPersona(){
        
    }

    /**
     *Metodo comer que regresa un booleano 
     * @return true
     */
    public boolean Comer(){
        System.out.println(nombre + " esta comiendo");
        return true;
    }
    
    /**
     *Metodo jugar que regresa un booleano
     * @return true
     */
    public boolean Jugar(){
        System.out.println(nombre + " esta jugando");
        return true;
    }
    
    /**
     *  Metodo correr que regresa un entero 
     * @return v 
     */
    public int Correr(){
        int v = 8;
        System.out.println(nombre + " esta corriendo a " + v );
        return v;
    }
    
    /**
     *Metodo saludar que imprime el saludo de la persona 
     */
    public void Saludar(){
        System.out.println(nombre + " esta saludando");
    }
    
    /**
     *Metodo estudiar que imprime si la persona esta estudiando 
     */
    public void Estudiar(){
        System.out.println(nombre + " esta estudiando");
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    } 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *Esta clase llamada POOOP5 es la principal
 * @author estudiante
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("####### Circulo #######");
        /**
         * Creacion de unu nuevo objeto circulo 
         */
        Circulo circulo = new Circulo();
        System.out.println("Radio: " + circulo.getRadio());
        /** 
         * Metodo que recibe radio 
         */
        circulo.setRadio(7.77f);
        /**
         * Metodo que calcula el area
         */
        circulo.calcularArea();
        /**
         * Metodo que calcula el perimetro 
         */
        circulo.calcularPerimetro();
        
        System.out.println("####### Persona #######");
        /**
         * Creacion de un nuevo objeto llamado persona 
         */
        Persona persona = new Persona();
        /**
         * Inflando objeto 
         */
        persona.setEdad(19);
        persona.setAltura(1.50f);
        persona.setNombre("Janet García");
        /**
         * Creacion de un nuevo objeto llamado fecha de nacimiento
         */
        Fecha fechaDeNacimiento = new Fecha();
        /**
         * Inflando fecha de nacimiento
         */
        fechaDeNacimiento.setDia(30);
        fechaDeNacimiento.setMes(07);
        fechaDeNacimiento.setAño(2005);
        /**
         * Objeto recibe fecha de nacimiento 
         */
        persona.setFechaDeNacimiento(fechaDeNacimiento);
        /**
         * Objeto recibe la ocupacion 
         */
        persona.setOcupacion("Estudiante de la FI");
        /**
         * Impresion de persona 
         */
        System.out.println(persona);
        /**
         * metodo saludar de persona 
         */
        persona.Saludar();
        /**
         * Metodo jugar de persona 
         */
        persona.Jugar();
        /**
         * Metodo correr de persona 
         */
        persona.Correr();
        /**
         * Metodo que saluda de persona
         */
        persona.Saludar();
        /**
         * Metodo que dice si estudia o no persona 
         */
        persona.Estudiar();
    }
    
}
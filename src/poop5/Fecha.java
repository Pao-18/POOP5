/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *Creacion de clase fecha y iniciacion de atributos
 * @author estudiante
 */
class Fecha {
    private int dia;
    private int mes;
    private int año;
    /**
     * Constructor vacio de la clase fecha
     */
    public Fecha(){
    }
    /**
     * Constructor lleno de la clase fecha 
     * @param dia
     * @param mes
     * @param año 
     */
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    /**
     * Metodo que regresa dia
     * @return dia
     */
    public int getDia(){
        return dia;
    }
    /**
     * Metodo que recibe dia 
     * @param dia 
     */
    public void setDia(int dia){
         this.dia = dia;
    }
    /**
     * Metodo que regresa mes 
     * @return mes 
     */
    public int getMes(){
        return mes;
    }
    /**
     * Metodo que recibe mes 
     * @param mes 
     */
    
    public void setMes(int mes){
         this.mes = mes;
    }
    /**
     * Metodo que regresa año
     * @return año
     */
    public int getAño(){
        return año;
    }
    /**
     * Metodo que recibe año 
     * @param año 
     */
    public void setAño(int año){
        this.año = año;
    }
    /**
     * Metodo que imprime fecha 
     * @return dia, mes, año 
     */
    public String ImprimirFecha(){
        System.out.println(dia + "/" + mes + "/" + año);
        return (dia + "/" + mes + "/" + año);
    }
    /**
     * Override sirve para que el compilador compruebe que un método está siendo sobrescrito correctamente en tiempo de compilación
     * @return dia, mes, año
     */

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + año + '}';
    }
    
}
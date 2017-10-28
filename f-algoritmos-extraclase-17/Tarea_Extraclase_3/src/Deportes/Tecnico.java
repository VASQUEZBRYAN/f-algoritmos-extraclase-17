/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deportes;

/**
 *
 * @author Usuario
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad; 
    
    public Tecnico(String n,String f,int e){
        nombre= n;
        funcion= f;
        edad=e;
    }

    public String Obtener_Nombre() {
        return nombre;
    }

    public void Establecer_tNombre(String nombre) {
        this.nombre = nombre;
    }

    public String Obtener_Funcion() {
        return funcion;
    }

    public void Establecer_Funcion(String funcion) {
        this.funcion = funcion;
    }

    public int Obtener_Edad() {
        return edad;
    }

    public void Establecer_Edad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - %d años\n", Obtener_Nombre(),
                Obtener_Funcion(), Obtener_Edad());
        return cadena;
    }
    
    
}

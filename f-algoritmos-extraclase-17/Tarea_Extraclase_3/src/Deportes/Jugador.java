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
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad; 
    
    public Jugador(String n, String p,int ed){
        nombre=n;
        posicion=p;
        edad=ed;
    }

    public String Obtener_Nombre() {
        return nombre;
    }

    public void Establecer_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Obtener_Posicion() {
        return posicion;
    }

    public void Establecer_Posicion(String posicion) {
        this.posicion = posicion;
    }

    public int Obtener_Edad() {
        return edad;
    }

    public void Establecer_Edad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String cadena = String.format("%s - %s - %d años\n", Obtener_Nombre(),
                Obtener_Posicion(), Obtener_Edad());
        return cadena;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deportes;

import java.util.Arrays;
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador []jugadores;
    private Tecnico []tecnicos;
    // Costructor
    public Equipo ( Jugador []juga, Tecnico []tec ){
        nombre="'Boca Juniors'";
        jugadores=juga;
        tecnicos=tec;
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_siglas(String sig){
        siglas=sig;
    }
    public void establecer_anio_fundacion(int anio){
        anio_fundacion=anio;
    }
    public void establecer_jugadores(Jugador []juga ){
        jugadores=juga;
    }
    public void establecer_tecnicos(Tecnico []tec ){
        tecnicos=tec;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public int obtener_anio_fundacion(){
        return anio_fundacion;
    }
    public Jugador[] obtener_jugadores(){
        return jugadores;
    }
    public Tecnico[] obtener_tecnicos(){
        return tecnicos;
    }
    // Metodos
    public float obtener_promedio_edad_jugadores(){
        Jugador[] A = obtener_jugadores();
        float sum=0;
        for(int i=0; i<A.length; i++){
            Jugador me = A[i];
            sum+=me.Obtener_Edad();
        }
        float media_j=sum/A.length;
        return media_j;
    }
    public float obtener_promedio_edad_tecnicos(){
        Tecnico[] B = obtener_tecnicos();
        float sum=0;
        for(int i=0; i<B.length; i++){
            Tecnico me = B[i];
            sum+=me.Obtener_Edad();
        }
        float media_t=sum/B.length;
        return media_t;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Equipo: '%s'\n"
                + "Sus tecnicos son:\n"
                + "%s\n"
                + "Sus jugadores son:\n"
                + "%s\n"
                + "Promedio de edad de:\n"
                + "Tecnicos: %.2f años\n"
                + "Jugadores: %.2f años\n", 
                obtener_nombre(),
                Arrays.toString(obtener_tecnicos()),
                Arrays.toString(obtener_jugadores()),
                obtener_promedio_edad_tecnicos(),
                obtener_promedio_edad_jugadores());
        return cadena;
    }
}

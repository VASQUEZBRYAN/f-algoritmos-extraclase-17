/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Deportes.*;
public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j1 = new Jugador("Manuel Alvarez", "Arquero", 20);
        Jugador j2 = new Jugador("Eduardo Valencia", "Defensa", 21);
        Jugador j3 = new Jugador("Fabian Cevallos", "Defensa", 30);
        Jugador j4 = new Jugador("Antonio Lara", "Centrocampista", 32);
        Jugador j5 = new Jugador("Luis Delgado", "Centrocampista", 17);
        Jugador j6 = new Jugador("Xavier Lopez", "Delantero", 25);
        // Creacion de objetos tipo Tecnico
        Tecnico t1 = new Tecnico("Luis Gomez", "Tecnico Principal", 45);
        Tecnico t2 = new Tecnico("Julio Neto", "Asistente Tecnico", 46);
        Tecnico t3 = new Tecnico("Marco Silva", "Preparador Fisico", 47);
        // Creacion objeto tipo Equipo
        Jugador []j = {j1, j2, j3, j4, j5, j6};
        Tecnico []t = {t1, t2, t3};
        Equipo equ = new Equipo(j, t);
        System.out.println(equ);
    }
    }
    


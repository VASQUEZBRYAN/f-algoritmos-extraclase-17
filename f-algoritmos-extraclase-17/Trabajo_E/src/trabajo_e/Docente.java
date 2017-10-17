/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_e;

/**
 *
 * @author Usuario
 */
public class Docente {
    private String nombre;
    private String apellido;
    private String tercer_nivel_nivel;
    private String cuarto_nivel_nivel;
    private String asignatura_1;
    private String asignatura2;

    public Docente(String nombre1, String apellido, String tercer_nivel_nivel, String cuarto_nivel_nivel, String asignatura_1, String asignatura2) {
        this.nombre = nombre1;
        this.apellido = apellido;
        this.tercer_nivel_nivel = tercer_nivel_nivel;
        this.cuarto_nivel_nivel = cuarto_nivel_nivel;
        this.asignatura_1 = asignatura_1;
        this.asignatura2 = asignatura2;
    }
    
    

    @Override
    public String toString() {
        return "Datos del Docente:\n" + "Nombres:" + nombre + "Apellidos:" + apellido +
                "Tiene a su cargo las asignaturas:\n"+  "Asignatura 1:" + asignatura_1 +  "Asignatura 2:" + asignatura2 
                +"El docente tiene los siguientes titulos academicos:\n"+  "Titulo 3er nivel: " + tercer_nivel_nivel +  
                "Titulo 4er nivel:" + cuarto_nivel_nivel;
    }
    
}

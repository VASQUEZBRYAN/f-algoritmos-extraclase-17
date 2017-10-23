package paquete_estudiante;
import paquete_academico.Universidad;
import paquete_academico.Asignatura;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;
        // Metodos set
    public void establecer_nombres(String nom){
        nombres=nom;
    }
    public void establecer_apellidos(String apes){
        apellidos=apes;
    }
    public void establecer_asignatura_1(Asignatura asig1){
        asignatura_1=asig1;
    }
    public void establecer_asignatura_2(Asignatura asig2){
        asignatura_2=asig2;
    }
    public void establecer_universidad(Universidad uni){
        universidad=uni;
    }
    // Metodos get
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public Asignatura obtener_asignatura_1(){
        return asignatura_1;
    }
    public Asignatura obtener_asignatura_2(){
        return asignatura_2;
    }
    public Universidad obtener_universidad(){
        return universidad;
    }
    // Metodo toString   
    @Override
    public String toString(){
        String cadena = String.format("Datos del estudiante:\n"
                + "Nombres: %s \n"
                + "Apellidos: %s \n"
                + "Universidad: %s \n"
                + "Tiene las siguientes asignaturas:\n"
                + "Asignatura 1: %s \n"
                + "Asignatura 2: %s \n", obtener_nombres(), obtener_apellidos(), obtener_universidad(), obtener_asignatura_1(), obtener_asignatura_2());
        return cadena;
    }
}

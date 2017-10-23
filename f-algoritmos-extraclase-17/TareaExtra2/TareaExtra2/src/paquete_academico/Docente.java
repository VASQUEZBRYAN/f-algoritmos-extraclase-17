package paquete_academico;
import paquete_general.Pais;

public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;
    // Metodos set
    public void establecer_nombres(String nom){
        nombres=nom;
    }
    public void establecer_apellidos(String apes){
        apellidos=apes;
    }
    public void establecer_pais(Pais pa){
        pais=pa;
    }
    // Metodos get
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public Pais obtener_pais(){
        return pais;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Docente: %s %s - pais %s ", obtener_nombres(), obtener_apellidos(), obtener_pais());
        return cadena;
    }
}

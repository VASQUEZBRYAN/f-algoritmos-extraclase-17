package paquete_academico;
import paquete_general.Pais;

public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_siglas(String sig){
        siglas=sig;
    }
    public void establecer_pais(Pais pa){
        pais=pa;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public Pais obtener_pais(){
        return pais;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s (%s) - %s ", obtener_nombre(), obtener_siglas(), obtener_pais());
        return cadena;
    }
}

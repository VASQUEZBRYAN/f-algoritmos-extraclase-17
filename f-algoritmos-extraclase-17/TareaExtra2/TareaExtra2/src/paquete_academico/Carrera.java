package paquete_academico;

public class Carrera {
    private String nombre;
    private String modalidad;
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_modalidad(String mod){
        modalidad=mod;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_modalidad(){
        return modalidad;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format(" %s - modalidad (%s). ", obtener_nombre(), obtener_modalidad());
        return cadena;
    }
}

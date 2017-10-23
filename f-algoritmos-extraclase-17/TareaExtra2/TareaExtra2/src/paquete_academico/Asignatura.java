package paquete_academico;

public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_creditos(int creds){
        creditos=creds;
    }
    public void establecer_carrera(Carrera carr){
        carrera=carr;
    }
    public void establecer_docente(Docente doc){
        docente=doc;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    public Docente obtener_docente(){
        return docente;
    }
    // Metodo toString   
    @Override
    public String toString(){
        String cadena = String.format("%s (%d creditos) de la carrera %s %s", obtener_nombre(), obtener_creditos(), obtener_carrera(), obtener_docente());
        return cadena;
    }
}

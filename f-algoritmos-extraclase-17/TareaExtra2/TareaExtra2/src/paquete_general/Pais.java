package paquete_general;

public class Pais {
    private String nombre;
    // Metodo set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    // Metodo get
    public String obtener_nombre(){
        return nombre;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s", obtener_nombre());
        return cadena;
    }
}

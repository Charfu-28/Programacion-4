package modelo;

public class Cliente {
    
    private int Cedula;
    private String nombre;
       
    public Cliente(int ced, String nom){
        
        this.Cedula = ced;
        this.nombre = nom;
    }
    
    public Cliente(){}

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar() 
    {
        System.out.println("Cedula: " + this.getCedula());
        System.out.println("Nombre: " + this.getNombre());                
    }
}

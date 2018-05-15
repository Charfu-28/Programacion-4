package modelo;

public class Producto {
    
    private String registroIca;
    private String nombre;
    private int cantidad;
    private float precio;
    
    /*public Producto(String registroIca, String nombre, int cantidad, float precio){
        this.registroIca = registroIca;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;   
    }
    */
    public Producto(){}

    public String getRegistroIca() {
        return registroIca;
    }

    public void setRegistroIca(String registroIca) {
        this.registroIca = registroIca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrar(Producto producto)
    {
        System.out.println("RegistroIca: "+ producto.getRegistroIca());
        System.out.println("Nombre Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Precio Unidad: " + producto.getPrecio());
    }    
}

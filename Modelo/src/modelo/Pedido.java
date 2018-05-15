package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private int Numfactura;    
    private String fecha;
    private Cliente datos = null;
    private Producto producto = null;
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private List<Producto> productos = new ArrayList<Producto>();
    
    public Pedido(int Numfactura, String fecha, Cliente dat, Producto producto)
    {
        super();
        this.Numfactura = Numfactura;        
        this.fecha = fecha; 
        this.datos = dat;
        this.producto = producto;             
    }
    
    public Pedido(){}
    
    public int getNumfactura() {
        return Numfactura;
    }

    public void setNumfactura(int Numfactura) {
        this.Numfactura = Numfactura;
    }

    public Cliente getDatos() {
        return datos;
    }

    public void setDatos(Cliente datos) {
        this.datos = datos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public  List<Pedido> obtenerPedidos(){
        return pedidos;
    }
    
    public void agregarPedidos(Pedido pedido){
            obtenerPedidos().add(pedido);
    }   
        
    public  List<Producto> obtenerProductos(){
        return productos;
    }
    
    public void agregarProductos(Producto producto){
            obtenerProductos().add(producto);
    }
}

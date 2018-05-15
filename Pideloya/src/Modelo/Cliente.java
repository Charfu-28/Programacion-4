package Modelo;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author andres
 */
public abstract class Cliente {
    
    private String nombre;
    private String direccion;
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    
    public Cliente() {}
    
    public Cliente (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public abstract String getCliente();
      
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public  List<Pedido> obtenerPedidos(){
        return pedidos;
    }
        
    public void agregarPedidos(Pedido pedido){
        obtenerPedidos().add(pedido);
    }
}

package Modelo;
/**
 *
 * @author andres
 */
public class Pedido {
    
    private String numeroPedido;
    private Integer cantidad;
    private float precioPorUnidad;
    
    public Pedido(){}
    
    public Pedido (String numeroPedido, Integer cantidad, float precioPorUnidad){
        this.numeroPedido = numeroPedido;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(float precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
}

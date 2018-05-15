package Modelo;
/**
 *
 * @author andres
 */
public class ClientePersonal extends Cliente{
    
    private Integer numeroTarjetaCredito; 
    
    public ClientePersonal(){}
    
    public ClientePersonal (String nombre, String direccion, Integer numeroTarjetaCredito){
        super(nombre, direccion);
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Integer getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(Integer numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    @Override
    public String getCliente() {
        return "Soy un Cliente Personal";
    }
}

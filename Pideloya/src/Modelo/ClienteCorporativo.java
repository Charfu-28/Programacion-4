package Modelo;
/**
 *
 * @author andres
 */
public class ClienteCorporativo extends Cliente {
    
    private String nombreRepresentanteLegal;
    
    public ClienteCorporativo(){}
    
    public ClienteCorporativo (String nombre, String direccion, String nombreRepresentanteLegal){
        super(nombre, direccion);
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }    

    @Override
    public String getCliente() {
        return "Soy un Cliente Corporativo";
    }
}

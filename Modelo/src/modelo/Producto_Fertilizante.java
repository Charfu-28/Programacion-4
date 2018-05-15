package modelo;

public class Producto_Fertilizante extends Producto {
    
    private String fechaUltimaAplicación;
    private String frecuenciaAplicacion;
    
    public String getFechaUltimaAplicación() {
        return fechaUltimaAplicación;
    }

    public String getFrecuenciaAplicacion() {
        return frecuenciaAplicacion;
    }

    public void setFrecuenciaAplicacion(String frecuenciaAplicacion) {
        this.frecuenciaAplicacion = frecuenciaAplicacion;
    }
    
    public void setFechaUltimaAplicación(String fechaUltimaAplicación) {
        this.fechaUltimaAplicación = fechaUltimaAplicación;
     }
  
    public void mostrar(Producto_Fertilizante productoFertilizante)
    {
        super.mostrar(productoFertilizante);
        System.out.println("Frecuencia Aplicacion: " + productoFertilizante.getFrecuenciaAplicacion());
        System.out.println("Fecha Ultima Aplicacion: " + productoFertilizante.getFechaUltimaAplicación());        
    }
}

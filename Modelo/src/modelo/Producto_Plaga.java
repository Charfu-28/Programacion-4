package modelo;

public class Producto_Plaga extends Producto {
    
    private String periodoCarencia;
    private String frecuenciaAplicacion;
    
    public String getPeriodoCarencia() {
        return periodoCarencia;
    }

    public void setPeriodoCarencia(String periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }

    public String getFrecuenciaAplicacion() {
        return frecuenciaAplicacion;
    }

    public void setFrecuenciaAplicacion(String frecuenciaAplicacion) {
        this.frecuenciaAplicacion = frecuenciaAplicacion;
    }
        
    public void mostrar() 
    {
        super.mostrar(this);
        System.out.println("Frecuencia Aplicacion: " + this.getFrecuenciaAplicacion());
        System.out.println("Periodo de Carencia: " + this.getPeriodoCarencia());        
    }
}

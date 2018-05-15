package modelo;

public class Antibiotico extends Producto{
    
    private String dosis;
    private String tipoAnimal;
        
    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    public void mostrar() 
    {
        super.mostrar(this);
        System.out.println("Dosis: " + this.getDosis());
        System.out.println("Tipo de Animal: " + this.getTipoAnimal());        
    }
}

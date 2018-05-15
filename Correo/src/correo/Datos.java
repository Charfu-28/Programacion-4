package correo;

public class Datos {
    
    private Object Id;
    private Object dominio;
    private Object password;
    
    //=============================================================================================
    public Datos()
    {
        Id = 0;
        dominio = 0;
        password = 0;
    }
    public Datos(Object Id, Object dominio, Object password)
    {
        this.Id = Id;
        this.dominio = dominio;
        this.password = password;                
    }    
    //=============================================================================================
    public void Mostrar()
    {
        System.out.println("Correo Ingresado");
        System.out.println("Correo: " + Id + "@"+ dominio + ".com");        
        System.out.println("OPERACION FINALIZADA");
    }
    //=============================================================================================
    public Object getId() {
        return Id;
    }
    //=============================================================================================
    public void setId(Object Id) {
        this.Id = Id;
    }
    //=============================================================================================
    public Object getDominio() {
        return dominio;
    }
    //=============================================================================================
    public void setDominio(Object dominio) {
        this.dominio = dominio;
    }
    //=============================================================================================
    public Object getPassword() {
        return password;
    }
    //=============================================================================================
    public void setPassword(Object password) {
        this.password = password;
    }    
}

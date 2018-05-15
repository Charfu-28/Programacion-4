package cuenta;

public class Cliente {
    
    static float NumCuenta = 100000;
    private String DNI;       
    
    public Cliente()
    {
        NumCuenta ++;
        DNI = "";               
    }
    
    public Cliente(String DNI)
    {
        NumCuenta ++;
        this.DNI = DNI;        
    }    
    
    public void Mostrar()
    {
        System.out.println("Numero de Cuenta: " + NumCuenta);
        System.out.println("DNI Usuario: " + DNI);        
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }   
    
    public double getNumCuenta() {
        return NumCuenta;
    }    
}

package cuenta;

public class Operaciones_Cuenta {
    
    private float Saldo;
    private float Interes;   
   
    float a,i,r;    
    
    public Operaciones_Cuenta()
    {  
        Saldo = 0 ;
        Interes = 0;        
    }
    
    public Operaciones_Cuenta(float Saldo, float Interes)
    {  
        this.Saldo = Saldo;
        this.Interes = Interes;
    }
    
    public void Ingresar(float ing)
    {
        i = ing;
        this.Saldo = this.Saldo + ing;
    }
    
    public void Retirar(float Ret)
    {
        if (this.Saldo >= Ret)
        {
            r = Ret;
            this.Saldo = this.Saldo - Ret;
        }
        else
        {
            System.out.println("No Tiene Saldo Suficiente");
            r = Ret;
        }
    } 
    
    public void ActualizarSaldo()
    {        
        a = ((this.Saldo*this.Interes)/100);       
    }
    
    public void Mostrar()
    {     
        System.out.println("Saldo En Cuenta: " + (Saldo-i+r));
        System.out.println("Porcentaje Interes Anual: " + Interes +(" % "));
        System.out.println("Monto Consignado: " + i);
        System.out.println("Monto Retirado: " + r);
        System.out.println("Saldo Actualizado: " + (Saldo+a-r));
        System.out.println("OPERACION FINALIZADA");
    }
    
    public double getSaldo() {
        return Saldo;
    }
    
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    public double getInteres() {
        return Interes;
    }
    
    public void setInteres(float Interes) {
        this.Interes = Interes;
    }
}

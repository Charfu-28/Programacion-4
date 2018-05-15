package cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuenta {

    public static void main(String[] args) throws IOException {        
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       
        String DNI,Continuar = "s";
        float saldo, interes, ingreso, retiro;    
               
        while (Continuar.equals("s"))
        {  
            System.out.println("CUENTA BANCARIA");
            
            System.out.println("Ingrese su DNI: ");
            DNI = entrada.readLine();
            
            System.out.println("Ingrese su Saldo: ");
            saldo = Integer.parseInt(entrada.readLine());           
            
            System.out.println("Ingrese Interes Anual: "  +("%"));
            interes = Integer.parseInt(entrada.readLine()); 
            
            System.out.println("Monto a Ingresar: ");
            ingreso = Integer.parseInt(entrada.readLine());
            
            System.out.println("Monto a Retirar: ");
            retiro = Integer.parseInt(entrada.readLine());
            
            Cliente Clientes = new Cliente(); 
            Clientes.setDNI(DNI);             
            Clientes.Mostrar();            
            Operaciones_Cuenta clientes = new Operaciones_Cuenta();
            clientes.setSaldo(saldo);                   
            clientes.setInteres(interes);
            clientes.Ingresar(ingreso);
            clientes.ActualizarSaldo();
            clientes.Retirar(retiro);   
            clientes.Mostrar();
            
            System.out.println("Desea Ingresar mas contactos a la agenda? [S/N]:");
            Continuar = entrada.readLine();              
        }          
    }    
}

/*
    2. Se requiere de un programa que permita capturar e imprimir los datos de dos cuentas de correo electronico. 
    Cada dato de la cuenta de correo (Id, dominio y password) dede digitarse por separado.
    Al imprimirse la cuenta los datos de ID y dominio deben aparecer unidos. Por ejemplo: zelaya.luis@gmail.com.
 */
package correo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correo {

    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));        
        Object Id, dom, pass,Continuar = "s";
        Datos Clientes = new Datos(); 
        
        while (Continuar.equals("s"))
        {              
            System.out.println("Ingrese Id: ");
            Id = entrada.readLine();
            
            System.out.println("Ingrese dominio: ");
            dom = entrada.readLine();           
            
            System.out.println("Ingrese Contraseña: ");
            pass = entrada.readLine();           
                        
            Clientes.setId(Id);
            Clientes.setDominio(dom);                   
            Clientes.setPassword(pass);
            Clientes.Mostrar();            
                        
            System.out.println("Desea Ingresar mas contactos a la agenda? [S/N]:");
            Continuar = entrada.readLine();              
        }        
    }
    
}

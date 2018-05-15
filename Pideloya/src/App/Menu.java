package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author andres
 */
public class Menu {    
    
    public static void menu() throws NumberFormatException, IOException {
        Integer opcion;        
        // Menu principal para escoger tipo de cliente
        do {
            System.out.println("Bienvenido al Sistema de Pedidos en Linea, por favor escoja su tipo de Cliente:\n");            
            System.out.println("1.Cliente Corporativo");
            System.out.println("2.Cliente Personal");
            System.out.println("3.Salir");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion){
            case 1:
                MenuClienteCorporativo.menuClienteCorporativo();                                
                break;
            case 2:
                MenuClientePersonal.menuClientePersonal();
                break;
            default:
                opcion = 3;               
                System.out.println("\n Ha salido del sistema");
                break;
            }
        } while (opcion != 3);
    }
}

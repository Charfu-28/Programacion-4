package App;

import Modelo.ClienteCorporativo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Modelo.*;
/**
 *
 * @author andres
 */
public class MenuClienteCorporativo extends Menu {
    
    // Menu para el cliente corporativo 
    public static void menuClienteCorporativo() throws NumberFormatException, IOException {
        ClienteCorporativo clienteCorporativo =  null;
        Integer opcion;

        do{
            System.out.println("Por favor escoja una opcion\n");         
            System.out.println("1. Hacer pedido Cliente Corporativo");
            System.out.println("2. Mostrar pedido Cliente Corporativo ");
            System.out.println("3. Salir");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(entrada.readLine());

            switch(opcion){
                case 1:
                    clienteCorporativo = MenuClienteCorporativo.crearCliente();
                    break;
                case 2:
                    MenuClienteCorporativo.mostrarCliente(clienteCorporativo);
                    break;
            }
        }while (opcion != 3);
    }

    static public ClienteCorporativo crearCliente() throws NumberFormatException, IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        // Aca debo ingresar todos los datos del cliente corporativo y crear la lista de pedidos
        System.out.println("INGRESE LOS DATOS DEL CLIENTE COORPORATIVO");
        System.out.println();

        System.out.println("Nombre de Cliente Corporativo:");
        String nombre = entrada.readLine();

        System.out.println("Direccion de Cliente Corporativo:");
        String direccion = entrada.readLine();

        System.out.println("Nombre del Representante Legal:");
        String nombreRepresentanteLegal = entrada.readLine();

        // Crear cliente corporativo
        ClienteCorporativo clienteCorporativo = new ClienteCorporativo(nombre, direccion, nombreRepresentanteLegal);
        System.out.println(clienteCorporativo.getCliente());

        System.out.println("\nINGRESE LOS DATOS DEL PEDIDO A REALIZAR");

        do {
                System.out.println("Numero de Pedido:");
                String numeroPedido = entrada.readLine();
                
                System.out.println("Cantidad:");
                Integer cantidad = Integer.parseInt(entrada.readLine());                

                System.out.println("Precio");
                Integer precio = Integer.parseInt(entrada.readLine());

                // Crea objeto Pedido y hace relacion con ClienteCorporativo
                Pedido pedido = new Pedido(numeroPedido, cantidad, precio);

                clienteCorporativo.agregarPedidos(pedido);

                System.out.println("Desea Ingresar más pedidos [S/N]");

        } while (entrada.readLine().equals("s"));

        return clienteCorporativo;
    }
    //Mostrar Pedido Cliente Corporativo
    static public void mostrarCliente(ClienteCorporativo clienteCorporativo) throws NumberFormatException, IOException {
        System.out.println();
        System.out.println("Informacion del cliente corporativo: ");

        System.out.println("Nombre del cliente: " + clienteCorporativo.getNombre());
        System.out.println("Direccion :" + clienteCorporativo.getDireccion());
        System.out.println("Nombre del representante Legal:" + clienteCorporativo.getNombreRepresentanteLegal());        
        // Mostrar los pedidos de cliente corporativo
        for (Pedido pedido : clienteCorporativo.obtenerPedidos()) {
            System.out.println("Numero de Pedido: "+ pedido.getNumeroPedido());
            System.out.println("Precio: " + pedido.getPrecioPorUnidad());
            System.out.println("Cantidad: "+ pedido.getCantidad());          
        }
    }
}

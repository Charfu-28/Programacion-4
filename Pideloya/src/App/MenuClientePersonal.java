package App;

import Modelo.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author andres
 */
public class MenuClientePersonal {
    
    public static void menuClientePersonal() throws NumberFormatException, IOException {
            
        ClientePersonal clientePersonal = null;
        Integer opcion;

        do{
           System.out.println("Por Favor escoja una opcion");         
           System.out.println("1. Hacer pedido Cliente Personal");
           System.out.println("2. Mostrar pedido Cliente Personal ");
           System.out.println("3. Salir");

           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           opcion = Integer.parseInt(entrada.readLine());

            switch(opcion){
                case 1:
                    clientePersonal = MenuClientePersonal.crearCliente();
                    break;
                case 2:
                    MenuClientePersonal.mostrarCliente(clientePersonal);
                    break;
            }
        }while (opcion != 3);
    }

    static public ClientePersonal crearCliente() throws NumberFormatException, IOException {

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("INGRESE LOS DATOS DEL CLIENTE PERSONAL");
            System.out.println();

            System.out.println("Nombre de Cliente Personal:");
            String nombreCliente = entrada.readLine();

            System.out.println("Direccion de Cliente Personal:");
            String direccionCliente = entrada.readLine();

            System.out.println("Ingrese el numero de su tarjeta de credito:");
            Integer numeroTarjetaCredito = Integer.parseInt(entrada.readLine());
            
            // Crear objeto ClientePersonal
            ClientePersonal clientePersonal = new ClientePersonal(nombreCliente, direccionCliente, numeroTarjetaCredito);
            System.out.println(clientePersonal.getCliente());
            // Crea objeto Pedido y hace relacion con ClientePersonal
            do {
                System.out.println("Numero de Pedido:");
                String numeroPedido = entrada.readLine();

                System.out.println("Cantidad:");
                Integer cantidad = Integer.parseInt(entrada.readLine());                

                System.out.println("Precio");
                Integer precio = Integer.parseInt(entrada.readLine());

                // Crea objeto Pedido y hace relacion con ClienteCorporativo
                Pedido pedido = new Pedido(numeroPedido, cantidad, precio);
                clientePersonal.agregarPedidos(pedido);

                System.out.println("Desea ingresar mas pedidos [S/N]");

            } while (entrada.readLine().equals("s"));

            return clientePersonal;
    }

    static public void mostrarCliente(ClientePersonal clientePersonal) throws NumberFormatException, IOException{
        System.out.println();
        System.out.println("Informacion del cliente personal");

        System.out.println("Nombre del cliente:" + clientePersonal.getNombre());
        System.out.println("Direccion:" + clientePersonal.getDireccion());
        System.out.println("Tarjeta de credito:" + clientePersonal.getNumeroTarjetaCredito());      
        // Mostrar los pedidos de cliente personal
        for (Pedido pedido : clientePersonal.obtenerPedidos()){
            System.out.println("Numero de Pedido:" + pedido.getNumeroPedido());
            System.out.println("Precio:" + pedido.getPrecioPorUnidad());
            System.out.println("Cantidad:" + pedido.getCantidad());          
        }
    }
}

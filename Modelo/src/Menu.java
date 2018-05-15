//@Andrés Charfuelán G
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class Menu {
    //Menu Principal 
    public static void menu() throws NumberFormatException, IOException {     
        Integer opcion;       
        do {
            System.out.println("    BIENVENIDO AL SISTEMA DE FACTURACION");
            System.out.println("Digite el Número de la Operacion que desa realizar:\n");            
            System.out.println("1. Crear Factura");
            System.out.println("2. Mostrar Factura");
            System.out.println("3. Buscar Factura");
            System.out.println("4. Eliminar Factura");
            System.out.println("5. Salir\n");
            System.out.println("Nǘmero de Opcion: ");
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion){
            case 1:                
                Menu.menuCrearPedido();
                break;
                
            case 2:
                 Menu.MostrarFactura();
                break;
            
            case 3:
               
                break;
                
            case 4:
                
                break;
                    
            default:
                opcion = 5;
                System.out.println();
                System.out.println("Ha salido del Sistema");
                break;
            }

        } while (opcion != 5);
    }
    //Metodo para llenar datos de factura Producto_Fertilizante    
    static public void menuCrearPedido() throws NumberFormatException, IOException {   
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("Nombre del Cliente: ");
        String nombreCliente = entrada.readLine();
        
        System.out.println("Cedula del Cliente: ");
        Integer cedulaCliente = Integer.parseInt(entrada.readLine());
        
        Cliente cliente = new Cliente(cedulaCliente, nombreCliente);
        
        System.out.println("Numero de Factura: ");
        Integer numeroFactura= Integer.parseInt(entrada.readLine()); 
        
        System.out.println("Fecha: ");
        String fecha = entrada.readLine();
        
        System.out.println("\nFavor Ingrese los datos del Producto: ");
        
        do {            
            System.out.println("Digite el Número del Producto que desa Facturar:"
                                   + "\n 1. Producto de Control Fertilizante "+
                                     "\n 2. Producto de Control Plagas "+
                                     "\n 3. Antibiotico"+
                                     "\n 4. Salir");
            int tipoProducto = Integer.parseInt(entrada.readLine());
            
            switch (tipoProducto) {
                case 1:
                    Fertilizante();
                    break;
                case 2:
                    Plagas();
                    break;
                case 3:
                    Antibiotico();
                    break;
                default:
                    tipoProducto = 4;                   
                    break;
            }            
            System.out.println("Desea ingresar mas pedidos [S/N]");
        } while (entrada.readLine().equals("s"));  
    }
    //Metodo Para Crear Producto Control fertilizante
    static public void Fertilizante() throws NumberFormatException, IOException 
    {   List<Producto> producto = new ArrayList<>();             
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Registro Ica: ");
        String registroIca = entrada.readLine();
        System.out.println("Nombre del Producto: ");
        String nombreProducto= entrada.readLine();                               
        System.out.println("Cantidad: ");
        Integer cantidad = Integer.parseInt(entrada.readLine());
        System.out.println("Precio Unidad: ");
        float precioUnidad = Integer.parseInt(entrada.readLine()); 
        System.out.println("Frecuencia de Aplicacion: ");
        String frecuencia = entrada.readLine();
        System.out.println("Frecuencia de Ultima Aplicacion: ");
        String frecuenciaU = entrada.readLine();

        Producto_Fertilizante fertilizante = new Producto_Fertilizante();
        fertilizante.setRegistroIca(registroIca);
        fertilizante.setNombre(nombreProducto);
        fertilizante.setCantidad(cantidad);
        fertilizante.setPrecio(precioUnidad);
        fertilizante.setFrecuenciaAplicacion(frecuencia);
        fertilizante.setFechaUltimaAplicación(frecuenciaU);
        producto.add(fertilizante);
    }
    //Metodo Para Crear Producto Control Plagas
    static public void Plagas() throws NumberFormatException, IOException 
    {   List<Producto> producto = new ArrayList<>();             
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Registro Ica: ");
        String registroIca = entrada.readLine();
        System.out.println("Nombre del Producto: ");
        String nombreProducto= entrada.readLine();                               
        System.out.println("Cantidad: ");
        Integer cantidad = Integer.parseInt(entrada.readLine());
        System.out.println("Precio Unidad: ");
        float precioUnidad = Integer.parseInt(entrada.readLine()); 
        System.out.println("Frecuencia de Aplicacion: ");
        String frecuenciaUl = entrada.readLine();
        System.out.println("Periodo de Carencia: ");
        String periodo = entrada.readLine();        

        Producto_Plaga plaga = new Producto_Plaga();
        plaga.setRegistroIca(registroIca);
        plaga.setNombre(nombreProducto);
        plaga.setCantidad(cantidad);
        plaga.setPrecio(precioUnidad);        
        plaga.setFrecuenciaAplicacion(frecuenciaUl);
        plaga.setPeriodoCarencia(periodo);
        producto.add(plaga);
    }
    //Metodo Para Crear Producto Antibiotico
    static public void Antibiotico() throws NumberFormatException, IOException 
    {   List<Producto> producto = new ArrayList<>();             
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Registro Ica: ");
        String registroIca = entrada.readLine();
        System.out.println("Nombre del Producto: ");
        String nombreProducto= entrada.readLine();                               
        System.out.println("Cantidad: ");
        Integer cantidad = Integer.parseInt(entrada.readLine());
        System.out.println("Precio Unidad: ");
        float precioUnidad = Integer.parseInt(entrada.readLine()); 
        System.out.println("Dosis: ");
        String dosis = entrada.readLine();
        System.out.println("Tipo de Animal: ");
        String tipoAnimal= entrada.readLine();        

        Antibiotico antibiotico = new Antibiotico();
        antibiotico.setRegistroIca(registroIca);
        antibiotico.setNombre(nombreProducto);
        antibiotico.setCantidad(cantidad);
        antibiotico.setPrecio(precioUnidad);        
        antibiotico.setDosis(dosis);
        antibiotico.setTipoAnimal(tipoAnimal);
        producto.add(antibiotico);
    }
    //Metodo Para Buscar factura
    static public void MostrarFactura() throws NumberFormatException, IOException
    {
        List<Producto> productos = new ArrayList<>();

        Producto_Plaga plaga =  new Producto_Plaga();
        plaga.setRegistroIca("plaga-123-XX");        
        plaga.setNombre("Plgaz");        
        plaga.setCantidad(2);
        plaga.setPrecio(15200);
        plaga.setFrecuenciaAplicacion("15 dias");
        plaga.setPeriodoCarencia("30 dias");
        
        Producto_Fertilizante fertilizante = new Producto_Fertilizante();
        fertilizante.setRegistroIca("fertilizante-345-XX");        
        fertilizante.setNombre("Fertz"); 
        fertilizante.setCantidad(2);
        fertilizante.setPrecio(15200);
        fertilizante.setFrecuenciaAplicacion("28 dias");
        fertilizante.setFechaUltimaAplicación("40 dias");
        
        Antibiotico antibiotico = new Antibiotico();
        antibiotico.setRegistroIca("plaga-123-XX");        
        antibiotico.setNombre("Plgaz");
        antibiotico.setCantidad(2);
        antibiotico.setPrecio(15200);
        antibiotico.setRegistroIca("Antibiotico-345-XX");        
        antibiotico.setNombre("Fertz");     
        
        productos.add(plaga);
        productos.add(fertilizante);
        productos.add(antibiotico);

        for (Producto producto : productos)
        {
            if (producto instanceof  Producto_Plaga){
                System.out.println("\nPRODUCTOS PLAGA");
                ((Producto_Plaga) producto).mostrar();
            }
            else if (producto instanceof  Antibiotico){
                System.out.println("\nANTIBIOTICO");
                ((Antibiotico) producto).mostrar();
            }
            else 
            {
                System.out.println("\nPRODUCTOS FERTILIZANTE");
                ((Producto_Fertilizante) producto).mostrar((Producto_Fertilizante) producto);                
            }		  
        }
    }
 }


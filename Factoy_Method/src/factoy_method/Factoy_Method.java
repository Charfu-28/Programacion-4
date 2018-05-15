package factoy_method;

/**
 *
 * @author andres
 */
public class Factoy_Method {

    public static void main(String[] args) {
        
        TrianguloFactoryMethod factory = new TrianguloFactory();
        Triangulo triangulo = factory.crearTriangulo(5, 5, 8);
        System.out.println(triangulo.getDescripcion());
   }
    
}

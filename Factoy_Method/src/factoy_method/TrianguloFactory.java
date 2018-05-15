package factoy_method;

import java.util.Objects;

/**
 *
 * @author andres
 */
public class TrianguloFactory implements TrianguloFactoryMethod{

    @Override
    public Triangulo crearTriangulo(Integer ladoA, Integer ladoB, Integer ladoC) {
        
        if((Objects.equals(ladoA, ladoB)) && (Objects.equals(ladoA, ladoC))){
            return new Equilatero(ladoA, ladoB, ladoC);
        }
        
        else if ((!Objects.equals(ladoA, ladoB)) && (!Objects.equals(ladoA, ladoC)) && (!Objects.equals(ladoB, ladoC))){
            return new Escaleno(ladoA, ladoB, ladoC);
        }
        
        else{
            return new Isosceles(ladoA, ladoB, ladoC);
        }
    }
     
}

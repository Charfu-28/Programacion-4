package factoy_method;
/**
 *
 * @author andres
 */
public class Equilatero extends Triangulo{

    public Equilatero(Integer ladoA, Integer ladoB, Integer ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Este es un Triangulo Equilatero";
    }
    
}

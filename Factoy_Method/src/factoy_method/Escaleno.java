package factoy_method;
/**
 *
 * @author andres
 */
public class Escaleno extends Triangulo {

    public Escaleno(Integer ladoA, Integer ladoB, Integer ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Éste es un Triangulo Escaleno";
    }
    
}

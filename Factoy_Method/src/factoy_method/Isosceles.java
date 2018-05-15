package factoy_method;
/**
 *
 * @author andres
 */
public class Isosceles extends Triangulo{ 

    public Isosceles(Integer ladoA, Integer ladoB, Integer ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescripcion() {
        return "Éste es un Triangulo Isosceles";
    }
    
}

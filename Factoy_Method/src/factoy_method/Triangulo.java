package factoy_method;
/**
 *
 * @author andres
 */
public abstract class Triangulo {
    private Integer ladoA;
    private Integer ladoB;
    private Integer ladoC;
    
    public Triangulo(Integer ladoA, Integer ladoB, Integer ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public abstract String getDescripcion();    //Metodo a Sobrescribir

    public Integer getLadoA() {
        return ladoA;
    }

    public void setLadoA(Integer ladoA) {
        this.ladoA = ladoA;
    }

    public Integer getLadoB() {
        return ladoB;
    }

    public void setLadoB(Integer ladoB) {
        this.ladoB = ladoB;
    }

    public Integer getLadoC() {
        return ladoC;
    }

    public void setLadoC(Integer ladoC) {
        this.ladoC = ladoC;
    }
}

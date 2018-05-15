package sudoku;

public class Tablero {
    
    private Celda[][] celda = new Celda[9][9];

    public Tablero() {
        
        // Inicializa celdas
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                celda[r][c] = new Celda(r, c);
            }
        }
        
        // Inicializa observadores
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                celda[r][c].addObserver(celda);
            }
        }
    }
    
    // Fija valores conocidos
    public void Preparar(int[][] puzzle) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (puzzle[r][c] != 0) {
                    celda[r][c].setValue(puzzle[r][c]);
                }
            }
        }
    }
    
    //Llena los Casilla ConCandidato Unico
    public void llenarCasCandUnico(){
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (celda[r][c].getValue()!=0) {
                    int a = celda[r][c].getValue();
                    celda[r][c].setValue(a);
                }
            }
        }
    }
    
    //Analiza si hay casillas que solo tienen un posible candidato
    public boolean casCandUnico(){
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (celda[r][c].sizeValues()==1 &&  celda[r][c].getState()==false) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //Comprueba si es soluble o no
    public boolean siSoluble(){
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (celda[r][c].sizeValues()==0) {
                 return false;   
                }
            }
        }
        return true;
    }
    
    //Comprueba si esta resuelto
    public boolean siResuelto(){
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (celda[r][c].getValue()==0) {
                 return false;   
                }
            }
        }
        return true;
    } 
    
    public void setCeldaValue(int row, int col, int value) {
        celda[row][col].setValue(value);
    }

    public Tablero clone() {
        Tablero sdk = new Tablero();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int value = celda[r][c].getValue();
                if (value != 0) {
                    sdk.setCeldaValue(r, c, value);
                }
            }
        }
        return sdk;
    }

    @Override
    public String toString() {
        String txt = "";
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                txt += "Row: " + r + ", Col: " + c + ": ";
                for (int k : celda[r][c]) {
                    txt += k + " ";
                }
                txt += "\n";
            }
        }
        return txt;
    }
    
    //Soluciona el Sudoku
    public boolean Resolver(){
        //Pregunta si esta resuelto
        if(siResuelto()){
            return true;
        }
        //Mientras hayan Casilla ConCandidato Unico, llenarlos
        while (casCandUnico()){
            llenarCasCandUnico();
        }
        
        //Comprueba si es soluble
        if (!siSoluble()){
            return false;
        }
        //Se crea clon
        
        //Se agregan tentativos
        for (int j=0; j<9; j++){
            for (int i=0;i<9; i++){
                for (int k: celda[j][i]){
                    Tablero temp = clone();
                    if (celda[j][i].getValue()==0){
                    celda[j][i].setValue(k);
                    //Se comprueba si el camino tomado es exitoso
                    if (Resolver())
                        return true;
                    //Si no es asi, se regresa al estado anterior
                    else{
                        celda = temp.celda;   
                    }
                    }
                } 
            }
        }
        return false;
    }

    // Se imprime el Sudoku
    public void Imprimir()
    {
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==0){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==1){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==2){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==3){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==4){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==5){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==6){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==7){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){            
                if(col >= 0 && col < 9 && row==8){                 
                   System.out.print(celda[row][col].getValue()+"  ");               
                }                       
            }
        }
        System.out.println("");
    }
}

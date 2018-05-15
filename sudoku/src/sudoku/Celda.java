package sudoku;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Celda extends Observable implements Observer, Iterable<Integer> {
    
    private List<Integer> values = new ArrayList<Integer>();
    private int row, col;
    private boolean siResuelto;

    public Celda(int row, int col) {
        this.row = row;
        this.col = col;
        
        for (int n = 1; n <= 9; n++) {
            values.add(n);
        }
    }
    
    public void setValue(int value) {
        values.clear();
        values.add(value);
        siResuelto = true;
        
        super.setChanged();
        super.notifyObservers(value);
    }
    
    public int getValue() {
        return values.size() == 1 ? values.get(0) : 0;
    }
    
    public boolean getState() {
        return siResuelto;
    }
    
    public int sizeValues() {
        return values.size();
    }
    public synchronized void addObserver(Celda[][] cells) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                boolean isSame = (r == row) && (c == col);
                boolean isSameLine = (r == row) || (c == col);
                boolean isSecondary = (r/3 == row/3) && (c/3 == col/3);
                if (!isSame && (isSameLine || isSecondary)) {
                    super.addObserver(cells[r][c]);
                }
            }
        }
    }
    
    @Override
    public void update(Observable o, Object arg) {
        values.remove(arg);
        if (!siResuelto && values.size() == 1) {
            int value = values.get(0);
            setValue(value);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return values.iterator();
    }
    
}

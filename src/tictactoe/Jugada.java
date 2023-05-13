package tictactoe;

public class Jugada {

    private final int i;
    private final int j;
    
    public Jugada(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
    public int getI() {
        return this.i;
    }
    
    public int getJ() {
        return this.j;
    }
}

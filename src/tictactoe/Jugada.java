package tictactoe;
/**
 * Esta clase crea el objeto Jugada
 * con dos atributos i y j
 * @author ulcua
 */
public class Jugada {

    private final int i;
    private final int j;
    /**
     * Este metodo inicialia los atributos de la clase
     * @param i valor de la coordenada i
     * @param j valor de la coordenada j
     */
    public Jugada(int i, int j) {
        this.i = i;
        this.j = j;
    }
    /**
     * Este metodo se usa para acceder al atributo privado i
     * @return el valor del atributo i
     */
    public int getI() {
        return this.i;
    }
    /**
     * Este metodo se usa para acceder al atributo privado j
     * @return el valor del atributo j
     */
    public int getJ() {
        return this.j;
    }
}

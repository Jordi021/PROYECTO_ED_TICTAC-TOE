package tictactoe;
/**
 * Esta clase se encarga de crear un objeto pila para almacenar informacion
 * el atributo A es un arreglo de objetos
 * el atributo numElemento es el numero de elementos dentro del arreglo
 * el atributo size nos muestra el tamaño del arrelo
 * @author ulcua
 */
public class Pila {

    private int size;
    private int numElementos;
    private Object[] A;
    /**
     * El siguiente metodo es el constructor de la clase inicializa los atributos
     * el numelementos debe ser cero  por que aun no se a almacenado valores
     * @param size es el tamaño que tiene el arreglo A de objetos
     */
    public Pila(int size) {
        this.size = size;
        this.numElementos = 0;
        this.A = new Object[size];
    }

    /**
     * Se encarga almacenar objetos en la posicion del numero de elementos,
     * si previamente el tamaño es mayor al numero de elementos
     * incrementa el numero de elementos en uno mas
     * @param elemento es el objeto que se almacenara en la pila
     */
    public void push(Object elemento) {
        if (this.numElementos < this.size) {
            this.A[this.numElementos] = elemento;
            this.numElementos++;
        }
    }
    /**
     * Crea un objeto para darle el valor del arreglo en la pocision umero 
     * de elementos menos uno, si la pila no esta vacia se le dara ese valor,
     * reduce el numero de elementos en uno, y coloca el valor del arreglo 
     * en la  posicion numelementos en null, eliminadolo de la pila
     * @return el objeto que se encuentra en la posicion numero de elementos menos uno
     */
    public Object pop() {
        Object elemento = null;
        if (!vacia()) {
            elemento = this.A[this.numElementos - 1];
            this.numElementos--;
            this.A[this.numElementos] = null;
        }
        return elemento;

    }
 /**
  * Establece un objeto el cual sera la cima de la pila
  * @return el objeto de la cima de la pila
  */
    public Object retornarCima() {
        Object elemento = null;
        if (!vacia()) {
            return this.A[this.numElementos - 1];
        }
        return elemento;
    }
    /**
     * Compruaba si el numero de elementos es igual tamaño para ver si esta llena
     * 
     * @return devuelve un valor verdadero o falso
     * 
     */

    public boolean llena() {
        return numElementos == size;
    }
    /**
     * Compruaba si el numero de elementos es cero para ver si esta vacia
     * @return devuelve un valor verdadero o falso
     */
    public boolean vacia() {
        return numElementos == 0;
    }
    /**
     * Este metodo regresa el tamaño del arreglo
     * @return el tamaño del arreglo
     */
    public int size() {
        return this.size;
    }
    /**
     * Recorre el arreglo y si no es null en esa posicion lo concatenera 
     * a la cadena s
     * @return s que es una cadena con los valores del arreglo A
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = this.A.length - 1; i >= 0; i--) {
            if (this.A[i] != null) {
                s += this.A[i] + "\n";
            }
        }
        return s;
    }
}

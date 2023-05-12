package tictactoe;

public class Pila {

    private int size;
    private int numElementos;
    private Object[] A;

    public Pila(int size) {
        this.size = size;
        this.numElementos = 0;
        this.A = new Object[size];
    }

    public void apilar(Object elemento) {
        if (this.numElementos < this.size) {
            this.A[this.numElementos] = elemento;
            this.numElementos++;
        }
    }

    public Object desapilar() {
        Object elemento = null;
        if (!vacia()) {
            elemento = this.A[this.numElementos - 1];
            this.numElementos--;
            this.A[this.numElementos] = null;
        }
        return elemento;

    }

    public Object retornarCima() {
        Object elemento = null;
        if (!vacia()) {
            return this.A[this.numElementos - 1];
        }
        return elemento;
    }

    public boolean llena() {
        return numElementos == size;
    }

    public boolean vacia() {
        return numElementos == 0;
    }

    public int size() {
        return this.size;
    }

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

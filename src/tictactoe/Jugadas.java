/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import javax.swing.JButton;

/**
 *
 * @author ulcua
 */
public class Jugadas {

    private int i;
    private int j;
    private Pila pil;
    private int turno;

    public Pila getPil() {
        return pil;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setPil(Pila pil) {
        this.pil = pil;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Jugadas(int tam) {
        this.pil = new Pila(tam * tam);
        this.turno = 0;
    }

    public void Jugada(int i, int j) {
        this.i = i;
        this.j = j;
        this.pil.apilar(new Integer[]{this.i, this.j});
        this.turno++;
    }

    public void RegresarJugada() {

        if (this.turno > 0) {
            this.turno--;
        } else {
            this.turno = 0;
        }
        if (this.turno >=0) {
            Integer[] coordenadas = (Integer[]) this.pil.desapilar();
            setI(coordenadas[0]);
            setJ(coordenadas[1]);  
        }
    }

    @Override
    public String toString() {
        return " " + this.turno;
    }
}

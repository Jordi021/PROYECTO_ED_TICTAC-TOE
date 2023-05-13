package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Accion implements ActionListener {

    private final char player1;
    private final char player2;
    private final JButton[][] matrizButton;
    private final Pila pilaJugadas;

    public static int cont = 1;

    public Accion(char player1, char player2, JButton[][] matrizButton, Pila pilaJugadas) {
        this.player1 = player1;
        this.player2 = player2;
        this.matrizButton = matrizButton;
        this.pilaJugadas = pilaJugadas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String player_1, player_2;
        player_1 = String.valueOf(player1);
        player_2 = String.valueOf(player2);
        JButton button = (JButton) e.getSource();
        if (cont % 2 != 0) {
            button.setText(player_1);
        } else {
            button.setText(player_2);
        }
        turno(e);
        cont++;
        button.setEnabled(false);
    }

    private void turno(ActionEvent e) {
        int fila = -1;
        int columna = -1;
        Jugada turno;
        int size = this.matrizButton.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.matrizButton[i][j] == (JButton) e.getSource()) {
                    fila = i;
                    columna = j;
                    i = size - 1;
                }
            }
        }
        turno = new Jugada(fila, columna);   
        this.pilaJugadas.push(turno);
    }
}

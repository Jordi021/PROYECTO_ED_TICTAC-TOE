package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Esta clase crea el Accion con los atributos player1, player2 un arreglo de
 * botones, una pila para almacenar datos, y un contador con valor estatico.
 * Implementa metodos de la calse "ActionListener"
 *
 * @author ulcua
 */
public class Accion implements ActionListener {
    //Mensaje emergente al ganar la partida
    String text = "Felicidades haz ganado";

    private final char player1;
    private final char player2;
    private final JButton[][] matrizButton;
    private final Pila pilaJugadas;

    public static int cont = 1;

    /**
     * Este metodo inicialia los atributos de la clase
     *
     * @param player1 es el jugador numero 1 se identifica por un caracter
     * @param player2 es el jugador numero 2 se identifica por un caracter
     * @param matrizButton es un arreglo de botones
     * @param pilaJugadas el objeto en donde se almacena los jugadores
     */
    public Accion(char player1, char player2, JButton[][] matrizButton, Pila pilaJugadas) {
        this.player1 = player1;
        this.player2 = player2;
        this.matrizButton = matrizButton;
        this.pilaJugadas = pilaJugadas;
    }

    /**
     * Sobre escribe el evento de accion para los botones del arreglo, crea un
     * objeto boton con el que fue presionado Coloca el carcter de cada jugador
     * en el boton al momento de presionarlo Cambia el turno del jugador y el
     * contador de las jugadas desactiva el boton presionado
     *
     * @param e la accion que activa el metodo siguiente.
     */
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
        hayGanador();
        if (hayGanador() == true) {
           
            JOptionPane.showMessageDialog(button, text);
                
        }
    }

    /**
     * Establece dos variables fila y columna las cuales guardaran los elementos
     * i y j, se crea un objeto jugada "turno", se recorre el arreglo y en cada
     * posicion del arreglo se toma el valor de las coordenadas y se las
     * almacena en el objeto turno, una vez con el valor almacenado, se forza al
     * ciclo for que se termine, al final colocamos el objeto turno en la pila
     *
     * @param e
     */
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

    private boolean hayGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (matrizButton[i][0].getText().equals(matrizButton[i][1].getText())
                    && matrizButton[i][1].getText().equals(matrizButton[i][2].getText())
                    && !matrizButton[i][0].getText().isEmpty()) {
                return true;
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (matrizButton[0][i].getText().equals(matrizButton[1][i].getText())
                    && matrizButton[1][i].getText().equals(matrizButton[2][i].getText())
                    && !matrizButton[0][i].getText().isEmpty()) {
                return true;
            }
        }

        // Verificar diagonales
        if (matrizButton[0][0].getText().equals(matrizButton[1][1].getText())
                && matrizButton[1][1].getText().equals(matrizButton[2][2].getText())
                && !matrizButton[0][0].getText().isEmpty()) {
            return true;
        }

        if (matrizButton[0][2].getText().equals(matrizButton[1][1].getText())
                && matrizButton[1][1].getText().equals(matrizButton[2][0].getText())
                && !matrizButton[0][2].getText().isEmpty()) {
            return true;
        }

        return false;
    }
    
    private boolean Win5x5(ActionEvent e) {
        //Filas
        for (int i = 0; i < this.matrizButton.length; i++) {
            for (int j = 0; j <= this.matrizButton.length - 4; j++) {
                if ((this.matrizButton[i][j] == this.matrizButton[i][j + 1]
                        && this.matrizButton[i][j] == this.matrizButton[i][j + 2]
                        && this.matrizButton[i][j] == this.matrizButton[i][j + 3]) && this.matrizButton[i][j].getText().equalsIgnoreCase("")) {
                    return true;
                }
            }
        }
        for (int i = 0; i < this.matrizButton.length; i++) {
            for (int j = 0; j <= this.matrizButton.length - 4; j++) {
                if ((this.matrizButton[j][i] == this.matrizButton[j + 1][i]
                        && this.matrizButton[j][i] == this.matrizButton[j + 2][i]
                        && this.matrizButton[j][i] == this.matrizButton[j + 3][i]) && this.matrizButton[i][j].getText().equalsIgnoreCase("")) {
                    return true;
                }
            }
        }
        for (int i = 4 - 1; i < this.matrizButton.length; i++) {
            for (int j = 0; j <= this.matrizButton.length - 4; j++) {
                if ((this.matrizButton[i][j] == this.matrizButton[i - 1][j + 1]
                        && this.matrizButton[i][j] == this.matrizButton[i - 2][j + 2]
                        && this.matrizButton[i][j] == this.matrizButton[i - 3][j + 3]) && this.matrizButton[i][j].getText().equalsIgnoreCase("")) {
                    return true;
                }
            }
        }
        for (int i = 0; i <= this.matrizButton.length - 4; i++) {
            for (int j = 0; j <= this.matrizButton.length - 4; j++) {
                if (this.matrizButton[i][j].getText().equalsIgnoreCase("")
                        && this.matrizButton[i][j] == this.matrizButton[i + 1][j + 1]
                        && this.matrizButton[i][j] == this.matrizButton[i + 2][j + 2]
                        && this.matrizButton[i][j] == this.matrizButton[i + 3][j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

}

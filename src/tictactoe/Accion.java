package tictactoe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 * Esta clase crea el Accion con los atributos player1, player2
 * un arreglo de botones, una pila para almacenar datos, y un contador
 * con valor estatico.
 * Implementa metodos de la calse "ActionListener"
 * @author ulcua
 */

import javax.swing.JOptionPane;

public class Accion implements ActionListener {

    private final char player1;
    private final char player2;
    private final JButton[][] matrizButton;
    private final Pila pilaJugadas;
    private final JButton empezar;
    private final JButton regresar;

    public static int cont = 1;
/**
 * Este metodo inicialia los atributos de la clase
 * @param player1 es el jugador numero 1 se identifica por un caracter
 * @param player2 es el jugador numero 2 se identifica por un caracter
 * @param matrizButton es un arreglo de botones
 * @param pilaJugadas el objeto en donde se almacena los jugadores
 */

//    public Accion(char player1, char player2, JButton[][] matrizButton, Pila pilaJugadas) {
//        this.player1 = player1;
//        this.player2 = player2;
//        this.matrizButton = matrizButton;
//        this.pilaJugadas = pilaJugadas;
//    }
    
    public Accion(char player1, char player2, JButton[][] matrizButton, Pila pilaJugadas, JButton empezar, JButton regresar) {
        this.player1 = player1;
        this.player2 = player2;
        this.matrizButton = matrizButton;
        this.pilaJugadas = pilaJugadas;
        this.empezar = empezar;
        this.regresar = regresar;
    }
/**
 * Sobre escribe el evento de accion para los botones del arreglo,
 * crea un objeto boton con el que fue presionado
 * Coloca el carcter de cada jugador en el boton al momento de presionarlo
 * Cambia el turno del jugador y el contador de las jugadas
 * desactiva el boton presionado
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
        
        if (ganador(matrizButton.length)) {
            System.out.println("gano: " + button.getText());
            menuOpciones(button.getText());
        }
        if (empate(matrizButton.length)) {
            System.out.println("EMPATE!!");
            menuOpciones("EMPATE");
        }
    }
/**
 * Establece dos variables fila y columna las cuales guardaran los elementos 
 * i y j, se crea un objeto jugada "turno", se recorre el arreglo y en cada posicion
 * del arreglo se toma el valor de las coordenadas y se las almacena en el objeto turno,
 * una vez con el valor almacenado, se forza al ciclo for que se termine, al final colocamos
 * el objeto turno en la pila
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

    private boolean ganador(int size) {
        if (size == 3) {
            return tresXtres();
        } else {
            return cincoXcinco();
        }
    }

    private boolean tresXtres() {

        for (int i = 0; i < matrizButton.length; i++) {
            if (matrizButton[i][0].getText().equals(matrizButton[i][1].getText())
                    && matrizButton[i][1].getText().equals(matrizButton[i][2].getText())
                    && !matrizButton[i][0].getText().isEmpty()) {
                return true;
            }

            if (matrizButton[0][i].getText().equals(matrizButton[1][i].getText())
                    && matrizButton[1][i].getText().equals(matrizButton[2][i].getText())
                    && !matrizButton[0][i].getText().isEmpty()) {
                return true;
            }
        }

        if (matrizButton[0][0].getText().equals(matrizButton[1][1].getText())
                && matrizButton[1][1].getText().equals(matrizButton[2][2].getText())
                && !matrizButton[0][0].getText().isEmpty()) {
            return true;
        }

        return matrizButton[0][2].getText().equals(matrizButton[1][1].getText())
                && matrizButton[1][1].getText().equals(matrizButton[2][0].getText())
                && !matrizButton[0][2].getText().isEmpty();
    }

    private boolean cincoXcinco() {
        return false;
    }

    private boolean empate(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrizButton[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void menuOpciones(String key) {
        String[] opciones = {"VOLVER A JUGAR", "VOLVER A INICIO"};
        String texto;
        String titulo;
        if(key.equals("EMPATE")) {
            titulo = "JUEGO EMPATADO";
            texto = "ESCOGE UNA OPCIÓN:";
        } else {
            titulo = "FELICIDADES!!";
            texto = "EL JUGADOR \"" + key + "\" GANO LA PARTIDA\nESCOGE UNA OPCIOÓN:";
        }
        int seleccion = JOptionPane.showOptionDialog(null, texto,
                titulo, JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null,
                opciones, opciones[0]);

        if (seleccion == 0) {
            this.regresar.doClick();
            this.empezar.doClick();
        }
        if (seleccion == 1) {
            this.regresar.doClick();
        }
    }
}

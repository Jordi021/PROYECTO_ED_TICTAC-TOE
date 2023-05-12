package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Accion implements ActionListener {

    private final char player1;
    private final char player2;

    public static int cont = 1;

    public Accion(char player1, char player2) {
        this.player1 = player1;
        this.player2 = player2;
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
        System.out.println(cont);
        cont++;
        button.setEnabled(false);
    }

}


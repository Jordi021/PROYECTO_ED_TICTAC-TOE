package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/tictac-toe.png")));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.radioButtonX);
        buttonGroup.add(this.radioButtonY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPanel = new javax.swing.JPanel();
        comboModo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        btnEmpezar = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioButtonY = new javax.swing.JRadioButton();
        radioButtonX = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        footPanel = new javax.swing.JPanel();
        btnRepetir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);

        headPanel.setForeground(new java.awt.Color(204, 204, 204));
        headPanel.setPreferredSize(new java.awt.Dimension(700, 130));
        headPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3X3", "5X5" }));
        headPanel.add(comboModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setText("TIC TAC TOE");
        headPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONE EL MODO DE JUEGO:");
        headPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 271, -1));

        getContentPane().add(headPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setBackground(new java.awt.Color(175, 165, 250));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        bodyPanel.add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, -1));

        labelInfo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(0, 51, 255));
        labelInfo.setText("<html><u>VER MÁS</u></html>");
        labelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInfoMouseClicked(evt);
            }
        });
        bodyPanel.add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3-enRaya.png"))); // NOI18N
        bodyPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        radioButtonY.setBackground(new java.awt.Color(175, 165, 250));
        radioButtonY.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        radioButtonY.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonY.setText("O");
        bodyPanel.add(radioButtonY, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        radioButtonX.setBackground(new java.awt.Color(175, 165, 250));
        radioButtonX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        radioButtonX.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonX.setSelected(true);
        radioButtonX.setText("X");
        bodyPanel.add(radioButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EMPEZAR CON:");
        bodyPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 110, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("O DIAGONAL ANTES QUE EL OPONENTE.");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EL OBJETIVO DEL JUEGO ES COLOCAR TRES O CUATRO DE  ");
        bodyPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TUS SÍMBOLOS EN LÍNEA DE MANERA VERTICAL, HORIZONTAL");
        bodyPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 430, 30));

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        footPanel.setPreferredSize(new java.awt.Dimension(700, 70));
        footPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRepetir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRepetir.setText("REPETIR JUGADA");
        btnRepetir.setEnabled(false);
        btnRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepetirActionPerformed(evt);
            }
        });
        footPanel.add(btnRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.setEnabled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        footPanel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        getContentPane().add(footPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        getContentPane().remove(this.bodyPanel1);
        this.btnRepetir.setEnabled(false);
        this.repaint();
        getContentPane().add(this.bodyPanel, BorderLayout.CENTER);
        this.revalidate();
        this.btnRegresar.setEnabled(false);
        Accion.cont = 1;
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        definirJugador();
        this.btnRepetir.setEnabled(true);
        this.btnRegresar.setEnabled(true);
        this.getContentPane().remove(this.bodyPanel);
        this.repaint();
        String modo = (String) this.comboModo.getSelectedItem();
        if (modo.equalsIgnoreCase("3X3")) {
            this.bodyPanel1 = new JPanel(new GridLayout(3, 3, 5, 5));
            this.bodyPanel1.setBackground(new Color(161, 201, 241));
            crearBotones(3);
        } else {
            this.bodyPanel1 = new JPanel(new GridLayout(5, 5, 5, 5));
            this.bodyPanel1.setBackground(new Color(239, 176, 201));
            crearBotones(5);
        }

        getContentPane().add(bodyPanel1, java.awt.BorderLayout.CENTER);
        this.revalidate();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void definirJugador() {
        if (this.radioButtonX.isSelected()) {
            this.player1 = 'X';
            this.player2 = 'O';
        } else {
            this.player1 = 'O';
            this.player2 = 'X';
        }
    }
    private void labelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInfoMouseClicked
        String texto = """
                       Tic Tac Toe, también conocido como Tres en Raya o Gato, es un juego
                       para dos jugadores que se juega en una cuadrícula de 3x3 o 5x5. El
                       objetivo del juego es conseguir tres o cuatro símbolos iguales en
                       línea, ya sea horizontal, vertical o diagonalmente, antes que el 
                       otro jugador. El juego comienza con una cuadrícula vacía. El primer 
                       jugador coloca su símbolo (generalmente una X) en cualquier casilla 
                       de la cuadrícula. Luego, el segundo jugador coloca su símbolo 
                       (generalmente una O) en una casilla vacía. Los jugadores alternan
                       turnos hasta que uno de ellos consigue tres lsímbolos iguales en 
                       línea o hasta que se llena la cuadrícula sin que ninguno de los
                       jugadores consiga ganar.Tic Tac Toe es un juego sencillo pero 
                       desafiante que puede ser jugado en cualquier lugar con solo un 
                       papel y un lápiz.También es un juego popular para enseñar a los 
                       niños habilidades de pensamiento lógico y estratégico.
                       """;
        JOptionPane.showMessageDialog(null, texto, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_labelInfoMouseClicked

    private void btnRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepetirActionPerformed
        try {
            Jugada turno;
            JButton boton;
            int posI, posJ;
            turno = (Jugada) this.pilaJugadas.pop();
            posI = turno.getI();
            posJ = turno.getJ();
            boton = this.matrizButton[posI][posJ];
            boton.setText("");
            boton.setEnabled(true);
            Accion.cont--;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO HAY JUGADAS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRepetirActionPerformed

    private void crearBotones(int n) {
        this.matrizButton = new JButton[n][n];
        this.pilaJugadas = new Pila(n * n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                JButton boton = new JButton();
                boton.setFont(new Font("Century Gothic", Font.BOLD, 36));
                boton.setBackground(Color.white);
                this.bodyPanel1.add(this.matrizButton[i][j] = boton);
                this.matrizButton[i][j].addActionListener(new Accion(this.player1, this.player2, this.matrizButton, this.pilaJugadas));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    private JPanel bodyPanel1;
    private JButton[][] matrizButton;
    private char player1;
    private char player2;
    private Pila pilaJugadas;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRepetir;
    private javax.swing.JComboBox<String> comboModo;
    private javax.swing.JPanel footPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JRadioButton radioButtonX;
    private javax.swing.JRadioButton radioButtonY;
    // End of variables declaration//GEN-END:variables
}

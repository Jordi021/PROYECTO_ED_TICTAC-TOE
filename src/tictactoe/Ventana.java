package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/tictac-toe.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboModo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        btnX = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        labelInfo = new javax.swing.JLabel();
        footPanel = new javax.swing.JPanel();
        btnRepetir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);

        headPanel.setBackground(new java.awt.Color(153, 255, 255));
        headPanel.setPreferredSize(new java.awt.Dimension(700, 130));
        headPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        jLabel1.setText("REALIZADO POR: JORDAN PURUNCAJAS, BIXMAR RODRIGUEZ, JUAN ULCUANGO");
        headPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 420, -1));

        comboModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3X3", "5X5" }));
        headPanel.add(comboModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setText("TIC TAC TOE");
        headPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONE EL MODO DE JUEGO:");
        headPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 271, -1));

        getContentPane().add(headPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setBackground(new java.awt.Color(255, 153, 153));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnX.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnX.setText("EMPEZAR");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        bodyPanel.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 110, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setText("EL JUEGO CONSISTE EN... ");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 440, 100));

        button1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button1.setLabel("O");
        bodyPanel.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        button2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button2.setLabel("X");
        bodyPanel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        labelInfo.setForeground(new java.awt.Color(0, 51, 255));
        labelInfo.setText("Ver más");
        labelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInfoMouseClicked(evt);
            }
        });
        bodyPanel.add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        footPanel.setBackground(new java.awt.Color(153, 255, 153));
        footPanel.setPreferredSize(new java.awt.Dimension(700, 70));
        footPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRepetir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRepetir.setText("REPETIR JUGADA");
        btnRepetir.setEnabled(false);
        footPanel.add(btnRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

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
        this.repaint();
        getContentPane().add(this.bodyPanel, BorderLayout.CENTER);
        this.revalidate();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        this.btnRepetir.setEnabled(true);
        this.btnRegresar.setEnabled(true);
        this.getContentPane().remove(this.bodyPanel);
        this.repaint();
        String modo = (String) this.comboModo.getSelectedItem();
        if (modo.equalsIgnoreCase("3X3")) {
            this.bodyPanel1 = new JPanel(new GridLayout(3, 3, 5, 5));
            this.bodyPanel1.setBackground(Color.MAGENTA);
            crearBotones(3);
        } else {
            this.bodyPanel1 = new JPanel(new GridLayout(5, 5, 5, 5));
            this.bodyPanel1.setBackground(Color.darkGray);
            crearBotones(5);
        }

        getContentPane().add(bodyPanel1, java.awt.BorderLayout.CENTER);
        this.revalidate();
    }//GEN-LAST:event_btnXActionPerformed

    private void labelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInfoMouseClicked
        JOptionPane.showMessageDialog(null, "Tic Tac Toe, también conocido como "
                + "Tres en Raya o Gato, es un juego para dos "
                + "jugadores que se juega en una cuadrícula de 3x3 o 5x5.\nEl objetivo "
                + "del juego es conseguir tres o cuatro símbolos iguales en línea, ya sea "
                + "horizontal, vertical o diagonalmente, antes que el otro jugador.\n" 
                +  "El juego comienza con una cuadrícula vacía. El primer jugador "
                + "coloca su símbolo (generalmente una X) en cualquier casilla de "
                + "la cuadrícula.\nLuego, el segundo jugador coloca su símbolo "
                + "(generalmente una O) en una casilla vacía. Los jugadores alternan"
                + " turnos hasta que uno de ellos\nconsigue tres lsímbolos iguales en "
                + "línea o hasta que se llena la cuadrícula sin que ninguno de los"
                + " jugadores consiga ganar.\n" 
                + "Tic Tac Toe es un juego sencillo pero desafiante que puede "
                + "ser jugado en cualquier lugar con solo un papel y un lápiz."
                + "\nTambién es un juego popular para enseñar a los niños "
                + "habilidades de pensamiento lógico y estratégico.");
    }//GEN-LAST:event_labelInfoMouseClicked

    private void crearBotones(int n) {
        this.arregloButton = new JButton[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                JButton boton = new JButton();
                boton.setFont(new Font("Century Gothic", Font.BOLD, 14));
                boton.setBackground(Color.white);
                this.bodyPanel1.add(this.arregloButton[i][j] = boton);
                this.arregloButton[i][j].addActionListener(new Texto());

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    private JPanel bodyPanel1;
    private JButton[][] arregloButton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRepetir;
    private javax.swing.JButton btnX;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> comboModo;
    private javax.swing.JPanel footPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}

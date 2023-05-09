package tictactoe;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setResizable(false);
//        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        btnEmpezar = new javax.swing.JButton();
        footPanel = new javax.swing.JPanel();
        btnRepetir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        headPanel.setBackground(new java.awt.Color(153, 255, 255));
        headPanel.setPreferredSize(new java.awt.Dimension(700, 130));
        headPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        jLabel1.setText("REALIZADO POR: JORDAN PURUNCAJAS, BIXMAR RODRIGUEZ, JUAN ULCUANGO");
        headPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 458, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3X3", "5X5" }));
        headPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setText("TIC TAC TOE");
        headPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONE EL MODO DE JUEGO:");
        headPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 84, 271, -1));

        getContentPane().add(headPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setBackground(new java.awt.Color(255, 153, 153));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        bodyPanel.add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 220, 110, -1));

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        footPanel.setBackground(new java.awt.Color(153, 255, 153));
        footPanel.setPreferredSize(new java.awt.Dimension(700, 100));
        footPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRepetir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRepetir.setText("REPETIR JUGADA");
        btnRepetir.setEnabled(false);
        footPanel.add(btnRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        getContentPane().add(footPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        this.btnRepetir.setEnabled(true);
    }//GEN-LAST:event_btnEmpezarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnRepetir;
    private javax.swing.JPanel footPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

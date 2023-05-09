package tictactoe;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setResizable(false);
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        footPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headPanel.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(headPanel, java.awt.BorderLayout.PAGE_START);

        bodyPanel.setBackground(new java.awt.Color(255, 153, 153));
        bodyPanel.setLayout(new java.awt.GridLayout(3, 3, 5, 0));

        jButton1.setText("jButton1");
        bodyPanel.add(jButton1);

        jButton2.setText("jButton2");
        bodyPanel.add(jButton2);

        jButton4.setText("jButton4");
        bodyPanel.add(jButton4);

        jButton7.setText("jButton7");
        bodyPanel.add(jButton7);

        jButton6.setText("jButton6");
        bodyPanel.add(jButton6);

        jButton9.setText("jButton9");
        bodyPanel.add(jButton9);

        jButton8.setText("jButton8");
        bodyPanel.add(jButton8);

        jButton5.setText("jButton5");
        bodyPanel.add(jButton5);

        jButton3.setText("jButton3");
        bodyPanel.add(jButton3);

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        footPanel.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout footPanelLayout = new javax.swing.GroupLayout(footPanel);
        footPanel.setLayout(footPanelLayout);
        footPanelLayout.setHorizontalGroup(
            footPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        footPanelLayout.setVerticalGroup(
            footPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(footPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel footPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}

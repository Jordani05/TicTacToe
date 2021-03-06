/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoefinalprogramacion3;

import javax.swing.*;

/**
 *
 * @author jordani-vaio
 */
public class TicTacToe extends javax.swing.JFrame {
    
    int turn = 1;
    
    int option;
    boolean inGame = false;
    boolean win = false;

    String Player1 = "Player 1", Player2 = "Player 2";
    boolean boton1 = false, boton2 = false, boton3 = false, boton4 = false, boton5 = false, boton6 = false, boton7 = false, boton8 = false, boton9 = false;
    String whoTurn;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
        lblJugador.setText("Player 1");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtComando = new javax.swing.JTextField();
        btnPos9 = new javax.swing.JButton();
        btnPos3 = new javax.swing.JButton();
        btnPos4 = new javax.swing.JButton();
        btnPos5 = new javax.swing.JButton();
        btnPos6 = new javax.swing.JButton();
        btnPos7 = new javax.swing.JButton();
        btnPos8 = new javax.swing.JButton();
        btnPos1 = new javax.swing.JButton();
        btnPos2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 0, 570, 10);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("Comando de Jugada:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 190, 25);

        txtComando.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        txtComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComandoActionPerformed(evt);
            }
        });
        getContentPane().add(txtComando);
        txtComando.setBounds(220, 10, 270, 30);
        getContentPane().add(btnPos9);
        btnPos9.setBounds(330, 290, 110, 110);
        getContentPane().add(btnPos3);
        btnPos3.setBounds(330, 50, 110, 110);
        getContentPane().add(btnPos4);
        btnPos4.setBounds(90, 170, 110, 110);
        getContentPane().add(btnPos5);
        btnPos5.setBounds(210, 170, 110, 110);
        getContentPane().add(btnPos6);
        btnPos6.setBounds(330, 170, 110, 110);
        getContentPane().add(btnPos7);
        btnPos7.setBounds(90, 290, 110, 110);
        getContentPane().add(btnPos8);
        btnPos8.setBounds(210, 290, 110, 110);

        btnPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPos1);
        btnPos1.setBounds(90, 50, 110, 110);
        getContentPane().add(btnPos2);
        btnPos2.setBounds(210, 50, 110, 110);

        jLabel2.setText("Turno:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 70, 60, 20);

        lblJugador.setText("-");
        getContentPane().add(lblJugador);
        lblJugador.setBounds(450, 60, 80, 80);

        jMenu1.setText("Juego");

        jMenu3.setText("Juego Nuevo");
        jMenu1.add(jMenu3);

        jMenu4.setText("Nombrar Jugadores");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Instrucciones");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Acerca de");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Salir");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPos1ActionPerformed

    private void txtComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComandoActionPerformed
        // TODO add your handling code here:
       if(!(turn % 2 == 0)){
           jugar(1);
       }
       else{
           jugar(2);
       }
       checkTurn();
    }//GEN-LAST:event_txtComandoActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu6ActionPerformed

    public void jugar(int jugador){
        if(jugador == 1){
            switch (txtComando.getText()) {
                case "1":
                    btnPos1.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "2":
                    btnPos2.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "3":
                    btnPos3.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "4":
                    btnPos4.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "5":
                    btnPos5.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "6":
                    btnPos6.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "7":
                    btnPos7.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "8":
                    btnPos8.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "9":
                    btnPos9.setIcon(new ImageIcon(TicTacToe.class.getResource("X.png")));
                    txtComando.setText("");
                    turn++;
                    break;
            }
        }
        else{
            switch (txtComando.getText()) {
                case "1":
                    btnPos1.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "2":
                    btnPos2.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "3":
                    btnPos3.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "4":
                    btnPos4.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "5":
                    btnPos5.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "6":
                    btnPos6.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "7":
                    btnPos7.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "8":
                    btnPos8.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
                case "9":
                    btnPos9.setIcon(new ImageIcon(TicTacToe.class.getResource("ooo.png")));
                    txtComando.setText("");
                    turn++;
                    break;
            }
        }
    }
    
    public void checkTurn() {
        if(!(turn % 2 == 0)) {
            whoTurn = Player1 + " [X]";
        } else {
            whoTurn = Player2 + " [O]";
        }
        lblJugador.setText(whoTurn);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPos1;
    private javax.swing.JButton btnPos2;
    private javax.swing.JButton btnPos3;
    private javax.swing.JButton btnPos4;
    private javax.swing.JButton btnPos5;
    private javax.swing.JButton btnPos6;
    private javax.swing.JButton btnPos7;
    private javax.swing.JButton btnPos8;
    private javax.swing.JButton btnPos9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JTextField txtComando;
    // End of variables declaration//GEN-END:variables
}

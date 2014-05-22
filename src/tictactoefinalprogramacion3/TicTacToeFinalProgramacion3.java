/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoefinalprogramacion3;

/**
 *
 * @author jordani-vaio
 */
public class TicTacToeFinalProgramacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TicTacToe ttt = new TicTacToe();
        ttt.setSize(550, 470);
        ttt.setDefaultCloseOperation(TicTacToe.EXIT_ON_CLOSE);
        ttt.setLocationRelativeTo(null);
        ttt.setVisible(true);
    }
    
}

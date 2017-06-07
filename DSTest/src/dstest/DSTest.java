/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author VIETHUNG
 */
public class DSTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame game = new JFrame("Dev's Survival Together");
        game.setBounds(0, 0, DGame.SCREEN_WIDTH, DGame.SCREEN_HEIGHT);
        
        DGame dst = new DGame();
        game.add(dst);
        game.addKeyListener(dst);       
        game.setFocusable(true) ;
        
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setIconImage(new ImageIcon("res/Icon.png").getImage());
        game.setVisible(true);
           
    }
    
}

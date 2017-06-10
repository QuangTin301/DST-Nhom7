/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author VIETHUNG
 */
public class DSTest {
    
    //Mỗi Scene là 1 JFrame
    private static JFrame IntroGame = new JFrame("Dev's Survival Together");
    private static JFrame PlayGame = new JFrame("Dev's Survival Together");
    private static JFrame OverGame = new JFrame("Dev's Survival Together");
    
    
    public static void main(String[] args) {
        // Biến kiểm tra màn hình đã lên chưa (tránh hiển thị quá nhiều lần)
        boolean introGame = true;
        boolean playGame = true;
        boolean overGame = true;
        
        //Biến kiểm tra game chạy
        boolean gamegame = true;
        
        while(gamegame){                        //Vòng lặp của Game                 
            if(introGame){                   
                Introduction();
                introGame = false;
            }

            while(playGame){                    //PlayScene lên chưa?
                System.out.println();           //Không biết tại sao phải có dòng này mới chạy đc
                if (DIntro.getPlay()){          //Bấm nút Play?
                IntroGame.setVisible(false);
                IntroGame.dispose();
                Play();                         //Đã lên
                playGame = false;               //Tắt biến
                }
            }
            
            while(overGame){
                System.out.println();
                if (DGame.getEndGame()){
                PlayGame.setVisible(false);
                PlayGame.dispose();
                Over();
                overGame = false;
                }
            }
        }      
    }  
    
    public static void Introduction(){
        
        IntroGame.setBounds(200, 200, DGame.SCREEN_WIDTH, DGame.SCREEN_HEIGHT);
        
        DIntro intro = new DIntro();
        IntroGame.getContentPane().add(intro);
        IntroGame.setFocusable(true);
        
        IntroGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IntroGame.setIconImage(new ImageIcon("res/Icon.png").getImage());
        IntroGame.setVisible(true);
    }
    
    public static void Play(){
        
        PlayGame.setBounds(200, 200, DGame.SCREEN_WIDTH, DGame.SCREEN_HEIGHT);
        
        DGame dst = new DGame();
        PlayGame.getContentPane().add(dst);
        
        PlayGame.addKeyListener(dst);
        
        PlayGame.setFocusable(true) ;
        
        PlayGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PlayGame.setIconImage(new ImageIcon("res/Icon.png").getImage());
        PlayGame.setVisible(true);
    }
    
    public static void Over(){
        OverGame.setBounds(200, 200, DGame.SCREEN_WIDTH, DGame.SCREEN_HEIGHT);
        
        DOver over = new DOver();
        OverGame.getContentPane().add(over);
        OverGame.setFocusable(true);
        
        OverGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OverGame.setIconImage(new ImageIcon("res/Icon.png").getImage());
        OverGame.setVisible(true);
    }
}

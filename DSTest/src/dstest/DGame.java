/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;


import Tools.Tools;
import dstest.BAG.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.JOptionPane;



/**
 *
 * @author VIETHUNG
 */
public class DGame extends javax.swing.JPanel implements KeyListener{
    
    final static int MAP_WIDTH = 2400;
    final static int MAP_HEIGHT = 1600;
    final static int SCREEN_WIDTH = 1024;
    final static int SCREEN_HEIGHT = 720;
    
    final static boolean endGame = false;

    private Image image;
    private Graphics second;
       
    public static DChar Willson;
    private DMap Map;
    public DCamera camera;
    private Bag_Item BAG;
    private Tools TOOL;
    //
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    //
    
    private javax.swing.JLabel Tool1;  
    private javax.swing.JLabel Tool2;
    private javax.swing.JLabel Tool3;
    private javax.swing.JLabel Tool4;
    private javax.swing.JLabel Tool5;
    private javax.swing.JLabel Tool6;
    private javax.swing.JLabel Tool7;
    private javax.swing.JLabel Tool8;
    private javax.swing.JLabel Tool9;
    private javax.swing.JLabel Tool10;
    private javax.swing.JLabel Tool11;

    
    private void loadLabel_Bag(){
        jLabel1 = new javax.swing.JLabel();
        this.add(jLabel1);
        jLabel1.setBounds(136 + (60+17)*0, 608, 60, 60);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem1MouseClicked(evt);
            }
        });
           
        jLabel2 = new javax.swing.JLabel();
        this.add(jLabel2);
        jLabel2.setBounds(136 + (60+17)*1, 608, 60, 60);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem2MouseClicked(evt);
            }
        });
        
        jLabel3 = new javax.swing.JLabel();
        this.add(jLabel3);
        jLabel3.setBounds(136 + (60+17)*2, 608, 60, 60);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem3MouseClicked(evt);
            }
        });
        
        jLabel4 = new javax.swing.JLabel();
        this.add(jLabel4);
        jLabel4.setBounds(136 + (60+17)*3, 608, 60, 60);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem4MouseClicked(evt);
            }
        });
        
        jLabel5 = new javax.swing.JLabel();
        this.add(jLabel5);
        jLabel5.setBounds(136 + (60+17)*4, 608, 60, 60);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem5MouseClicked(evt);
            }
        });
        
        jLabel6 = new javax.swing.JLabel();
        this.add(jLabel6);
        jLabel6.setBounds(136 + (60+17)*5, 608, 60, 60);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem6MouseClicked(evt);
            }
        });
        
        jLabel7 = new javax.swing.JLabel();
        this.add(jLabel7);
        jLabel7.setBounds(136 + (60+17)*6, 608, 60, 60);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem7MouseClicked(evt);
            }
        });
        
        jLabel8 = new javax.swing.JLabel();
        this.add(jLabel8);
        jLabel8.setBounds(136 + (60+17)*7, 608, 60, 60);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem8MouseClicked(evt);
            }
        });
        
        jLabel9 = new javax.swing.JLabel();
        this.add(jLabel9);
        jLabel9.setBounds(136 + (60+17)*8, 608, 60, 60);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem9MouseClicked(evt);
            }
        });
        
        jLabel10 = new javax.swing.JLabel();
        this.add(jLabel10);
        jLabel10.setBounds(136 + (60+17)*9, 608, 60, 60);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagItem10MouseClicked(evt);
            }
        });
    }   
    private void BagItem1MouseClicked(java.awt.event.MouseEvent evt) {                                      
         if(BAG.GetQuantity() > 0){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(0) +" / "+ BAG.GetNameItem(0)+ " / "+BAG.GetQuantityItem(0));                  
        }
    }
    private void BagItem2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(BAG.GetQuantity() > 1){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(1) +" / "+ BAG.GetNameItem(1)+ " / "+BAG.GetQuantityItem(1));                  
        }
    }
    private void BagItem3MouseClicked(java.awt.event.MouseEvent evt) {                                      
         if(BAG.GetQuantity() > 2){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(2) +" / "+ BAG.GetNameItem(2)+ " / "+BAG.GetQuantityItem(2));                  
        }
    }
    private void BagItem4MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
         if(BAG.GetQuantity() > 3){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(3) +" / "+ BAG.GetNameItem(3)+ " / "+BAG.GetQuantityItem(3));                  
        }
    }
    private void BagItem5MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void BagItem6MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void BagItem7MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void BagItem8MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void BagItem9MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void BagItem10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(TOOL.Get_TT_Axe() == 1){
                JOptionPane.showMessageDialog(this, "True");  
            }else{
                JOptionPane.showMessageDialog(this, "False");        
            } 
    }
    
    private void LoadLabel_Tool(){
        Tool1 = new javax.swing.JLabel();
        this.add(Tool1);
        Tool1.setBounds(12, 23 + 60*0, 60, 60);
        Tool1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem1MouseClicked(evt);
            }
        });
           
        Tool2 = new javax.swing.JLabel();
        this.add(Tool2);
        Tool2.setBounds(12, 23 + 60*1, 60, 60);
        Tool2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem2MouseClicked(evt);
            }
        });
        
        Tool3 = new javax.swing.JLabel();
        this.add(Tool3);
        Tool3.setBounds(12, 23 + 60*2, 60, 60);
        Tool3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem3MouseClicked(evt);
            }
        });
        
        Tool4 = new javax.swing.JLabel();
        this.add(Tool4);
        Tool4.setBounds(12, 23 + 60*3, 60, 60);
        Tool4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem4MouseClicked(evt);
            }
        });
        
        Tool5 = new javax.swing.JLabel();
        this.add(Tool5);
        Tool5.setBounds(12, 23 + 60*4, 60, 60);
        Tool5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem5MouseClicked(evt);
            }
        });
        
        Tool6 = new javax.swing.JLabel();
        this.add(Tool6);
        Tool6.setBounds(12, 23 + 60*5, 60, 60);
        Tool6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem6MouseClicked(evt);
            }
        });
        
        Tool7 = new javax.swing.JLabel();
        this.add(Tool7);
        Tool7.setBounds(12, 23 + 60*6, 60, 60);
        Tool7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem7MouseClicked(evt);
            }
        });
        
        Tool8 = new javax.swing.JLabel();
        this.add(Tool8);
        Tool8.setBounds(12, 23 + 60*7, 60, 60);
        Tool8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem8MouseClicked(evt);
            }
        });
        
        Tool9 = new javax.swing.JLabel();
        this.add(Tool9);
        Tool9.setBounds(12, 23 + 60*8, 60, 60);
        Tool9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem9MouseClicked(evt);
            }
        });
        
        Tool10 = new javax.swing.JLabel();
        this.add(Tool10);
        Tool10.setBounds(12, 23 + 60*9, 60, 60);
        Tool10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem10MouseClicked(evt);
            }
        });
        
        Tool11 = new javax.swing.JLabel();
        this.add(Tool11);
        Tool11.setBounds(12, 23 + 60*10, 60, 60);
        Tool11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolItem11MouseClicked(evt);
            }
        });      
    }
    private void ToolItem1MouseClicked(java.awt.event.MouseEvent evt) {                                            
        JOptionPane.showMessageDialog(this, "1");                  
    }
    private void ToolItem2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "2");   
    }
    private void ToolItem3MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "3");   
    }
    private void ToolItem4MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "4");   
    }
    private void ToolItem5MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "5");   
    }
    private void ToolItem6MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "6");   
    }
    private void ToolItem7MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "7");   
    }
    private void ToolItem8MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "8");   
    }
    private void ToolItem9MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "9");   
    }
    private void ToolItem10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "10");   
    }
    private void ToolItem11MouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, "11");   
    }
    
    public DGame() {
        initComponents();
        this.setBackground(Color.BLACK);
        addKeyListener(this);
        
        Init();
        LoadResource();
        
        loadLabel_Bag();
        LoadLabel_Tool();
        
        
        try{
            Map.DrawMap("res/tilemap.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Thread game = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    GameRun();
                    repaint();
                    try{
                        Thread.sleep(17);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }           
        });
        game.start();
    }
    
    public void Init(){
        Willson = new DChar();
        Map = new DMap();
        camera = new DCamera(0, 0);
        BAG = new Bag_Item();  
        TOOL = new Tools();
    }
    
    public void LoadResource(){
        Willson.Load();
        Map.Load();    
        camera.Load(Willson.getCenterX() - SCREEN_WIDTH/2, Willson.getCenterY() - SCREEN_HEIGHT/2);
        BAG.LoadBar();
        TOOL.load();
    }
    
    public void GameRun(){
        Willson.update(camera);
        Map.update();
        TOOL.update(BAG);
    }
        
    @Override
    public void paint(Graphics g){
        super.paint(g);

        Map.Draw(g, camera);
        Willson.Draw(g, camera);
        BAG.Draw_Bot_Bar(g);
        
        BAG.Draw(g);
        TOOL.Draw_Left_Bar(g);
    }
    
    @Override
    public void update(Graphics g){
        if (image == null){
            image = createImage(this.getWidth(), this.getHeight());
            second = image.getGraphics();
        }
        
        second.setColor(getBackground());
        second.fillRect(0,0,getWidth(),getHeight());
        second.setColor(getForeground());
        paint(second);
        
        g.drawImage(image, 0, 0, this);
    }
    
    public static boolean getEndGame(){
        return endGame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:{
                if (!Willson.GetDown()){
                Willson.moveUp();
                Willson.SetDir(2);
                Willson.SetUp(true);
                }
            } break;
            case KeyEvent.VK_S:{
                if (!Willson.GetUp()){
                Willson.moveDown();
                Willson.SetDir(1);
                Willson.SetDown(true);
                }
            } break;
            case KeyEvent.VK_D:{
                if (!Willson.GetLeft()){
                Willson.moveRight();
                Willson.SetDir(0);
                Willson.SetRight(true);
                }
            } break;
            case KeyEvent.VK_A:{
                if (!Willson.GetRight()){
                Willson.moveLeft();
                Willson.SetDir(3);
                Willson.SetLeft(true);
                }
            } break;
            
            //Đánh
            case KeyEvent.VK_F:{
                
            } break;
            //Nhặt đồ + tương tác
            case KeyEvent.VK_SPACE:{
                
            } break;
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
       
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:{
                if (Willson.GetUp()){
                Willson.stopUpDown();   
                Willson.SetUp(false);
                }
            } break;
            case KeyEvent.VK_S:{
                if (Willson.GetDown()){
                Willson.stopUpDown();
                Willson.SetDown(false);
                }
            } break;
            case KeyEvent.VK_D:{
                if (Willson.GetRight()){
                Willson.stopLeftRight();
                Willson.SetRight(false);
                }
            } break;
            case KeyEvent.VK_A:{
                if (Willson.GetLeft()){
                Willson.stopLeftRight();
                Willson.SetLeft(false);
                }
            } break;
            
            //Đánh
            case KeyEvent.VK_F:{
                
            } break;
            //Nhặt đồ + tương tác
            case KeyEvent.VK_SPACE:{
                
            } break;
            //
            case KeyEvent.VK_NUMPAD0:{
                BAG.Add_item(51, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD1:{
                BAG.Add_item(11, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD2:{
                BAG.Add_item(12, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD3:{
                BAG.Add_item(13, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD4:{
                BAG.Add_item(14, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD5:{
                BAG.Add_item(35, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD6:{
                BAG.Add_item(41, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD7:{
                BAG.Add_item(42, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD8:{
                BAG.Add_item(16, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD9:{
                BAG.Add_item(15, 1);
                BAG.Load();
            } break;
        }
    }
    
    public DCamera getCamera(){
        return camera;
    }
    
    public static DChar getWill(){
        return Willson;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

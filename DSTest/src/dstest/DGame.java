/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import Tools.Axe;
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
    
    private Axe axe;
    
    private void loadlabel_Bag(){
        jLabel1 = new javax.swing.JLabel();
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel2 = new javax.swing.JLabel();
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel3 = new javax.swing.JLabel();
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel4 = new javax.swing.JLabel();
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel5 = new javax.swing.JLabel();
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel6 = new javax.swing.JLabel();
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel7 = new javax.swing.JLabel();
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel8 = new javax.swing.JLabel();
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel9 = new javax.swing.JLabel();
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jLabel10 = new javax.swing.JLabel();
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
//
        jLabel1.setText("jLabel1");
        jLabel2.setText("jLabel2");
        jLabel3.setText("jLabel3");
        jLabel4.setText("jLabel4");
        jLabel5.setText("jLabel5");
        jLabel6.setText("jLabel6");
        jLabel7.setText("jLabel7");
        jLabel8.setText("jLabel8");
        jLabel9.setText("jLabel9");
        jLabel10.setText("jLabel10");
//
        
//

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(0, Short.MAX_VALUE))
        );
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                      
         if(BAG.GetQuantity() > 0){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(0) +" / "+ BAG.GetNameItem(0)+ " / "+BAG.GetQuantityItem(0));                  
        }
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(BAG.GetQuantity() > 1){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(1) +" / "+ BAG.GetNameItem(1)+ " / "+BAG.GetQuantityItem(1));                  
        }
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                      
         if(BAG.GetQuantity() > 2){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(2) +" / "+ BAG.GetNameItem(2)+ " / "+BAG.GetQuantityItem(2));                  
        }
    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
         if(BAG.GetQuantity() > 3){
            JOptionPane.showMessageDialog(this, BAG.GetTypeItem(3) +" / "+ BAG.GetNameItem(3)+ " / "+BAG.GetQuantityItem(3));                  
        }
    }
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(axe.CheckCondition(BAG)){
                JOptionPane.showMessageDialog(this, "True");  
            }else{
                JOptionPane.showMessageDialog(this, "False");        
            } 
    }
    
    
    public DGame() {
        initComponents();
        this.setBackground(Color.BLACK);
        addKeyListener(this);
        
        Init();
        LoadResource();
        loadlabel_Bag();
        
        axe = new Axe();
        
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
    }
    
    public void LoadResource(){
        Willson.Load();
        Map.Load();    
        camera.Load(Willson.getCenterX() - SCREEN_WIDTH/2, Willson.getCenterY() - SCREEN_HEIGHT/2);
        
    }
    
    public void GameRun(){
        Willson.update(camera);
        Map.update();
    }
        
    @Override
    public void paint(Graphics g){
        super.paint(g);

        Map.Draw(g, camera);
        Willson.Draw(g, camera);
        BAG.Draw(g);
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
                BAG.Add_item(0, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD1:{
                BAG.Add_item(1, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD2:{
                BAG.Add_item(2, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD3:{
                BAG.Add_item(3, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD4:{
                BAG.Add_item(4, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD5:{
                BAG.Add_item(5, 1);
                BAG.Load();
            } break;
            case KeyEvent.VK_NUMPAD6:{
                BAG.Add_item(6, 1);
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

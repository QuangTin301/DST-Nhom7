/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author VIETHUNG
 */
public class DChar {
    
    final static String imgWillson = "res/Willson.png";  
    
    private BufferedImage will, curentState;
    private BufferedImage[][] WillsubImage;
    private DAnimation WillUp, WillDown, WillLeft, WillRight;
    private boolean isUp, isDown, isLeft, isRight;  
    private boolean moveUp, moveDown, moveLeft, moveRight;
    private ArrayList<DAnimation> WillState;   
    private int dir;
    public static Rectangle boxUp, boxDown, boxLeft, boxRight;
    

    
    private int centerX = 550;
    private int centerY = 550;
    private int speedX = 0;
    private int speedY = 0;
    private int speed = 3;
    private int Will_Width;
    private int Will_Height;
    
    public DChar(){
        Will_Width = 40;
        Will_Height = 40;
        
        centerX = centerX + Will_Width/2;
        centerY = centerY + Will_Height/2;
        
        dir = 0;
        WillsubImage = new BufferedImage[4][3];  
        boxUp = new Rectangle(0,0,0,0);
        boxDown = new Rectangle(0,0,0,0);
        boxLeft = new Rectangle(0,0,0,0);
        boxRight = new Rectangle(0,0,0,0);
        
        WillUp = new DAnimation();
        WillDown = new DAnimation();
        WillLeft = new DAnimation();
        WillRight = new DAnimation();
        WillState = new ArrayList<DAnimation>();
        
        isUp = isDown = isLeft = isRight = false;
        moveUp = moveDown = moveLeft = moveRight = true;
    }
    
    public void Load(){
        try{
            will = ImageIO.read(new File(imgWillson));
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 3; j++){
                    WillsubImage[i][j] = will.getSubimage(j*Will_Width, i*Will_Height, Will_Width, Will_Height); 
                }
            }
            
            for (int j = 0; j< 3; j++){
                WillRight.addFrame(WillsubImage[0][j], 50);
                WillDown.addFrame(WillsubImage[1][j], 50);
                WillUp.addFrame(WillsubImage[2][j], 50);
                WillLeft.addFrame(WillsubImage[3][j], 50);
            }
            
            WillState.add(WillRight);
            WillState.add(WillDown);
            WillState.add(WillUp);
            WillState.add(WillLeft);
            
          
        }catch(Exception e){
            e.printStackTrace();
        }
        curentState = WillState.get(0).GetBuff();
        
       
    }
    
    public void Draw(Graphics g, DCamera camera){
       
        g.drawImage(curentState, centerX - (int)camera.GetX(), centerY - (int)camera.GetY(), null);
        //g.drawRect((int)boxUp.getX() - (int)camera.GetX(), (int)boxUp.getY() - (int)camera.GetY(), (int)boxUp.getWidth(), (int)boxUp.getHeight());
        //g.drawRect((int)boxDown.getX() - (int)camera.GetX(), (int)boxDown.getY() - (int)camera.GetY(), (int)boxDown.getWidth(), (int)boxDown.getHeight());
        //g.drawRect((int)boxLeft.getX() - (int)camera.GetX(), (int)boxLeft.getY() - (int)camera.GetY(), (int)boxLeft.getWidth(), (int)boxLeft.getHeight());
        //g.drawRect((int)boxRight.getX() - (int)camera.GetX(), (int)boxRight.getY() - (int)camera.GetY(), (int)boxRight.getWidth(), (int)boxRight.getHeight());
    }
    
    public void update(DCamera camera){

        centerX += speedX;
        centerY += speedY;
        
        curentState = WillState.get(dir).GetBuff();              
        WillState.get(dir).update(10);  
        camera.update(this);
        boxUp.setRect(centerX, centerY - 5, Will_Width, Will_Height);
        boxDown.setRect(centerX, centerY + 5, Will_Width, Will_Height);
        boxLeft.setRect(centerX - 5, centerY, Will_Width, Will_Height);
        boxRight.setRect(centerX + 5, centerY, Will_Width, Will_Height);
        
    }
    
    public Rectangle getBoxUp(){
        return boxUp;
    }
    
    public Rectangle getBoxDown(){
        return boxDown;
    }
    
    public Rectangle getBoxLeft(){
        return boxLeft;
    }
    
    public Rectangle getBoxRight(){
        return boxRight;
    }
    
    public boolean GetUp(){
        return isUp;
    }
    
    public boolean GetDown(){
        return isDown;
    }
    
    public boolean GetRight(){
        return isRight;
    }
    
    public boolean GetLeft(){
        return isLeft;
    }
    
    public void SetUp(boolean b){
        isUp = b;
    }
    
    public void SetDown(boolean b){
        isDown = b;
    }
    
    public void SetRight(boolean b){
        isRight = b;
    }
    
    public void SetLeft(boolean b){
        isLeft = b;
    }
    
    public int getCenterX(){
        return centerX;
    }
    
    public int getCenterY(){
        return centerY;
    }
    
    public void setCenterX(int x){
        centerX = x;
    }
    
    public void setCenterY(int y){
        centerY = y;
    }
    
    public void SetDir(int _dir){
        dir = _dir;
    }
    
    public int GetWidth(){
        return Will_Width;
    }
    
    public int GetHeight(){
        return Will_Height;
    }
    
    public void SetSpeedX(int x){
        speedX = x;
    }
    
    public void SetSpeedY(int y){
        speedY = y;
    }
    
    public void setSpeed(int _speed){
        speed = _speed;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void moveUp(){
        speedY = -speed;
    }
    
    public void moveDown(){
        speedY = speed;
    }
    
    public void moveLeft(){
        speedX = -speed;
    }
    
    public void moveRight(){
        speedX = speed;
    }
    
    public void stopUpDown(){
        speedY = 0;
    }
    
    public void stopLeftRight(){
        speedX = 0;
    }
}

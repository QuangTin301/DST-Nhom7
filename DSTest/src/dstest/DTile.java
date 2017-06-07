/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author VIETHUNG
 */
public class DTile {
    private int TileX, TileY;

    private int type;
    
    private BufferedImage img;

    public Rectangle boxSea, boxSw, boxGrass, boxSand;

    private DChar will;
    
    public DTile(int x, int y, int _type){
        TileX = x * 40;
        TileY = y * 40;
        type = _type;
        
        switch(type){
            case 0: img = DMap.tsea; break;
            case 1: img = DMap.tg; break;
            case 2: img = DMap.ts; break;
            case 3: img = DMap.tsw; break;
        }
        boxSea = new Rectangle(0,0,0,0);
        boxSw = new Rectangle(0,0,0,0);
        boxGrass = new Rectangle(0,0,0,0);
        boxSand = new Rectangle(0,0,0,0);

        will = DGame.getWill();
    }
    
    /*public void Draw(Graphics g, DCamera cam){
        g.drawRect(boxSea.x - (int)cam.GetX(), boxSea.y - (int)cam.GetY(), 40, 40);
    }*/
    
    public void update(){
        if (type == 0){
             boxSea.setRect(TileX, TileY, 40, 40);           
        }   
        if (type == 3){
            boxSw.setRect(TileX, TileY, 40, 40);       
        }
        if (type == 1){
            boxGrass.setRect(TileX, TileY, 40, 40);
        }
        if (type == 2){
            boxSand.setRect(TileX, TileY, 40, 40);
        }
        
        CheckSideColl(DChar.boxUp, DChar.boxDown, DChar.boxLeft, DChar.boxRight);
        CheckSpeedCollision(DChar.boxDown);
    }
    
    public void CheckSideColl(Rectangle box1, Rectangle box2, Rectangle box3, Rectangle box4){
        if (boxSea.intersects(box1)){
            will.setCenterY(TileY + 45);
            will.stopUpDown();
        }
        
        if (boxSea.intersects(box2)){
            will.setCenterY(TileY - 45);
            will.stopUpDown();
        }
        
        if (boxSea.intersects(box3)){
            will.setCenterX(TileX + 45);
            will.stopLeftRight();
        }
        
        if (boxSea.intersects(box4)){
            will.setCenterX(TileX - 45);
            will.stopLeftRight();
        }
    }
    
    public void CheckSpeedCollision(Rectangle box){
        if (box.intersects(boxSw)){
            will.setSpeed(2);
        }
        else if (box.intersects(boxGrass)) will.setSpeed(3);
        else if (box.intersects(boxSand)) will.setSpeed(3);
    }
    
    public int GetTileX(){
        return TileX;
    }
    
    public int GetTileY(){
        return TileY;
    }
    
    public BufferedImage GetBuff(){
        return img;
    }
    
    public int GetType(){
        return type;
    }
    
    public Rectangle GetBox(){
        return boxSea;
    }
}

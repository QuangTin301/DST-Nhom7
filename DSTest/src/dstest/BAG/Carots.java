/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest.BAG;

import dstest.DCamera;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Carots extends Base_Item{
       
    private BufferedImage Image_Item;
    //private BufferedImage[][] WillsubImage;
    //private DAnimation WillUp, WillDown, WillLeft, WillRight;
    //private boolean isUp, isDown, isLeft, isRight;  
    //private ArrayList<DAnimation> WillState;   
    //private int dir; 
   
    public Carots(int X, int Y){
       super(X,Y);
       
       Name_Item = "Carot";
       Type_Item = 1;
       Quantity = 0;
       
       //
       imgItem = "res/Bag_item/item.PNG";
       //
    }
    
    public void Load(){        
        super.Load();
        Image_Item = Item.getSubimage(0 + Width_Item,0,Width_Item,Height_Item);                     
    }
    
    public void Draw(Graphics g){      
        g.drawImage(Image_Item, centerX , centerY , null);
    }
}

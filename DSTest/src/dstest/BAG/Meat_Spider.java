/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest.BAG;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Meat_Spider extends Base_Item{

    //private BufferedImage[][] WillsubImage;
    //private DAnimation WillUp, WillDown, WillLeft, WillRight;
    //private boolean isUp, isDown, isLeft, isRight;  
    //private ArrayList<DAnimation> WillState;   
    //private int dir; 
   
    public Meat_Spider(int X, int Y){
       super(X,Y);
       
       Name_Item = "Meat_spider";
       Type_Item = 14;
       Quantity = 0;
       
       //
       URL_Image_Item = "res/Bag_item/monster_meat.PNG";
       //
    }
    
    public void Load(){        
        try{
            Image_Item = ImageIO.read(new File(URL_Image_Item));                    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Draw(Graphics g){      
        g.drawImage(Image_Item, centerX , centerY , null);
    }
}

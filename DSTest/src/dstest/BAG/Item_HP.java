/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest.BAG;

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Item_HP extends Base_Item{
    
    //private BufferedImage[][] WillsubImage;
    //private DAnimation WillUp, WillDown, WillLeft, WillRight;
    //private boolean isUp, isDown, isLeft, isRight;  
    //private ArrayList<DAnimation> WillState;   
    //private int dir; 

    public Item_HP(int X, int Y) {
        super(X, Y);
       
       
       Name_Item = "hp_potion";
       Type_Item = 75;
       Quantity = 0;
       
       //
       URL_Image_Item = "res/Bag_item/hp_potion.PNG";
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

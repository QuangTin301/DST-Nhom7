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
public class Base_Item {
    
    final static String imgItem = "res/Bag_item/item.PNG";  
    
    protected BufferedImage Item;
    
    protected String Name_Item;   
    protected int Type_Item;
    // số lượng
    protected int Quantity;
    
    // kích cỡ item
    protected int Width_Item;
    protected int Height_Item;
    
    // Tọa độ trung tâm hình của Item
    protected int centerX;
    protected int centerY;
    
    public Base_Item(int X, int Y){
       
        Width_Item = 72;
        Height_Item = 72;
        
        centerX = X + Width_Item/2;
        centerY = Y + Height_Item/2;
    };
    
    public String GetName() {
        return Name_Item;
    }
    public int GetType() {
        return Type_Item;
    }    
    public int GetQuantity() {
        return Quantity;
    }  
    
    public void SetQuantity(int sl) {
        Quantity = sl;
    }
    
    // load image
    public void Load(){    
        try{
            Item = ImageIO.read(new File(imgItem));                    
        }catch(Exception e){
            e.printStackTrace();
        }
        
    };
    
    // vẽ item
    public void Draw(Graphics g){};
    
    
    
}

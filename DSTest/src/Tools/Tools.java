/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import dstest.BAG.Bag_Item;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Tools {

    protected String URL_Image_Bar = "res/left_bar.PNG";     
    protected BufferedImage Image_Bar;
    
    private int centerX;
    private int centerY;
    
    private int Width_Item;
    private int Height_Item;
    
    private Axe axe;
    private Pickaxe pickaxe;
    private Spear spear;
    private Hp_Potion hp_Potion;
    private Tent tent;
    private Fire_Pit fire_pit;
    private Ice_Machine ice_Machine;
    private Ice_Stone ice_Stone;
    private Flall flall;
    private Brick brick;
    private Gate gate;
    

    public Tools(){
        
        centerX = 0;
        centerY = 0;
        Width_Item = 60;
        Height_Item = 60;

        axe = new Axe();
        pickaxe = new Pickaxe();
        spear = new Spear();
        hp_Potion = new Hp_Potion();
        tent = new Tent();
        fire_pit = new Fire_Pit();
        ice_Machine = new Ice_Machine();
        ice_Stone = new Ice_Stone();
        flall = new Flall();
        brick = new Brick();
        gate = new Gate();   
    }
    
    public int Get_TT_Axe(){
        return axe.Get_TT();
    }
    public int Get_TT_Pickaxe(){
        return pickaxe.Get_TT();
    }
    public int Get_TT_Spear(){
        return spear.Get_TT();
    }
    public int Get_TT_Hp_Potion(){
        return hp_Potion.Get_TT();
    }
    public int Get_TT_Tent(){
        return tent.Get_TT();
    }
    public int Get_TT_Fire_Pit(){
        return fire_pit.Get_TT();
    }
    public int Get_TT_Ice_Machine(){
        return ice_Machine.Get_TT();
    }
    public int Get_TT_Ice_Stone(){
        return ice_Stone.Get_TT();
    }
    public int Get_TT_Flall(){
        return flall.Get_TT();
    }
    public int Get_TT_Brick(){
        return brick.Get_TT();
    }
    public int Get_TT_Gate(){
        return gate.Get_TT();
    }
    
    
    public void load(){
        try{
            Image_Bar = ImageIO.read(new File(URL_Image_Bar));                    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Draw_Left_Bar(Graphics g){      
        g.drawImage(Image_Bar, centerX , centerY , null);
        
       //80
        
        axe.Draw(g, centerX, centerY + 60*0);
        pickaxe.Draw(g, centerX, centerY + 60*1);
        spear.Draw(g, centerX, centerY + 60*2);
        hp_Potion.Draw(g, centerX, centerY + 60*3);
        tent.Draw(g, centerX, centerY + 60*4);
        fire_pit.Draw(g, centerX, centerY + 60*5);
        ice_Machine.Draw(g, centerX, centerY + 60*6);
        ice_Stone.Draw(g, centerX, centerY + 60*7);
        flall.Draw(g, centerX, centerY + 60*8);
        brick.Draw(g, centerX, centerY + 60*9);
        gate.Draw(g, centerX, centerY + 60*10);
    };
    
    public void update(Bag_Item BAG){       
        if(axe.CheckCondition(BAG))
        {
            axe.Set_TT(1);
        } else axe.Set_TT(0);
    }
}

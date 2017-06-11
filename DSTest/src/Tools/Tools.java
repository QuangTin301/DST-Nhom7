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
    
    private int STT;

    
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
        
        STT = -1;
    }
    
    public int Get_STT(){
        return STT;
    } 
    public void Set_STT(int stt){
        STT = stt;
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
    
    public void Set_TT_Axe(int tt){
        axe.Set_TT(tt);
    }
    public void Set_TT_Pickaxe(int tt){
        pickaxe.Set_TT(tt);
    }
    public void Set_TT_spear(int tt){
        spear.Set_TT(tt);
    }
    public void Set_TT_hp_Potion(int tt){
        hp_Potion.Set_TT(tt);
    }
    public void Set_TT_tent(int tt){
        tent.Set_TT(tt);
    }
    public void Set_TT_fire_pit(int tt){
        fire_pit.Set_TT(tt);
    }
    public void Set_TT_ice_Machine(int tt){
        ice_Machine.Set_TT(tt);
    }
    public void Set_TT_ice_Stone(int tt){
        ice_Stone.Set_TT(tt);
    }
    public void Set_TT_flall(int tt){
        flall.Set_TT(tt);
    }
    public void Set_TT_brick(int tt){
        brick.Set_TT(tt);
    }
    public void Set_TT_gate(int tt){
        gate.Set_TT(tt);
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

        switch(STT){
            case 0:{
                axe.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 1:{
                pickaxe.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 2:{
                spear.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 3:{
                hp_Potion.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 4:{
                tent.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 5:{
                fire_pit.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 6:{
                ice_Machine.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 7:{
                ice_Stone.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 8:{
                flall.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 9:{
                brick.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case 10:{
                gate.DrawSuggest(g, centerX + 80, centerY + 60*0);
            }break;
            case -1:{
                
            }break;
            
        }
    };
    
    public void update(Bag_Item BAG){       
        if(axe.CheckCondition(BAG)){
            if(axe.Get_TT() == 0)
                axe.Set_TT(1);
        } else if(axe.Get_TT() != 0) 
                axe.Set_TT(0);

        if(pickaxe.CheckCondition(BAG)){
            if(pickaxe.Get_TT() == 0)
                pickaxe.Set_TT(1);
        } else if(pickaxe.Get_TT() != 0) 
                pickaxe.Set_TT(0);
        
        if(spear.CheckCondition(BAG)){
            if(spear.Get_TT() == 0)
                spear.Set_TT(1);
        } else if(spear.Get_TT() != 0) 
                spear.Set_TT(0);
        
        if(hp_Potion.CheckCondition(BAG)){
            if(hp_Potion.Get_TT() == 0)
                hp_Potion.Set_TT(1);
        } else if(hp_Potion.Get_TT() != 0) 
                hp_Potion.Set_TT(0);
        
        if(tent.CheckCondition(BAG)){
            if(tent.Get_TT() == 0)
                tent.Set_TT(1);
        } else if(tent.Get_TT() != 0) 
                tent.Set_TT(0);
        
        if(fire_pit.CheckCondition(BAG)){
            if(fire_pit.Get_TT() == 0)
                fire_pit.Set_TT(1);
        } else if(fire_pit.Get_TT() != 0) 
                fire_pit.Set_TT(0);
        
        if(ice_Machine.CheckCondition(BAG)){
            if(ice_Machine.Get_TT() == 0)
                ice_Machine.Set_TT(1);
        } else if(ice_Machine.Get_TT() != 0) 
                ice_Machine.Set_TT(0);

        if(ice_Stone.CheckCondition(BAG)){
            if(ice_Stone.Get_TT() == 0)
                ice_Stone.Set_TT(1);
        } else if(ice_Stone.Get_TT() != 0) 
                ice_Stone.Set_TT(0);
        
        if(flall.CheckCondition(BAG)){
            if(flall.Get_TT() == 0)
                flall.Set_TT(1);
        } else if(flall.Get_TT() != 0) 
                flall.Set_TT(0);
        
        if(brick.CheckCondition(BAG)){
            if(brick.Get_TT() == 0)
                brick.Set_TT(1);
        } else if(brick.Get_TT() != 0) 
                brick.Set_TT(0);
        
        if(gate.CheckCondition(BAG)){
            if(gate.Get_TT() == 0)
                gate.Set_TT(1);
        } else if(gate.Get_TT() != 0) 
                gate.Set_TT(0);
        
        
        
    }
}

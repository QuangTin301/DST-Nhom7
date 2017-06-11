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
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Bag_Item {
    protected String URL_Image_Bar = "res/bot_bar.PNG";     
    protected BufferedImage Image_Bar;
    
    private ArrayList<Base_Item> BAG_Item;
    
    private int centerX;
    private int centerY;
    
    private int Width_Item;

    
    private int cur;
    private int max = 10;
    private int Item_Quantity;
    
    private boolean news = false;
    private int vitri;
    
    
    public int GetQuantity(){
        return Item_Quantity;
    }
    
    public Bag_Item(){
        BAG_Item = new ArrayList<Base_Item>();
        Item_Quantity = 0;
        
        cur = -1;
        vitri = -1;
        
        centerX = 110;
        centerY = 580;
        Width_Item = 60;
   
        
    }

    public void Load(){
        if(cur >=0){
            for( int i = 0; i < BAG_Item.size(); i++){               
                BAG_Item.get(i).Load();
            }
        }
    }
    
    public void LoadBar(){
        try{
            Image_Bar = ImageIO.read(new File(URL_Image_Bar));                    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Add_item(int type, int SoLuong){
        if(cur < max){
            
            if(cur == -1) {
                cur +=1;
                news = true;
            }
            else {
                for( int i = 0; i < BAG_Item.size(); i++){                
                    if(type == BAG_Item.get(i).Type_Item) {                           
                        vitri = i;
                    }                                 
                }
                
                if(vitri == -1 ){
                    cur +=1;
                    news = true;
                }
                
            }
            
            
            if(news == true){
                switch (type){
                    case 11:{
                        BAG_Item.add(new Berry(centerX + (Width_Item+17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 12: {
                        BAG_Item.add(new Carots(centerX + (Width_Item+17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 13:{
                        BAG_Item.add(new Flower(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 14:{
                        BAG_Item.add(new Meat_Spider(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 15:{
                        BAG_Item.add(new Big_Meat(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 16:{
                        BAG_Item.add(new Small_Meat(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break; 
                    case 17:{
                        BAG_Item.add(new Item_Ice(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 21:{
                        BAG_Item.add(new Gold(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 22:{
                        BAG_Item.add(new Rock(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 31:{
                        BAG_Item.add(new Bough(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 32:{
                        BAG_Item.add(new Straw(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 33:{
                        BAG_Item.add(new Wood(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 34:{
                        BAG_Item.add(new Reed(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 35:{
                        BAG_Item.add(new Silk(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 41:{
                        BAG_Item.add(new Teeth_Monter(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 42:{
                        BAG_Item.add(new Bone(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 51:{
                        BAG_Item.add(new GEM(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 52:{
                        BAG_Item.add(new Diamond(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 61:{
                        BAG_Item.add(new Key(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;   
                    case 62:{
                        BAG_Item.add(new Staff(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 71:{
                        BAG_Item.add(new Item_Axe(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;   
                    case 72:{
                        BAG_Item.add(new Item_PickAxe(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 73:{
                        BAG_Item.add(new Item_Spear(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;   
                    case 74:{
                        BAG_Item.add(new Item_Flall(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 75:{
                        BAG_Item.add(new Item_HP(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;  
                    case 76:{
                        BAG_Item.add(new Item_Brick(centerX + (Width_Item +17)*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;   
                }
                
                SoLuong = SoLuong + BAG_Item.get(cur).GetQuantity();
                BAG_Item.get(cur).SetQuantity(SoLuong);
            } else {
                SoLuong = SoLuong + BAG_Item.get(vitri).GetQuantity();
                BAG_Item.get(vitri).SetQuantity(SoLuong);
                vitri = -1;
            }         
        }       
    }
    
    public void Draw(Graphics g){      
        for( int i = 0; i < BAG_Item.size(); i++){               
                BAG_Item.get(i).Draw(g);               
        }
    };
    
    public void Draw_Bot_Bar(Graphics g){      
        g.drawImage(Image_Bar, centerX , centerY , null);
    };

    public int GetTypeItem(int i){
        return BAG_Item.get(i).GetType();
    }
    
    public String GetNameItem(int i){
        return BAG_Item.get(i).GetName();
    }
    
    public int GetQuantityItem(int i){
        return BAG_Item.get(i).Quantity;
    }
}

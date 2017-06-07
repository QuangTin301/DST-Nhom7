/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest.BAG;

import dstest.DCamera;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author 14520
 */
public class Bag_Item {
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
        
        centerX = 0;
        centerY = 440;
        Width_Item = 72;
   
    }

    public void Load(){
        if(cur >=0){
            for( int i = 0; i < BAG_Item.size(); i++){               
                BAG_Item.get(i).Load();
            }
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
                    case 0:{
                        BAG_Item.add(new meats(centerX + Width_Item*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                    case 1: {
                        BAG_Item.add(new carots(centerX + Width_Item*cur ,centerY));
                        news = false;
                        Item_Quantity +=1;
                    } break;
                }
                
                SoLuong = SoLuong + BAG_Item.get(cur).GetQuantity();
                BAG_Item.get(cur).SetQuantity(SoLuong);
            } else {
                SoLuong = SoLuong + BAG_Item.get(vitri).GetQuantity();
                BAG_Item.get(vitri).SetQuantity(SoLuong);
            }         
        }       
    }
    
    public void Draw(Graphics g){      
        for( int i = 0; i < BAG_Item.size(); i++){               
                BAG_Item.get(i).Draw(g);               
        }
    };

    public int GetTypeItem(int i){
        return BAG_Item.get(i).GetType();
    }
    
    public String GetNameItem(int i){
        return BAG_Item.get(i).GetName();
    }
}

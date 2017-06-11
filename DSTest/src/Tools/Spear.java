/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import dstest.BAG.Bag_Item;
import dstest.BAG.Bough;
import dstest.BAG.Rock;
import dstest.BAG.Straw;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author 14520
 */
public class Spear implements Base_Tools{
    protected String URL_Image_Frame = "res/window_3.PNG";     
    protected BufferedImage Image_Frame;

    protected String URL_Image_NOT = "res/Tools/Spear_not.PNG";  
    protected String URL_Image = "res/Tools/Spear.PNG";     
    protected String URL_Image_PICKED = "res/Tools/Spear_picked.PNG";  
    
    protected BufferedImage Image_NOT;
    protected BufferedImage Image;   
    protected BufferedImage Image_PICKED;
    
    private int TT;
    // TT = 0 (NOT)
    // TT = 1 ()
    // TT = 2 (PICKED)
    
    // Loại NL 1
    private int Loai_NL1;
    private int So_Luong_NL1;
    private boolean Condition1;
    
    // Loại NL 2
    private int Loai_NL2;
    private int So_Luong_NL2;
    private boolean Condition2;
    
    private int Loai_NL3;
    private int So_Luong_NL3;
    private boolean Condition3;
    
    public Spear(){
        
        try{
            Image_NOT = ImageIO.read(new File(URL_Image_NOT));     
            Image = ImageIO.read(new File(URL_Image)); 
            Image_PICKED = ImageIO.read(new File(URL_Image_PICKED));  
            
            Image_Frame = ImageIO.read(new File(URL_Image_Frame));  
        }catch(Exception e){
            e.printStackTrace();
        }
    
        TT = 0;
        
        Loai_NL1 = 31;
        So_Luong_NL1 = 2;
        
        Loai_NL2 = 22;
        So_Luong_NL2 = 2;
        
        Loai_NL3 = 32;
        So_Luong_NL3 = 3;
        
        Condition1 = false;
        Condition2 = false;
        Condition3 = false;
    }

    @Override
    public boolean CheckCondition(Bag_Item BAG) {
        if(BAG.GetQuantity() > 0){
            for(int i = 0; i < BAG.GetQuantity(); i++){
                if( (BAG.GetTypeItem(i)==Loai_NL1) && (BAG.GetQuantityItem(i)== So_Luong_NL1) )
                    Condition1 = true;
            }
            
            for(int i = 0; i < BAG.GetQuantity(); i++){
                if( (BAG.GetTypeItem(i)== Loai_NL2) && (BAG.GetQuantityItem(i)== So_Luong_NL2) )
                    Condition2 = true;
            }
            
            for(int i = 0; i < BAG.GetQuantity(); i++){
                if( (BAG.GetTypeItem(i)== Loai_NL3) && (BAG.GetQuantityItem(i)== So_Luong_NL3) )
                    Condition3 = true;
            }
        }      
        return (Condition1 == true && Condition2 == true && Condition3 == true);   
    }

    @Override
    public void Draw(Graphics g, int X, int Y) {
        
        switch(TT){
            case 0:{
                g.drawImage(Image_NOT, X + 12 , Y +23 , null);
            }break;
            case 1:{
                g.drawImage(Image, X + 12 , Y +23 , null);
            }break;
            case 2:{
                g.drawImage(Image_PICKED, X + 12 , Y +23 , null);
            }break;
        }       
    }
    
    @Override
    public int Get_TT() {
        return TT;
    }
    @Override
    public void Set_TT(int T) {
        TT = T;
    }

    @Override
    public void DrawSuggest(Graphics g, int X, int Y) {
            Font font = new Font("Belisa plumilla manual", Font.PLAIN, 20);
            Font font2 = new Font("Belisa plumilla manual", Font.BOLD, 20);

            g.drawImage(Image_Frame, X + 20, Y + 15, null);

            Rock  rock  = new Rock (X +  65 ,Y +  65);
            Bough bough = new Bough(X + 140 ,Y +  65);
            Straw straw = new Straw(X + 105 ,Y + 135);

            rock.Load();
            rock.Draw(g);
            bough.Load();
            bough.Draw(g);
            straw.Load();
            straw.Draw(g);

            g.setColor(Color.red);



            g.setFont(font);                      
            g.drawString("Weapon", X + 100, Y + 260);

            g.setFont(font2);   
            g.drawString("SPEAR", X + 150, Y + 80);
            g.drawString("x 2", X + 133, Y + 150);
            g.drawString("x 2", X + 213, Y + 150);
            g.drawString("x 3", X + 173, Y + 230);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import dstest.BAG.Bag_Item;
import javax.swing.JOptionPane;

/**
 *
 * @author 14520
 */
public class Axe implements Base_Tools{

    // Loại NL 1
    private int Loai_NL1;
    private int So_Luong_NL1;
    private boolean Condition1;
    
    // Loại NL 2
    private int Loai_NL2;
    private int So_Luong_NL2;
    private boolean Condition2;
    
    public Axe(){
        Loai_NL1 = 0;
        So_Luong_NL1 = 1;
        
        Loai_NL2 = 1;
        So_Luong_NL2 = 1;
        
        Condition1 = false;
        Condition2 = false;
    }

    @Override
    public boolean CheckCondition(Bag_Item BAG) {
        if(BAG.GetQuantity() > 0){
            for(int i = 0; i < BAG.GetQuantity(); i++){
                if( (BAG.GetTypeItem(i)==0) && (BAG.GetQuantityItem(i)== 2) )
                    Condition1 = true;
            }
            
            for(int i = 0; i < BAG.GetQuantity(); i++){
                if( (BAG.GetTypeItem(i)== 1) && (BAG.GetQuantityItem(i)== 2) )
                    Condition2 = true;
            }                    
        }
      
        return (Condition1 == true && Condition2 == true);   
    }
    
    
    
    
    
}

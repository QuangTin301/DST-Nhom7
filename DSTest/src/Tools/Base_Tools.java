/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import dstest.BAG.Bag_Item;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author 14520
 */
interface Base_Tools {
      
    public boolean CheckCondition(Bag_Item BAG);
    public void Draw(Graphics g, int X, int Y);
    public int Get_TT();
    public void Set_TT(int T);
}

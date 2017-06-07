/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.Rectangle;

/**
 *
 * @author VIETHUNG
 */
public class DCollision {
    public DCollision(){
        
    }
    
    public boolean CheckCollision(Rectangle box1, Rectangle box2){
        if (box1.intersects(box2))
            return true;
        return false;
    }
}

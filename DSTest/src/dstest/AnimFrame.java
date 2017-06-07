/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.image.BufferedImage;

/**
 *
 * @author VIETHUNG
 */
public class AnimFrame {
    private BufferedImage img;
    private long endTime;
    
    public AnimFrame(BufferedImage _img, long _endTime){
        img = _img;
        endTime = _endTime;
    }
    
    public BufferedImage GetBuff(){
        return img;
    }
    
    public long GetEndTime(){
         return endTime;
    }
}

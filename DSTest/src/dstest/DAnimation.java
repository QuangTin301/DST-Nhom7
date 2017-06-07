/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author VIETHUNG
 */
public class DAnimation {
    private ArrayList<AnimFrame> frames;
    private int curFrame;
    private long animTime;
    private long totalDuration;
    
    public DAnimation(){
        frames = new ArrayList<AnimFrame>();
        totalDuration = 0;
        
        synchronized(this){
            animTime = 0;
            curFrame = 0;
        }
    }
    
    public synchronized void addFrame(BufferedImage img, long duration){
        totalDuration += duration;
        frames.add(new AnimFrame(img, totalDuration));
    }
    
    public synchronized void update(long eTime){
       
        if (frames.size() > 1){
            animTime += eTime;
            
            if (animTime > totalDuration){
                animTime %= totalDuration;
                curFrame = 0;
            }
            while (animTime > getFrame(curFrame).GetEndTime())
                curFrame++;
        }
    }
    
    public synchronized BufferedImage GetBuff(){
        if (frames.size() == 0){
            return null;
        }
        else {
            return getFrame(curFrame).GetBuff();
        }
    }
    
    private AnimFrame getFrame(int i){
        return frames.get(i);
    }
    
    public ArrayList<AnimFrame> getFrames(){
        return frames;
    }
    
    public int GetCurFrame(){
        return curFrame;
    }
    
    public long GetAnimTime(){
        return animTime;
    }
    
    public long GetTotalDuration(){
        return totalDuration;
    }
}

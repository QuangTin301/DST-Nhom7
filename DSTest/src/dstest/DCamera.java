/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

/**
 *
 * @author VIETHUNG
 */
public class DCamera {
    private float OffsetX;
    private float OffsetY;
    
    public DCamera(){}
    
    public DCamera(float x, float y){
        OffsetX = x;
        OffsetY = y;
    }

    public void Load(float x, float y){
        OffsetX += x;
        OffsetY += y;
    }
    
    public void update(DChar will){
        OffsetX = will.getCenterX() - DGame.SCREEN_WIDTH/2 + will.GetWidth()/2;
        OffsetY = will.getCenterY() - DGame.SCREEN_HEIGHT/2 + will.GetHeight()/2;
    }
    
    public float GetX(){
        return OffsetX;
    }
    
    public float GetY(){
        return OffsetY;
    }
    
    public void SetX(float x){
        OffsetX = x;
    }
    
    public void SetY(float y){
        OffsetY = y;
    }
}

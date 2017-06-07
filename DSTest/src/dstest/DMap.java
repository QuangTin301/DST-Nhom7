/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstest;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author VIETHUNG
 */
public class DMap {
        
    final static String imgGrass = "res/TileGrass.png";
    final static String imgSand = "res/TileSand.png";
    final static String imgSea = "res/TileSea.png";
    final static String imgSwarm = "res/TileSwarm.png";
    
    public static BufferedImage tg, ts, tsea, tsw;
    private ArrayList<DTile> tileArray;
    public DCollision coll;
    
    
    public DMap(){
        tileArray = new ArrayList<DTile>();
    }
    
    public void Load(){
        try{
            tg = ImageIO.read(new File(imgGrass));
            ts = ImageIO.read(new File(imgSand));
            tsea = ImageIO.read(new File(imgSea));
            tsw = ImageIO.read(new File(imgSwarm));
        }catch(Exception e){
            e.printStackTrace();
        }    
    }
    
    public void DrawMap(String file) throws IOException{
        ArrayList<String> lines = new ArrayList<String>();
        int w = 0;
        int h = 0;
        
        BufferedReader reader = new BufferedReader (new FileReader(file));
        
        while(true){
            String line = reader.readLine();
            if(line == null){
                reader.close();
                break;
            }
            if (!line.startsWith("!")){
                lines.add(line);
                w = Math.max(w, line.length());
            }
            h = lines.size();
              
        }
        
        for (int j = 0; j < h; j++){
            String line = (String)lines.get(j);
            for (int i = 0; i < w; i++){
                if (i < line.length()){
                    char c = line.charAt(i);
                    DTile t = new DTile (i, j, Character.getNumericValue(c));
                    tileArray.add(t);
                }
            }
        }
    }
    
    public void update(){
        for (int i = 0; i < tileArray.size(); i++){
            DTile t = (DTile)tileArray.get(i);
            t.update();
        }
    }
    
    public void Draw(Graphics g, DCamera camera){
        for (int i = 0; i < tileArray.size(); i++){
            DTile t = (DTile)tileArray.get(i);
            if (t.GetTileX() > (camera.GetX() - 40) 
                    && t.GetTileX() < (camera.GetX() + DGame.SCREEN_WIDTH + 40)
                    && t.GetTileY() > (camera.GetY() - 40)
                    && t.GetTileY() < (camera.GetY() + DGame.SCREEN_HEIGHT + 40))
            {      
                g.drawImage(t.GetBuff(), t.GetTileX() - (int)camera.GetX(), t.GetTileY() - (int)camera.GetY(), null);
                t.update();
                //t.Draw(g, camera);
                
            }
        }
    }
    
    public ArrayList<DTile> getTile(){
        return tileArray;
    }
    
}

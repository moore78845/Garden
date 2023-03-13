import ecs100.*;
import java.awt.Color;
/**
 * flower support class 
 * creates a flower of a size and colour 
 * it can grow.
 *
 * @author ruth moore 
 * @version 13/03/2023
 */
public class Flower
{
    private double flowerX; //this is the x pos of the flower 
    private double flowerY; //this is the y pos of the flower
    
    private int flowerSize; // flower size 
    private int flowerHeight; // flower height
    
    private double left; //know the left of the flower 
    private double top;  // top of the flower
    private double bottom; // bottom of the flower.
 
    
    private Color color; // Colour of flower 

    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        flowerX = x;
        flowerY= y;
        flowerSize = size;
        flowerHeight = stem;
        color = col;
        
        //set the top, left and bottom;
        
        setTop();
        setLeft();
        setBottom();
        
       
        
    }
    

    /**
    set left 
     */
    public void setLeft(){
    this.left = this.flowerX - this.flowerSize/2.0;
    }
    
    //set top 
    public void setTop(){
    this.top = this.flowerY - this.flowerSize/2.0;
    }
    //set bottom 
    public void setBottom(){
    this.bottom = this.flowerY + this.flowerHeight;
    }
    
    
    //erase a rectangle around the current instance 
    public void erase(){
    UI.eraseRect(left, top, flowerSize+1, bottom+1);}
    
    //make the flower grow
    public void grow(){
    
    this.erase();
this.flowerY -=10; //inctease the height
this.flowerSize += 10; //increase the size of the bulb
this.setTop();
this.setLeft();

 this.draw(); // redraw the flower.

}
    
    //draw our flower in the screen 
    public void draw(){
        final int STEMWIDTH = 2;
        //draw stem 
        //set the colour of stem 
        UI.setColor(Color.green);
        UI.setLineWidth(STEMWIDTH);
        UI.drawLine(flowerX, flowerY, flowerX, bottom);
        
        //set the width of the stem 
        // draw in the stem 
        
        UI.setColor(this.color);
        UI.fillOval(left, top, flowerSize, flowerSize);
        UI.sleep(500);
        //draw the flower 
        // set the colour of flower 
        //draw the flower 
        //wait
    
    }
}

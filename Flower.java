import ecs100.*;
import java.awt.Color;
/**
 * flower support class 
 * creates a flower of a size and colour 
 * it can grow.
 * it can tell the driver class where it is on the screen .
 *
 * @author ruth moore 
 * @version 14/03/2023
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
    
    //getter left 
    public double getLeft(){
    return this.left;
    }
    
    //getter right 
    public double getRight(){
        return this.left +this.flowerSize;
        
    }

    // getter top 
    public double getTop(){
    return this.top;
}
    
    public double getBottom(){
    return this.bottom;
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
        final int BUFFER = 1;
    UI.eraseRect(left, top, flowerSize+BUFFER, bottom+BUFFER);}
    
    //make the flower grow
    public void grow(){
        final int GROWSIZE = 10;
    
    this.erase();
this.flowerY -=GROWSIZE; //inctease the height
this.flowerSize += GROWSIZE; //increase the size of the bulb
this.setTop();
this.setLeft();

 this.draw(); // redraw the flower.

}
    
    //draw our flower in the screen 
    public void draw(){
        final int WAIT_MS = 500;
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
        UI.sleep(WAIT_MS);
        //draw the flower 
        // set the colour of flower 
        //draw the flower 
        //wait
    
    }
}

import ecs100.*;
import java.awt.Color;
/**
 * driver class for the flower support class 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Garden
{
    Flower f1 = new Flower(50,100,20,50, Color.pink);
    Flower f2 = new Flower(100,100,23,50, Color.yellow);
    Flower f3 = new Flower(150,100,10,50, Color.blue);

    /**
     * Constructor for objects of class Garden
     */
    public Garden(){
    UI.initialise();
     
    UI.addButton("quit", UI::quit);
    f1.draw();
    f2.draw();
    f3.draw();
    f1.grow();
    f2.grow();
    f3.grow();
    f1.grow();
    
    
   
}
    public static void main(String[] args){
        Garden obj = new Garden();
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}

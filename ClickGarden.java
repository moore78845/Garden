import ecs100.*;
import java.awt.Color;
/**
 * create a garden with each flower obj in a array
 * click on the flower and make it grow
 * 
 *
 * @author Ruth 
 * @version 14/03/2023
 */
public class ClickGarden
{
    //class constant 
    // make an array of flowers 
    private static final int STARTX = 75;
    private static final int YPOS = 100;
    private static final int MAXFLOWERS = 5;
    
    private Flower[] flowerBed = new Flower [MAXFLOWERS]; // iniatlize array.

    /**
     * Constructor for objects of class ClickGarden
     */
    public ClickGarden()
    {
     UI.initialise();
     UI.addButton("Quit", UI::quit);
     //set up flower postions 
     
     for (int i =0; i<MAXFLOWERS ; i ++){
        //set every floweer to a random collour 
        Color col =new Color ((float)Math.random(), (float)Math.random(),(float)Math.random());
        flowerBed[i] = new Flower(STARTX* (i+1), YPOS, 10, 50, col); //create the flower objs in the array     }
    
    }
     //draw each flower
     
     for (Flower flower : flowerBed){
        flower.draw();
    }
     
}
}

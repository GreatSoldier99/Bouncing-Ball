import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is our main world, in which we add a Ball object.
 * 
 * Modification date: 12/10/2021
 */
public class BouncingWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public BouncingWorld(){    
        super(450, 600, 1);
        
        Ball ball = new Ball();
        this.addObject(ball,225,300);
    }
}

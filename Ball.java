import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates the "image" of our ball and performs the bouncing motion.
 *  
 * Modification date: 12/10/2021
 */
public class Ball extends Actor{
   
    Ball(){
        this.setImage("images/ball.png");
    }
    
    public void act(){
        bounce();
        move(10);
    }
    
    public void bounce(){
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}

/**
 * Write a description of class Word here.
 * 
 * Julia Huprich 
 * Version 1
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Font;
import java.awt.Color;

public class Word extends Actor
{
   /**Need to initiate the words **/ 
    public void act() 
    {
       setLocation(getX(), getY() -1);
        if (getY() == 0) {
            ((WordWorld) getWorld()).gameOver();
        }
        
     
    } 
       public void pop() 
    {
        Greenfoot.playSound("pop.wav");
        ((WordWorld) getWorld()).countPop();
        getWorld().removeObject(this);
    }
}
    
}

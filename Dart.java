import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dart extends Actor
{
    /**
     * Make the dart follow the mouse and check for mouseclicks.
     */
    public void act() 
    {
        // Follow the mouse
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // Pop
        if(Greenfoot.mouseClicked(null)) {
            int x = -getImage().getWidth()/2;
            int y = getImage().getHeight()/2;
            Word word = (Word) getOneObjectAtOffset(x , y, Word.class);
            if(word != null) {
                word.pop();
            }
        }
        
    }    
}

/**
**Julia Huprich
**Version 1
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class WordWorld extends World 
{
   Counter counter = new Counter("Score: ");

   
    
    public WordWorld()
    {    
        super(800, 600, 1);

        // Make sure actors are painted in the correct order.
        setPaintOrder(ScoreBoard.class, Explosion.class, Bomb.class, Dart.class, Word.class, Counter.class);

        // Add the initial actors
        populate();

        prepare();
    }

  
    
    /**
     * Creates balloons at the bottom of the world.
     */
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) < 3) {
            addObject(new Word(), Greenfoot.getRandomNumber(700), 600);   
        }
    }

    /**
     * Count one word balloon
     */
    public void countPop()
    {
        counter.add(20);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void gameOver() 
    {
        addObject(new ScoreBoard(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.playSound("buzz.wav");
        Greenfoot.stop();
    }

    /**
     * Populate the world with bombs and a crosshair.
     */
    private void populate()
    {
        addObject(new Bomb(), 750, 410);
        addObject(new Bomb(), 750, 480);
        addObject(new Bomb(), 750, 550);
        addObject(new Dart(), 400,300);

        addObject(counter, 100, 560);
    }  
    public void BasicDraw()
    {
    }
   

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
       
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappybirdRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappybirdRed extends Bird
{
    // Add your action code here.
    public String upKey;
    public String downKey;
    /**
     * Act - do whatever the FlappybirdBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     **/
    public FlappybirdRed(World w)
    {
        super();
        getImage().scale(50, 55);
    }
    /**
    * Act - do whatever the Bird wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {
        checkKeyPress();
    }    
     /**
     * checkKeyPress checks to see what keys are pressed
     * 
     * @param there are none
     * @return nothing is returned
     */
    private void checkKeyPress()
    {
        upKey = "w";
        downKey = "s";
        if(Greenfoot.isKeyDown(upKey))
        {
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown(downKey))
        {
            setLocation(getX(), getY() + 4);
        }
        if(isTouching(Donuts.class)== true)
        {
            removeTouching(Donuts.class);
            ((FlappyWorld)getWorld()).update();
        }
    } 
    /**
     * switchBird switches bird colour
     * 
     * @param int idx
     * @return nothing is returned
     */
    public void switchBird(int idx)
    {
        FlappyWorld birdWorld  = ((FlappyWorld)getWorld());
        Bird switchBird = birdWorld.getOneNewBird(idx);
        while(getX() > 0)
        {
            setLocation(getWorld().getHeight()/2, getWorld().getWidth() - 100);
            Greenfoot.delay(2);
        }
        getImage().setTransparency(0);
        if(idx == 0)
        {
            birdWorld.changeBirdColour("FlappybirdGreen");
        }
        else
        {
            birdWorld.changeBirdColour("FlappybirdBlue");
            switchBird.switchedIn();
        }
    }
    /**
     * 
     *switchedIn sets the transparency and location of the image
     *
     *@param there are none
     *@return nothing is returnecd
     */
    public void switchedIn()
    {
        getImage().setTransparency(255);
        while(getX() < getImage().getWidth()/2)
        {
            setLocation(getX()+5, getY());
            Greenfoot.delay(2);
        }
    }
}    
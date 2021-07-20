import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        /**
        *eat();
        *dance();
        *sleep(3);
        *shoutHooray();
        **/
        if (isBored())
        {
            dance();
        }
        if (isHungry())
        {
            eat();
        }
        if (isSleepy())
        {
            sleep(2);
            shoutHooray();
        }
        else
        {
            shoutHooray();
        }
        if (isAlone())
        {
            sleep(4);
        }
        else
        {
            shoutHooray();
        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fish extends Actor
{
    public void act()
    {
        if (isAtEdge())
        {
            turn(17);
        }
        
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90 - 45));
        }
        move(2);
    }
}
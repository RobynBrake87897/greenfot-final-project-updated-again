import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    private GreenfootImage img;
    private String text;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    /**
     * Act - do whatever the Textbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Textbox(String s, int fs, boolean b, Color fg, Color bg)
    {
        super();
        fontSize = fs;
        foreground = fg;
        background = bg;
        text = s;
        img = new GreenfootImage(text, fontSize, foreground, background);
        border = b;
        display();
    }
    /**
     * setText sets the text, fontsize, along with background and foregound colours
     * 
     * @param String s
     * @return nothing is returned
     */
    public void setText(String s)
    {
        text = s;
        img = new GreenfootImage(text, fontSize, foreground, background);
        display();
    }
    /**
     * display sets the textbox in the world
     * 
     * @param there are none
     * @return nothing is returned
     */
    public void display()
    {
        setImage(img);
        if(border == true)
        {
            img.setColor(Color.BLACK);
            img.drawRect(0,0, img.getWidth() - 1, img.getHeight()-1);
            setImage(img);
        }
    }
    /**
     * getText returns the text
     * 
     * @param there are none
     * @return text
     */
    public String getText()
    {
        return text;
    }
}

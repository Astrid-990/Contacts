import ecs100.*;
/**
 * Support class of Contact
 * a contact contains an ID, name, number and image
 *
 * @author Astrid 
 * @version 1/06/2021
 */
public class Contact
{
    // Variables
    private int id;
    private String name;
    private int number;
    private String image;
    private static final String DEFAULT_IMAGE = "contactimg.jpg";

    private double locX, locY;
    
    /**
     * Constructor for objects of class Contact
     */
    public Contact(int id, String nm, int num, String img)
    {
        //initalise instance variables
        this.id = id;        
        this.name = nm;
        this.number = num;
        this.image = img;
    }
    /**
     * Constructor overloading
     * Set default image to obj
     */
    public Contact(int id, String nm, int num)
    {
        this(id, nm, num, DEFAULT_IMAGE);
    }
    
    /**
     * getter for id
     *
     * @return    int the id
     */
    public int getId()
    {
        return this.id;
    }  
    /**
     * getter for name
     *
     */
    public String getName()
    { 
        return this.name;
    }
    /**
     * getter for number
     *
     */
    public int getNumber()
    {
        return this.number;
    }
    /**
     * display our image on our GUI
     */
    public void displayBook()
    {
        //variables
        locX = 100;
        locY = 100;
        final double WIDTH = 100;
        final double HEIGHT = 100;
        
        //draw the image
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
}

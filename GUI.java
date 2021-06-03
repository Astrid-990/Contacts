import ecs100.*;
/**
 * Class for GUI
 *
 * @author Astrid
 * @version 3/06/2021
 */
public class GUI
{
    /**
     * Constructor for objects of class GUI
     */
    public static void main(String[] args)
    {
         // initialise instance variables
         Contacts ct = new Contacts();
         UI.initialise();
         
         UI.addButton("Print All", ct::printAll);
         UI.addButton("Clear", UI::clearGraphics);
         UI.addButton("Quit", UI::quit);
         
    }

}

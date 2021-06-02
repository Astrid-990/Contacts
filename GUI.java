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
    public GUI()
    {
         // initialise instance variables
         Contacts ct = new Contacts();
         UI.initialise();
         UI.addButton("Print All", ct::printAll);
         //UI.addButton("Clear", ct::clear);
         UI.addButton("Quit", UI::quit);
         
    }

}

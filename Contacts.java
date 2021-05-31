import java.util.HashMap;
import ecs100.*;
/**
 * Holds the different contacts in a hashmap
 * allows user to add, find, print and clear from a menu
 * prevent the user from adding a duplicate
 *
 * @author Astrid
 * @version 1/06/2021
 */
public class Contacts
{
    // instance variables
    private HashMap<Integer, Contact> contactsMap;   //Declaring the hashmap
    private int currContactId = 2;

    /**
     * Constructor for objects of class Contacts
     */
    public Contacts()
    {
        // initialise instance variables
        contactsMap = new HashMap<Integer, Contact>();  //Initalise hashmap
        
        //Create contacts
        
        Contact Person1 = new Contact(1, "Astrid Nixon", 0273555325);
        Contact Person2 = new Contact(2, "Lyle Cornish", 0273555325);
        Contact Person3 = new Contact(3, "Rachel Correa", 0273555325);
    }

   
}

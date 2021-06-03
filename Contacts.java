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
    private int currContactId;

    /**
     * Constructor for objects of class Contacts
     */
    public Contacts()
    {
        // initialise instance variables
        contactsMap = new HashMap<Integer, Contact>();  //Initalise hashmap
        
        //Create contacts
        
        Contact person1 = new Contact(1, "Astrid Nixon", 3555325);
        Contact person2 = new Contact(2, "Lyle Cornish", 0273555);
        Contact person3 = new Contact(3, "Rachel Correa", 0275325);
        
        //Add books to hashmap
        contactsMap.put(1,person1);
        contactsMap.put(2,person2);
        contactsMap.put(3,person3);
        
        this.currContactId = 2; // intialise the book id
        
        this.menu();
    }

    /**
     * adds a contact to the map
     */
    public void addContact()
    {
        final int MAX_NUMBER = 999999999;
        int number = 0;
        
        // Ask the user for details
        String name = UI.askString("Name: ");
        
        //check boundaries for the phone number
        
        do
        {
            number = UI.askInt("Phone Number: ");
        }while (number < MAX_NUMBER);
        
        //add a profile picture for display in the GUI
        String imgFileName = UIFileChooser.open("Choose Image FIle: ");
        
        //interment the book ID counter and add book to hashmap
        this.currContactId++;
        contactsMap.put(currContactId,new Contact(currContactId, name, number, imgFileName));
    }
    
    /**
     * finds a book based on id
     */
    public void findContact()
    {
        String name = UI.askString("Name: ");   //Get what contact they want to find
        
        
    }
    
    /**
     * print all contacts
     */
    public void printAll()
    {
        //Traversing map
        for (int contactId : contactsMap.keySet())
        {
            UI.println(contactId + "Details: ");
            UI.println(contactsMap.get(contactId).getName() + " "
                        + contactsMap.get(contactId).getNumber() + " ");
            contactsMap.get(contactId).displayBook();
        }
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    public void menu()
    {
        //print menu anf force choice
        String choice;
        
        do{
            UI.println("(A)dd a contact");
            UI.println("(F)ind a contact");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A"))
            {
                addContact();
            }
            else if (choice.equalsIgnoreCase("F"))
            {
                findContact();
            }
            else if (choice.equalsIgnoreCase("P"))
            {
                printAll();
            }
            else if (choice.equalsIgnoreCase("Q"))
            {
                UI.println("GoodBye");
                UI.quit();
            }
            else
            {
                UI.println("Please pick A, F, P or Q");
            }
        
        }while(!choice.equalsIgnoreCase("Q"));
    }
   
}

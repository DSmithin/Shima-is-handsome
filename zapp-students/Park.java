 
import java.util.*;

/**This class implements the ZAPP interface
 *
 * @author 
 * @version 
 **/
public class Park implements ZAPP
{
    private String parkName;
    private ArrayList<Area> areas;
    private ArrayList<Bridge> bridges;
    private ArrayList<Card> cards;

    /** constructor
     */
    public Park(String nme) 
    {
        parkName = nme;
        this.areas = new ArrayList<>();
        this.bridges = new ArrayList<>();
        this.cards = new ArrayList<>();
        loadAreas();
        setUpBridges();
        loadCards();
        
        
    }
    
    /**
     * Returns all of the details of the park: its name and its areas 
     * including lists of cards in each area.
     */
    public String toString()
    {
         
        return "";
    }
    
    /**Returns a String with details of a card
     * @param cardId - id number of the card
     * @return the details of the card as a String, or "No such card"
     */
    public String getCardDetails(int cardId)
    {
        
        return "No such card";
    } 
    
    /**Returns the name of the area which contains the specified card or null
     * @param ccd - the specified card
     * @return the name of the Area which contains the card, or null
     **/
    public String getCardLocation(int cd)
    {
        
        return null;
    }
    
    /** Given the name of a area, returns the area id number
     * or -1 if area does not exist
     * @param name of area
     * @return id number of area
     */
    public int getAreaNumber(String ww)
    {
        
        return -1;
    }
                
    /**Returns a String representation of all the cards on specified area
     * @param area is the name of the area 
     * @return a String representation of all cards on specified area
     **/
    public String getAllCardsInOneArea(String area)
    {
       
        return "";
    } 

    /**Returns a String representation of all the cards in all areas including the name of each area
     * @return a String representation of all cards on specified area
     **/
    public String getAllCardsInAllAreas()
    {
       
        return "";
    }


    
    /**Returns true if a Card is allowed to move using the bridge, false otherwise
     * A move can be made if:  
     * the rating of the card  >= the rating of the destination area
     * AND the destination area is not full
     * AND the card has sufficient credits
     * AND the card is currently in the source area
     * AND the card id is for a card on the system
     * AND the bridge code is the code for a bridge on the system
     * @param trId is the id of the card requesting the move
     * @param brCode is the code of the bridge by which the card wants to move
     * @return true if the card is allowed on the bridge journey, false otherwise 
    **/
    public boolean canMove(int trId, String brCode)
    {   
        
            return false;

    }     

    /**Returns the result of a card requesting to move over a bridge.
     * A move will be successful if:  
     * the luxury rating of the card  >= the luxury rating of the destination area
     * AND the destination area is not full
     * AND the card has sufficient credits
     * AND the card is currently in the source area
     * AND the card id is for a card in the system
     * AND the bridge code is the code for a bridge on the system
     * If the bridge crossing can be made, the card information is removed from 
     * the source area, added to the destination area, card details updated and a suitable message returned.
     * a suitable message returned.
     * If bridge journey cannot be made, the state of the system remains unchanged
     * and a message specifying the reason is returned.
     * @param pCardId is the id of the card requesting the move
     * @param brCode is the code of the bridge by which the card wants to move
     * @return a String giving the result of the request 
     **/
    public String move(int pCardId, String brCode )
    {   //other checks optional
        
        return "";
    }     

    /** Allows a card to top up their credits.This method is not concerned with 
     *  the cost of a credit as currency and prices may vary between resorts.
     *  @param id the id of the card toping up their credits
     *  @param creds the number of credits purchased to be added to cards information
     */
    public void topUpCredits(int id, int creds)
    {
        
    }
    
    /** Allows a card to convert points to credits
     *  @param cdId the id of the card toping up their credits
     */
    public void convertPoints(int cdId)
    {
        
    }
    
    
   
    //***************private methods**************
    private void loadAreas()
    {
        areas.add(new Area(0, "Lobby", 0, 100));
        areas.add(new Area(1, "Concourese", 1, 100));
        areas.add(new Area(2, "Waterworld", 3, 10));
        areas.add(new Area(3, "WildWest", 5, 2));
        areas.add(new Area(4, "Solitaire", 1, 1));
        
    }
        
    
    private void setUpBridges()
    {
        
    }
    
    private void loadCards()
    {
       
    }
 
    /** Returns the card with the card id specified by the parameter
     * @return the card with the specified id
     **/
    private Card getCard(int id)
    {
        
        return null;
    }
    
    
    /** Returns the area with the name specified by the parameter
     * @return the area with the specified name
     **/
    private Area getArea(String areaName)
    {
        
        return null;
    }
    
    /** Returns the area with the name specified by the parameter
     * @return the area with the specified name
     **/
    private Bridge getBridge(String br)
    {
        
        return null;
    }
    
    
}
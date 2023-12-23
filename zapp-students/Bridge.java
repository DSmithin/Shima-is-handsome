 

  
/**
 * A bridge provides a one-way connection between two areas. It
 has a bridge code and information about both the source and
 the destination area
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge
{
    private Area source;
    private Area destination;
    private String code;
    
    public Bridge(Area from, Area to, String code)
    {
        source = from;
        destination = to;
        this.code = code;
    }
    
    public Area getSource()
    {
         return source;   
    }
    
    public void setSource(Area New)
    {
        source = New;
    }
    
    public Area getDest()
    {
         return destination;   
    }
    
    public void setDest(Area newDest)
    {
        destination = newDest;
    }
    
    public String getCode()
    {
         return code;   
    }
    
    public void setCode(String newCode)
    {
        code = newCode;
    }
    
    public boolean canMove(Card card)
    {
        if(card.getlux() < destination.getRating())
        {
            return false;
        }
        else if(destination.getCapacity()+1 > destination.getCapacity())
        {
            return false;
        }
        else if (card.enoughCredits())
        {
            return false;
        }
        else if(source.cardInArea(card))
        {
            return false;
        }
        else if(card == null)
        {
            return false;
        }
        else
        {
            return true;   
        }
    }
    
    public String move(Card card)
    {
        if(card.getlux() < destination.getRating())
        {
            return "Card cannot cross because the rating has a lower rating than destination";
        }
        else if(destination.getCapacity()+1 > destination.getCapacity())
        {
            return "Destination area is full";
        }
        else if (card.enoughCredits())
        {
            return "You do not have enough credits";
        }
        else if(source.cardInArea(card))
        {
            return "Card cannot cross";
        }
        else if(card == null)
        {
            return "Card does not exist";
        }
        else
        {
            card.crossed();
            destination.enter(card);
            source.leave(card);
            return "You have crossed successfully";
        }
    }
    
    public String toString()
    {
        String s = "";
        s = s + "\nThe bridge code is " + code;
        s = s + "\nThe bridge's source is " + source;
        s = s + "\nThe bridge's destination is " + destination;
        return s;
    }
}

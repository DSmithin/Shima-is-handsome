 

   
/**
 * A Card has an id number, name, a luxury rating, number of credits and points.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card {
    private int cardId;
    private String name;
    private int luxuryRating;
    private int credit;
    private int points;

    public Card(int cardId, String name, int luxuryRating, int credit, int points) {
        this.cardId = cardId;
        this.name = name;
        this.luxuryRating = luxuryRating;
        this.credit = credit;
        this.points = 0;
    }

    public int getCardId() {
        return cardId;
    }
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLuxuryRating () {
        return luxuryRating;
    }
    public void setLuxuryRating (int luxuryRating) {
        this.luxuryRating = luxuryRating;
    }

    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
     public void addCredit(int creditToAdd) {
        credit += creditToAdd;
    }
    public void deductCredit(int deductCredit) {
        credit -= deductCredit;
    }
    public boolean enoughCredits(){
        if (credit >= 4) {
            return true;
        }
        else {
            return false;
        }
    }
    public void useBridge() {
        if (enoughCredits()) {
            deductCredit(4);
        }
    }
    public void convertCreditToPoint() {
        int conversion = points * 3;
        addCredit(conversion);
    }
    public void convertPointToCredit(){
        int pointToCredit = credit / 3;
        setPoints(pointToCredit);
        credit %= 3;
    }
    
    public String toString() {
        return "ID nubmer: " + cardId + " \nName: " + name + "\nLuxury Rating: " + luxuryRating + " \nCredit: " + credit + " \nPoints: " + points;  
    }
}
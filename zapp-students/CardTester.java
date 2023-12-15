 

  
/**
 * Write a description of class CardTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    public static void main(String[] args)
    {
        Card card1 = new Card(1, "Peti", 2, 55, 60);
        Card card2 = new Card(5, "Nani?!", 5, 40, 10);

        card1.addCredit(3);
        card2.deductCredit(5);
        card1.useBridge();
        card2.addCredit(4);
        card2.convertCreditToPoint();

        System.out.println("\nUpdated Card Information:");
        System.out.println("Card 1:" + card1);
        System.out.println("Card 2:" + card2);
       
    }
        
    
}

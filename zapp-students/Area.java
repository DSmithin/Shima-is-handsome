import java.util.*;
/**
 * A Area is part of a ZAPP resort.Each area has a name,  a luxury rating
 * and a capacity which represents the maximum number of people(cards) who can be on the  
 * area at any one time. Each area must maintain a list of all people (cards)
 * currently on the area. These lists are updated whenever cards enter or leave 
 * an area,so that it is always possible to say how many people (cards) are in the area 
 * and who they are.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Area 
{
  private int areaNumber;
  private String name;
  private int luxuryRating;
  private int capacity;
  private List<Card> cards;
  
  public Area(int areaNumber, String name, int luxuryRating, int capacity) {
    this.areaNumber = areaNumber;
    this.name = name;
    this.luxuryRating = luxuryRating;
    this.capacity = capacity;
    this.cards = new ArrayList<>();
  }

  public int getAreaNumber() {
    return areaNumber;
  }

  public String getName() {
    return name;
  }

  public int luxuryRating() {
    return luxuryRating;
  }

  public int capacity() {
    return capacity;
  }
  
  public void enter(Card card) {
    if (cards.size() < capacity) {
      cards.add(card);
    }
  }

  public void leave(Card card) {
    cards.remove(card);
  }
  
  public boolean isFull() {
    return cards.size() >= capacity;
  }

  public void listCards() {
    for (Card card : cards) {
      System.out.println(card.toString());
    }
  }

  public Card findCard(int cardId) {
    for (Card card : cards) {
      if (card.getCardId() == cardId) {
        return card;
      }
    }
    return null;
  }

  public boolean containsCard(Card card) {
    return cards.contains(card);
  }

  public String toString() {
    return "Area{" + "areaNumber=" + areaNumber + ", name= " + name + '\'' + ", luxuryRating=" + luxuryRating + ", capacity=" + capacity + ", cards= " + cards + "}";
  }
}

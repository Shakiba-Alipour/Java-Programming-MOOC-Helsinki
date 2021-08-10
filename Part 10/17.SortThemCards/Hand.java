 
import java.util.ArrayList;
import java.util.Collections;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class Hand implements Comparable<Hand> {
 
    private ArrayList<Card> cards;
 
    public Hand() {
        this.cards = new ArrayList<>();
    }
 
    public ArrayList<Card> getCards() {
        return this.cards;
    }
 
    public void add(Card card) {
        this.cards.add(card);
    }
 
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
 
    public void sort() {
        Collections.sort(cards);
        print();
    }
 
    @Override
    public int compareTo(Hand hand) {
        int handCount = 0;
        int otherHandCount = 0;
        for (Card card : this.cards) {
            handCount += card.getValue();
        }
 
        for (Card card : hand.getCards()) {
            otherHandCount += card.getValue();
        }
 
        return handCount - otherHandCount;
    }
 
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
        print();
    }
}
 

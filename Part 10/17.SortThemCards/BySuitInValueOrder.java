 
import java.util.Comparator;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class BySuitInValueOrder implements Comparator<Card> {
 
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getSuit().ordinal() == o2.getSuit().ordinal()) {
            return o1.getValue() - o2.getValue();
        }
 
        return o1.getSuit().ordinal() - o2.getSuit().ordinal();
    }
 
}
 

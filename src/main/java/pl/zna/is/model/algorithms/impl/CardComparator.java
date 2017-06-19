package pl.zna.is.model.algorithms.impl;

import pl.zna.is.model.Card;

import java.util.Comparator;

/**
 * Created by zna on 2017-06-19.
 */
public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        if ( c1.getColour() == c2.getColour()) {
            return c1.getDenomination().compareTo( c2.getDenomination() );
        }
        return c1.getColour().compareTo(c2.getColour());
    }
}

package pl.zna.is.model;

import pl.zna.is.model.algorithms.impl.CardComparator;
import pl.zna.is.model.algorithms.impl.DefaultDrawer;
import pl.zna.is.model.algorithms.impl.DefaultMixer;
import pl.zna.is.model.algorithms.impl.DefaultSorter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zna on 2017-06-19.
 */
public class DeckFactory {
    public static Deck createStandardDeck() {
        List<Card> cards = new LinkedList();
        for ( Colour c : Colour.values()) {
            for (Denomination d : Denomination.values()) {
                cards.add( new Card(d,c));
            }
        }
        DeckImpl deck = new DeckImpl(cards, new DefaultSorter(new CardComparator()), new DefaultMixer(), new DefaultDrawer());
        deck.sort();
        return deck;
    }
}

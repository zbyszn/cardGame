package pl.zna.is.model;

import pl.zna.is.model.algorithms.Drawer;
import pl.zna.is.model.algorithms.Mixer;
import pl.zna.is.model.algorithms.Sorter;

import java.util.*;

/**
 * Created by zna on 2017-06-19.
 */
public class DeckImpl implements Deck {

    private List<Card> cards;
    private List<Card> drawns;
    private Sorter sorter;
    private Mixer mixer;
    private Drawer drawer;

    DeckImpl(List<Card> cards, Sorter sorter, Mixer mixer, Drawer drawer) {
        this.sorter = sorter;
        this.mixer = mixer;
        this.drawer = drawer;
        this.cards = new LinkedList<>();
        this.cards.addAll(cards);
        drawns = new LinkedList<>();
    }

    @Override
    public void sort() {
        reset();
        sorter.sort(cards);
    }

    @Override
    public void mix() {
        reset();
        mixer.mix(cards);
    }

    private void reset() {
        cards.addAll(drawns);
        drawns.clear();
    }

    @Override
    public Card draw() {
        Card drawn = drawer.draw(cards);
        drawns.add(drawn);
        return drawn ;
    }



}

package pl.zna.is.model;

import pl.zna.is.model.Card;

/**
 * Created by zna on 2017-06-19.
 */
public interface Deck {
    void sort();

    void mix();

    Card draw();
}

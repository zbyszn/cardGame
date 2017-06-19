package pl.zna.is.model.algorithms.impl;

import pl.zna.is.model.Card;
import pl.zna.is.model.algorithms.Drawer;

import java.util.List;

/**
 * Created by zna on 2017-06-19.
 */
public class DefaultDrawer implements Drawer {
    @Override
    public Card draw(List<Card> cards) {
        if ( cards.size() > 0 ) {
            Card drawn = cards.remove(cards.size());
            return drawn;
        }
        return null;
    }
}

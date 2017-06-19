package pl.zna.is.model.algorithms;

import pl.zna.is.model.Card;

import java.util.List;

/**
 * Created by zna on 2017-06-19.
 */
public interface Drawer {
    Card draw(List<Card> cards);
}

package pl.zna.is.model.algorithms.impl;

import pl.zna.is.model.Card;
import pl.zna.is.model.algorithms.Sorter;

import java.util.Comparator;
import java.util.List;

/**
 * Created by zna on 2017-06-19.
 */
public class DefaultSorter implements Sorter {
    private Comparator<? super Card> comparator;

    public DefaultSorter(Comparator<? super Card> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(List<Card> cards) {
        cards.sort(comparator);
    }
}

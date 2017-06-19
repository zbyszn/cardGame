package pl.zna.is.model.algorithms.impl;

import pl.zna.is.model.Card;
import pl.zna.is.model.algorithms.Mixer;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by zna on 2017-06-19.
 */
public class DefaultMixer implements Mixer{

    @Override
    public void mix(List<Card> cards) {
        Collections.shuffle(cards, new Random(System.nanoTime()));
    }
}

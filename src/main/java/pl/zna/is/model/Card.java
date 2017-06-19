package pl.zna.is.model;

/**
 * Created by zna on 2017-06-19.
 */
public final class Card {
    private final Denomination denomination;
    private final Colour colour;

    Card(Denomination denomination, Colour colour) {
        this.denomination = denomination;
        this.colour = colour;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public Colour getColour() {
        return colour;
    }


    @Override
    public boolean equals(Object obj) {
        if ( obj == null ||  ! (obj instanceof  Card) ) {
            return false;
        }
        Card card = (Card) obj;
        return card.getDenomination() == denomination && card.getColour() == colour;
    }
}

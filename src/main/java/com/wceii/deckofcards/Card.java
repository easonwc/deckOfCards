package com.wceii.deckofcards;

import com.wceii.deckofcards.enums.CardType;
import com.wceii.deckofcards.enums.Suit;
import java.util.Objects;

/**
 *
 * @author wceii
 */
public class Card {

    private final CardType type;
    private final Suit suit;

    public Card(final CardType cType, final Suit cSuit) {
        type = cType;
        suit = cSuit;
    }

    public CardType getType() {
        return type;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return type + " of " + suit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + Objects.hashCode(this.suit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.type != other.type) {
            return false;
        }
        if (this.suit != other.suit) {
            return false;
        }
        return true;
    }
}

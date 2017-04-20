package com.wceii.deckofcards;

import com.wceii.deckofcards.enums.CardType;
import com.wceii.deckofcards.enums.Suit;
import java.util.Objects;

/**
 *
 * @author wceii
 */
public class Card {

    /**
     * The card type.
     */
    private final CardType type;
    /**
     * The card suit.
     */
    private final Suit suit;
    /**
     * Hash value.
     */
    private static final int HASH1 = 7;
    /**
     * Hash value.
     */
    private static final int HASH2 = 67;

    /**
     * Constructor.
     *
     * @param cType The card type enumeration value.
     * @param cSuit The card suit enumeration value.
     */
    public Card(final CardType cType, final Suit cSuit) {
        type = cType;
        suit = cSuit;
    }

    /**
     * Getter for the card type.
     *
     * @return The card type as an enumeration value.
     */
    public final CardType getType() {
        return type;
    }

    /**
     * Getter for the card suit.
     *
     * @return The suit as an enumeration value.
     */
    public final Suit getSuit() {
        return suit;
    }

    @Override
    public final String toString() {
        return type + " of " + suit;
    }

    @Override
    public final int hashCode() {
        int hash = HASH1;
        hash = HASH2 * hash + Objects.hashCode(this.type);
        hash = HASH2 * hash + Objects.hashCode(this.suit);
        return hash;
    }

    @Override
    public final boolean equals(final Object obj) {
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
        return this.suit == other.suit;
    }
}

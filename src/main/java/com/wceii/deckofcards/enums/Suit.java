package com.wceii.deckofcards.enums;

/**
 *
 * @author wceii
 */
public enum Suit {

    /**
     * The suit of Hearts
     */
    HEARTS,
    /**
     * The suit of Spades
     */
    SPADES,
    /**
     * The suit of Clubs
     */
    CLUBS,
    /**
     * The suit of Diamonds
     */
    DIAMONDS;

    @Override
    public String toString() {
        switch (this) {
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            case CLUBS:
                return "Clubs";
            case DIAMONDS:
                return "Diamonds";
            default:
                return "unknown";
        }
    }
}

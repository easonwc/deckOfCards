package com.wceii.deckofcards.enums;

/**
 *
 * @author wceii
 */
public enum Suit {
    HEARTS, SPADES, CLUBS, DIAMONDS;

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

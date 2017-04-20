package com.wceii.deckofcards.enums;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wceii
 */
public enum CardType {

    /**
     * The Ace card type.
     */
    ACE,
    /**
     * The Two card type.
     */
    TWO,
    /**
     * The Three card type.
     */
    THREE,
    /**
     * The Four card type.
     */
    FOUR,
    /**
     * The Five card type.
     */
    FIVE,
    /**
     * The Six card type.
     */
    SIX,
    /**
     * The Seven card type.
     */
    SEVEN,
    /**
     * The Eight card type.
     */
    EIGHT,
    /**
     * The Nine card type.
     */
    NINE,
    /**
     * The Ten card type.
     */
    TEN,
    /**
     * The Jack card type.
     */
    JACK,
    /**
     * The Queen card type.
     */
    QUEEN,
    /**
     * The King card type.
     */
    KING;

    @Override
    public String toString() {
        switch (this) {
            case ACE:
                return "Ace";
            case TWO:
                return "Two";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return "unknown";
        }
    }

    /**
     * This method will get a set of numeric values for a card type.
     *
     * @return The set of integer values. Currently the only card type that
     * returns multiple values is the Ace.
     */
    public final Set<Integer> getValues() {

        final Set<Integer> values = new HashSet<>();

        switch (this) {
            case ACE:
                values.add(1);
                values.add(14);
                break;
            case TWO:
                values.add(2);
                break;
            case THREE:
                values.add(3);
                break;
            case FOUR:
                values.add(4);
                break;
            case FIVE:
                values.add(5);
                break;
            case SIX:
                values.add(6);
                break;
            case SEVEN:
                values.add(7);
                break;
            case EIGHT:
                values.add(8);
                break;
            case NINE:
                values.add(9);
                break;
            case TEN:
                values.add(10);
                break;
            case JACK:
                values.add(11);
                break;
            case QUEEN:
                values.add(12);
                break;
            case KING:
                values.add(13);
                break;
            default:
                break;
        }

        return values;
    }
}

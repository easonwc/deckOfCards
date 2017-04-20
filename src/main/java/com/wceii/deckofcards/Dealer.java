package com.wceii.deckofcards;

import com.wceii.deckofcards.enums.CardType;
import com.wceii.deckofcards.enums.Suit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author wceii
 */
public class Dealer {

    /**
     * Internal random number generator.
     */
    private final Random random = new Random();

    /**
     * Empty constructor.
     */
    public Dealer() {
    }

    /**
     * This method creates a single deck of 52 cards.
     *
     * @return A list of cards.
     */
    public List<Card> createSingleDeck() {
        final List<Card> deckOfCards = new ArrayList<>();
        for (Suit tmpSuit : Suit.values()) {
            for (CardType tmpType : CardType.values()) {
                final Card tmpCard = new Card(tmpType, tmpSuit);
                deckOfCards.add(tmpCard);
            }
        }

        return deckOfCards;
    }

    /**
     * This method shuffles a list of cards.
     *
     * @param cardsToShuffle The list of cards to shuffle.
     */
    public void shuffleDeck(final List<Card> cardsToShuffle) {
        final int numTimes = random.nextInt(1000);
        for (int i = 0; i < numTimes; i++) {
            final int pos1 = random.nextInt(cardsToShuffle.size());
            final int pos2 = random.nextInt(cardsToShuffle.size());
            if (pos1 != pos2) {
                //swap cards
                final Card card1 = cardsToShuffle.get(pos1);
                cardsToShuffle.set(pos1, cardsToShuffle.get(pos2));
                cardsToShuffle.set(pos2, card1);
            }
        }
    }

    /**
     * This method deals one card from the deck of cards.
     *
     * @param deckOfCards The list of cards to choose a card from.
     *
     * @return The card dealt.  The original list of cards will no longer
     * contain the dealt card.
     */
    public Card dealOneCard(final List<Card> deckOfCards) {
        if (deckOfCards != null && !deckOfCards.isEmpty()) {
            return dealOneRandomCard(deckOfCards);
        } else {
            return null;
        }
    }

    public Card dealOneRandomCard(final List<Card> deckOfCards) {
        if (deckOfCards != null && !deckOfCards.isEmpty()) {
            final int pos = random.nextInt(deckOfCards.size());
            final Card cardRemoved = deckOfCards.remove(pos);
            return cardRemoved;
        } else {
            return null;
        }
    }

    public Card dealTopCard(final List<Card> deckOfCards) {
        if (deckOfCards != null && !deckOfCards.isEmpty()) {
            final Card cardRemoved = deckOfCards.remove(0);
            return cardRemoved;
        } else {
            return null;
        }
    }

    public Card dealBottomCard(final List<Card> deckOfCards) {
        if (deckOfCards != null && !deckOfCards.isEmpty()) {
            final Card cardRemoved = deckOfCards.remove(deckOfCards.size() - 1);
            return cardRemoved;
        } else {
            return null;
        }
    }
}

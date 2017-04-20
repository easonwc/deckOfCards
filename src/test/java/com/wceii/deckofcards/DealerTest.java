package com.wceii.deckofcards;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wceii
 */
public class DealerTest {

    public DealerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createSingleDeck method, of class Dealer.
     */
    @Test
    public void testCreateSingleDeck() {
        System.out.println("createSingleDeck");
        Dealer instance = new Dealer();
        List<Card> result = instance.createSingleDeck();
        assertNotNull(result);
        assertTrue(!result.isEmpty());
        assertEquals(result.size(), 52);

        for (int i = 0; i < 1000; i++) {
            instance.shuffleDeck(result);
            assertNotNull(result);
            assertTrue(!result.isEmpty());
            assertEquals(result.size(), 52);
        }

        final Set<Card> cardsDealt = new HashSet<>();
        for (int j = 0; j < 100; j++) {
            final Card card1 = instance.dealOneCard(result);
            System.out.println("Card Dealt: " + card1);
            if (card1 != null) {
                assertNotNull(result);
                assertEquals(result.size(), 52 - (j + 1));
                cardsDealt.add(card1);
            } else {
                assertNotNull(result);
                assertTrue(result.isEmpty());
            }
        }

        assertTrue(!cardsDealt.isEmpty());
        assertEquals(cardsDealt.size(), 52);
    }

}

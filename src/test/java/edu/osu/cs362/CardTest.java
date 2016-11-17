//Jared Hughes CS362 Card Test Suite
//Assignment 2
//
package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CardTest {

    @Test
    public void testgetValue() {
		//test constructor of card object
		Card c = new Card(Card.Face.FIVE, Card.Suit.SPADE);
		assertEquals("FIVESPADE", c.toString());
	}

    @Test
    public void testEquals() {
		//testing the boolean equals function
		Card card1 = new Card(Card.Face.SIX, Card.Suit.SPADE);
		Card card2 = new Card(Card.Face.SEVEN, Card.Suit.DIAMOND);
		boolean value = card1.equals(card2);
		assertFalse(value);
	
	}
    @Test
    public void testProtodeck() {
		//test the new deck and protodeck
		//compare the expected first card in a new deck
		ArrayList<Card> deck1 = Card.newDeck();
		Card card1 = new Card(Card.Face.TWO, Card.Suit.CLUB);
		Card card2;
		card2 = deck1.get(0);
		assertEquals(card1.toString(), card2.toString());
	}
}

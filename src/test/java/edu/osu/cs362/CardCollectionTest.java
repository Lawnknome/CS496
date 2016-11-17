// Jared Hughes CS362 Card Collection Test Suite
// Assignment 2
//
package edu.osu.cs362;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CardCollectionTest{

    @Test
    public void collectionTest(){

	//test initialization of card collection, initialization of multiple cards in one collection
	CardCollection collect = new CardCollection(new Card(Card.Face.ACE, Card.Suit.CLUB), new Card(Card.Face.TEN, Card.Suit.DIAMOND), new Card(Card.Face.EIGHT, Card.Suit.HEART), new Card(Card.Face.FIVE, Card.Suit.SPADE));

	//place cards in a list and then set variables == each card to test creation and validity of creation
	List<Card> cardList = collect.getCards();

	Card c1 = cardList.get(0);
	Card c2 = cardList.get(1);
	Card c3 = cardList.get(2);
	Card c4 = cardList.get(3);

	assertEquals("ACECLUB", c1.toString());
	assertEquals("TENDIAMOND", c2.toString());
	assertEquals("EIGHTHEART", c3.toString());
	assertEquals("FIVESPADE", c4.toString());
	}

    @Test
    public void addAllTest() {
	
	//setting up new decks of cards to test adding all to a collection
	ArrayList<Card> cardDeck1 = Card.newDeck();
	ArrayList<Card> cardDeck2 = Card.newDeck();

	CardCollection collect = new CardCollection();
	collect.add(cardDeck1);

	//will add cards from the new collection back to a List
	//to test the specific order of known cards
	
	List<Card> cardList = collect.getCards();
	//first card should be the two of clubs if added correctly
	//from the protodek
	Card c1 = cardList.get(0);
	//should be ace of spades as last card in the deck
	Card c52 = cardList.get(51);

	//should be the two card of each suit
	Card c14 = cardList.get(13);
	Card c27 = cardList.get(26);
	Card c40 = cardList.get(39);

	assertEquals("TWOCLUB", c1.toString());
	assertEquals("ACESPADE", c52.toString());
	assertEquals("TWODIAMOND", c14.toString());
	assertEquals("TWOHEART", c27.toString());
	assertEquals("TWOSPADE", c40.toString());


	//loop will compare this list with an unaltered list from the 
	//protodeck to verify all card gets and addAll did not alter
	//the ordering or card numbering in any way.
	for(int i = 0; i < cardDeck2.size(); i++) {

		Card tempCard1 = cardList.get(i);
		Card tempCard2 = cardDeck2.get(i);
		assertEquals(tempCard1.toString(), tempCard2.toString());
	}
    }

    // will test the discardCard function.  Discard a card from the
    // beginning of the listed colleciton
    @Test
    public void discardTest () {

	//Create deck of cards with standard ordering from protodeck
	ArrayList<Card> deck1 = Card.newDeck();
	CardCollection col = new CardCollection();
	col.add(deck1);

	//fill list, assign a known card from the top of the deck to remove
	List<Card> cardList = col.getCards();
	Card card1 = cardList.get(0);
	
	Card cardReturn = col.discardCard(0);
	//Card returned from discard should be the same as card 1
	//before anything was discarded
	assertEquals(card1.toString(), cardReturn.toString());

	
   }
}

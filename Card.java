import java.security.SecureRandom;

public class Card {

    private final String face;

    private final String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " " + "of" + " " + suit;
    }

    public static class deckOfCards {

        private int currentCard;

        private Card[] deck;

        private static final int NUMBER_OF_CARDS = 52;

        private static final SecureRandom randomNumbers = new SecureRandom();

        public deckOfCards() {
            String[] faces = {
                "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
            };

            String[] suits = {
                "Hearts", "Diamonds", "Clubs", "Spades"
            };
            deck = new Card[NUMBER_OF_CARDS];
            currentCard = 0;
            for (int count = 0; count < deck.length; count++) {
                deck[count] = new Card(faces[count % 13], suits[count / 13]);
            }
        }

        public void shuffle() {
            currentCard = 0;
            for (int first = 0; first < deck.length; first++) {
                int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
                Card temp = deck[first];
                deck[first] = deck[second];
                deck[second] = temp;
            }
        }

        public Card getCard() {
            if (currentCard < deck.length) {
                return deck[currentCard++];
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        deckOfCards choice = new deckOfCards();
        choice.shuffle();
        for (int i = 0; i < 52; i++) {
            System.out.printf("%19s", choice.getCard());

            if (i % 2 != 0) {
                System.out.println();
            }
        }

    }
}
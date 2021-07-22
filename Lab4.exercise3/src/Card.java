import java.util.Random;

public class Card {

	static final String[] SUITS = { "Diamonds", "Hearts", "Spades", "Clubs" };
	static final String[] FACE_VALUES = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	private int suitIndex = 0;
	private int faceValueIndex = 0;

	public Card() {
		Random rand = new Random();

		this.suitIndex = rand.nextInt(SUITS.length);
		this.faceValueIndex = rand.nextInt(FACE_VALUES.length);
	}

	public String toString() {
		return FACE_VALUES[faceValueIndex] + " of " + SUITS[suitIndex];
	}

	public static void main(String[] args) {

		System.out.println("Your five random cards are: ");
		
		for (int i = 0; i < 5; i++) {
			Card card = new Card();
			System.out.println(card.toString());
		}

	}
}

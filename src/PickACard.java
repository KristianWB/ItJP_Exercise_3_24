import java.util.Random;

public class PickACard {
    public static void main(String[] args)   {
        Random randomEngine = new Random();

        int randomRank = randomEngine.nextInt(13);
        int randomSuit = randomEngine.nextInt(4);

        String suit = "none";
        String rank = "none";

        switch (randomSuit)   {
            case 0: suit = "Hearts";
            break;
            case 1: suit = "Diamonds";
            break;
            case 2: suit = "Clover";
            break;
            case 3: suit = "Spades";
            break;
        }

        switch (randomRank)   {
            case 0: rank = "Ace";
            break;
            case 1: rank = "Two";
            break;
            case 2: rank = "Three";
            break;
            case 3: rank = "Four";
            break;
            case 4: rank = "Five";
            break;
            case 5: rank = "Six";
            break;
            case 6: rank = "Seven";
            break;
            case 7: rank = "Eight";
            break;
            case 8: rank = "Nine";
            break;
            case 9: rank = "Ten";
            break;
            case 10: rank = "Jack";
            break;
            case 11: rank = "Queen";
            break;
            case 12: rank = "King";
            break;
        }

        System.out.print(
                "The card you picked is " + rank + " of " + suit
        );

    }
}

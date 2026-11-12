
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CardDatabase {

    public static ArrayList<Card> loadCards(String fileName)
            throws IOException {

        ArrayList<Card> cards = new ArrayList<Card>();

        BufferedReader reader = new BufferedReader(
                new FileReader("cards_all.csv"));

        reader.readLine(); // Skip CSV header

        String line;

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue;
            }

            String[] data = line.split(",");

            Card card = new Card(
                data[0].trim(),                    // Name
                Integer.parseInt(data[1].trim()), // Level
                Integer.parseInt(data[2].trim()), // Up
                Integer.parseInt(data[3].trim()), // Right
                Integer.parseInt(data[4].trim()), // Down
                Integer.parseInt(data[5].trim()), // Left
                data[6].trim()                     // Element
            );

            cards.add(card);
        }

        reader.close();
        return cards;
    }

    public static Card findByName(
            ArrayList<Card> cards, String name) {

        for (Card card : cards) {
            if (card.getName().equalsIgnoreCase(name)) {
                return card;
            }
        }

        return null;
    }
}

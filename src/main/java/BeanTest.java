import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album Blonde = new Album("Frank Ocean", "Blonde", 2016, 15, "R&B");
        Authors hDT = new Authors(1, "Henry David", "Thoreau");
        Quotes newQuote = new Quotes(1, "Go confidently", hDT);


        System.out.println(newQuote.getContent());
        System.out.println(newQuote.getAuthor());
       // System.out.println(new Quotes(6, "To be or not to be", "William Shakespeare" ));
        System.out.println(Blonde.getArtist());

        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(newQuote);
        quotes.add(new Quotes(1, "To be or not to be", new Authors(2, "William", "Shakespeare")));
        quotes.add(new Quotes(3, "Success usually comes to those who are too busy to be looking for it", hDT));

        for(Quotes quote : quotes) {
            System.out.println("Heres a quote!");
            System.out.printf("%s%n   - %s %s%n", quote.getContent(), quote.getAuthor().getFirstName(), quote.getAuthor().getLastName());
        }
    }
}

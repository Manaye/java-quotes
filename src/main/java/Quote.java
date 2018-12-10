import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Quote {

    public String[] tags;
    public String author;
    public String likes;
    public String text;
    public String body;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthors() {
        return author;
    }

    public String getLikes() {

        return likes;
    }

    public String getText() {
        return text;
    }

    public String getBody() {
        return body;
    }

    public void saveQuote(ArrayList<Quote> quotes) {
        Gson gson = new Gson();
        quotes.add(this);
        if (!quotes.contains(this)) {
            try {
                FileWriter jsonQuotes = new FileWriter("recentquotes.JSON");
                jsonQuotes.write(gson.toJson(quotes));
                jsonQuotes.close();

            } catch (IOException e) {
                System.out.println("something went wrong while trying the quote");
                System.out.println(e);
            }
        }


    }
    public String toString () {
        return text + " /" + author;

    }

}
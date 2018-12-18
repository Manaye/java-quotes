import java.io.*;
import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        BufferedReader in = null;


        try {
            URL url = new URL("https://favqs.com/api/qotd");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));


            String inputLine;
            String output = "";
            while ((inputLine = in.readLine()) != null) {
                Gson gson = new Gson();
                Quote q = gson.fromJson(inputLine,Quote.class);
               System.out.println(inputLine);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}





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
            while ((inputLine = in.readLine()) != null) {

                System.out.println(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    }





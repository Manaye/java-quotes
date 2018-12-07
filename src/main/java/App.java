import java.util.Arrays;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
               Gson gson = new Gson();
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader("recentquotes.JSON"));
                    Quote[] quotes  = gson.fromJson(br, Quote[].class);
                    int rand = (int)(Math.random()*(quotes.length-1));
                    System.out.println(quotes[rand].getAuthors() + ": ====> " + quotes[rand].getText() + " ***** " + quotes[rand].getLikes());

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                finally {
                    if(br != null){
                        try{
                            br.close();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }



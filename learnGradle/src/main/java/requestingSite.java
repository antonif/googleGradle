import java.net.HttpURLConnection;
import java.net.URL;

public class requestingSite {
    URL url = new URL("http://google.com");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
}

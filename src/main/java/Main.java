import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;

public class Main {
    HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
    HttpRequest request = requestFactory.buildGetRequest()

    public Main() throws IOException {
    }
}

package felix.webgetter;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class SimpleRequest {
    public static void simpleRequestToGithub() throws IOException {
        //making simple request
        HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
        HttpRequest request = requestFactory.buildGetRequest(new GenericUrl("https://google.com"));
        HttpResponse rawResponse = request.execute();
        System.out.println(rawResponse.parseAsString());
        System.out.println(rawResponse.getHeaders());
    }
}

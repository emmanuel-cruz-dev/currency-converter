import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private String API_BASE_URL;
    private HttpClient client;
    private Coins coin;

    // Constructor que recibe los parámetros
    public ApiService(String arg1, String arg2, double amount) throws IOException, InterruptedException {
        this.API_BASE_URL = "https://v6.exchangerate-api.com/v6/771cc165b905af3683c4d984/pair/" + arg1 + "/" + arg2 + "/" + amount;
        this.client = HttpClient.newHttpClient();

        // Realizar la petición HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_BASE_URL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        this.coin = gson.fromJson(json, Coins.class);
    }

    public Coins getCoin() {
        return coin;
    }
}
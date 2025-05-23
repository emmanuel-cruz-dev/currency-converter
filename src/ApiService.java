import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private final Coins coin;

    public ApiService(String arg1, String arg2, double amount) throws IOException, InterruptedException {
        String apiBaseUrl = "https://v6.exchangerate-api.com/v6/771cc165b905af3683c4d984/pair/" + arg1 + "/" + arg2 + "/" + amount;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiBaseUrl))
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
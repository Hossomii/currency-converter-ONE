package services;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private static final String API_KEY = System.getenv("EXCHANGE_API_KEY");

    private final Gson gson = new Gson();

    public double convert (String from, String to, double amount) {

        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + from;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double rate = rates.get(to).getAsDouble();

            return amount * rate;
        } catch (Exception e) {
            System.out.println("Erro ao converter moedas: " + e.getMessage());
            System.out.println(System.getenv("EXCHANGE_API_KEY"));
            return 0.0;
        }
    }
}

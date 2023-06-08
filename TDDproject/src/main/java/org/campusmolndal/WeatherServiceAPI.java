package org.campusmolndal;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherServiceAPI {

    String apiKey = "";
    String apiBase = "";

    public void weatherServiceAPI(String apiKey) {
        this.apiKey = apiKey;
        apiBase = "http://api.openweathermap.org/data/2.5/weather?q=";
    }

    private JSONObject getWeather(String city) throws IOException {
        URL url = new URL(city);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine + "\n");
        }
        in.close();
        return new JSONObject(response.toString());
    }
}
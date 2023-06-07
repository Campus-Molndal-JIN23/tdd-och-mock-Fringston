import java.io.IOException;

public class WeatherServiceAPI{
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_URL = "https://api.weatherapi.com/v1/current.json?q=";

    public String getWeatherData(String location) throws IOException {
        String apiUrl = API_URL + location + "&key=" + API_KEY;
        // Resten av koden för att anropa API:et och returnera väderdata
        return null;
    }
}


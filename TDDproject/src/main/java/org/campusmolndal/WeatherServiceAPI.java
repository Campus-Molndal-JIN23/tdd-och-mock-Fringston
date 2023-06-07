package org.campusmolndal;

import java.sql.Connection;
import java.util.Random;

public class WeatherServiceAPI {
    private static final String[] WEATHER_CONDITIONS = {
                "Sunny", "Cloudy", "Rainy", "Windy", "Snowy"};

    public String getWeather(String location) {
        // Simulera anrop till API och hämta väderinformation
        String weather = fetchWeatherFromAPI(location);

        // Om mockningen av API:et misslyckades, använd en slumpmässig väderinformation
        if (weather == null) {
                weather = getRandomWeatherCondition();
        }

        return weather;
        }

        private String fetchWeatherFromAPI(String location) {
        // Simulera anrop till verkligt API - I detta fall mockar vi bara anropet genom att returnera nullreturn null;
        return null;
    }

        private String getRandomWeatherCondition() {
            Random random = new Random();
            int index = random.nextInt(WEATHER_CONDITIONS.length);
            return WEATHER_CONDITIONS[index];
        }
}


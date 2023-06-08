package org.campusmolndal;
import java.sql.Connection;
import org.mockito.Mockito;
public class WeatherService {
    WeatherServiceAPI weatherServiceAPI;

    public WeatherService(WeatherServiceAPI weatherServiceAPI) {
        this.weatherServiceAPI = weatherServiceAPI;
    }

    public String getWeather(String city) {
        return weatherServiceAPI.getWeather(city).getString("weather");
    }

    public String getTemperature(String city) {
        return weatherServiceAPI.getWeather(city).getString("temperature");
    }
    public String getWind(String city) {
        return weatherServiceAPI.getWeather(city).getString("wind");
    }
    
}

package org.campusmolndal;
import java.sql.Connection;
import org.mockito.Mockito;
public class WeatherService {
    public WeatherService() {

        WeatherServiceAPI weatherMock = Mockito.mock(WeatherServiceAPI.class);
    }
    public String getWeather(String city) {
        return "Sunny";
    }
}

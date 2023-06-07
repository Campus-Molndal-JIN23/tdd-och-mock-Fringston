package org.campusmolndal;
import java.sql.Connection;
import static org.mockito.Mockito.*;
public class WeatherService {

    public WeatherService() {
        WeatherServiceAPI weatherMock = mock(WeatherServiceAPI.class);
    }
public String getWeather(String city) {
        return "Sunny";
    }
}

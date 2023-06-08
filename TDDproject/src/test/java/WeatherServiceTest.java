import org.campusmolndal.WeatherService;
import org.campusmolndal.WeatherServiceAPI;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherServiceTest {

    //Skapar en instans av WeatherServiceAPI.
    WeatherServiceAPI weatherServiceAPI;

    //Gör en BeforeEach som körs innan varje test.
    @BeforeEach
    void setUp() {
        //Här skapas en mock av WeatherServiceAPI som returnerar en JSONObject med väderdata.
        weatherServiceAPI = mock(WeatherServiceAPI.class);
        //När getWeather anropas med "Stockholm" så ska den returnera en JSONObject med väderdatan "Sunny".
        when(weatherServiceAPI.getWeather("Stockholm")).thenReturn(new JSONObject("{\"weather\": \"Sunny\"}"));
        //När getWeather anropas med "Göteborg" så ska den returnera en JSONObject med väderdatan "Hot".
        when(weatherServiceAPI.getWeather("Göteborg")).thenReturn(new JSONObject("{\"temperature\": \"Hot\"}"));
        //När getWeather anropas med "Malmö" så ska den returnera en JSONObject med väderdatan "Windy".
        when(weatherServiceAPI.getWeather("Malmö")).thenReturn(new JSONObject("{\"wind\": \"Windy\"}"));
    }

    //Testar om getWeather returnerar "Sunny", vi förväntar oss att det ska vara sant.
    @Test
    void testGetWeather() {
        //Arrange
        WeatherService weatherService = new WeatherService(weatherServiceAPI);
        String expected = "Sunny";
        //Act
        String result = weatherService.getWeather("Stockholm");
        //Assert
        assertEquals(expected, result);
    }

    //Testar om getTemperature returnerar "Cold". Vi förväntar oss att NotEquals ska vara sant.
    @Test
    void testGetTemperature() {
        //Arrange
        WeatherService weatherService = new WeatherService(weatherServiceAPI);
        String expected = "Cold";
        //Act
        String result = weatherService.getTemperature("Göteborg");
        //Assert
        assertNotEquals(expected, result);
    }

    //Testar om getWind returnerar "Windy". Vi förväntar oss att NotNull ska vara sant.
    @Test
    void testGetWind() {
        //Arrange
        WeatherService weatherService = new WeatherService(weatherServiceAPI);
        String expected = "Windy";
        //Act
        String result = weatherService.getWind("Malmö");
        //Assert
        assertNotNull(expected, result);
    }
}

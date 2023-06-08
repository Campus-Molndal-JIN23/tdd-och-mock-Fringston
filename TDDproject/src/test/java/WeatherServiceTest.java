import org.campusmolndal.WeatherService;
import org.campusmolndal.WeatherServiceAPI;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherServiceTest {

    WeatherServiceAPI weatherServiceAPI;
    @BeforeEach
    void setUp() {
        weatherServiceAPI = mock(WeatherServiceAPI.class);
        // Ifall du vill slippa krångla med \" använd new JSONObject(Map.of("weather", "Sunny"));
        when(weatherServiceAPI.getWeather("Stockholm")).thenReturn(new JSONObject("{\"weather\": \"Sunny\"}"));
    }

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
}

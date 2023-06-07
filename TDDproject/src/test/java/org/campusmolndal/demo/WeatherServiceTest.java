package org.campusmolndal.demo;

import org.campusmolndal.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherServiceTest {

    @BeforeEach
    void setUp() {
        WeatherService weatherService = new WeatherService();
    }


    @Test
    void testGetWeather() {
        //Arrange
        WeatherService weatherService = new WeatherService();
        String expected = "Sunny";
        //Act
        String result = weatherService.getWeather("Stockholm");
        //Assert
        assertEquals(expected, result);
    }
}

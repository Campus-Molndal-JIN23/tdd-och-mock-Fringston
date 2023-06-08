# Project: tdd och mock

## Description

This project is a weather app which uses an API to get the weather for a specific city. The app is built using TDD and Mockito. 
This means that the tests I've done are written before the code. The tests are written to test the methods in the WeatherService class.

Since the tests are using Mockito, the tests are not testing the actual API, but a mock of the API. This means that the tests are not dependent on the API, and the tests will work even if the API is down.

The app is built using Java and JUnit 5.

## Dependencies

#### Junit
org.junit.jupiter

#### Mockito
org.mockito mockito-core 5.3.1

#### Json
org.json 20230227


## Installation

* 1- Install Git on your computer
* 2- Find and clone the repository from GitHub
* 3- Install the required dependencies or libraries.
* 4- Run the test class within the project.

## License
#### MIT License


# Tests

### Skapad av:
Fredrik Rinstad 2023-06-08

### Syfte:
Säkerställa att metoderna som finns i klassen WeatherService fungerar som de ska.

## Tester:

| Test ID | Beskrivning                                  | Förväntat resultat | Verkligt resultat | Status   | Kommentar                  |
|---------|----------------------------------------------|--------------------|-------------------|----------|----------------------------|
| 1       | testGetWeather                               | Att assertEqual = true  | assertEqual = true | Godkänd  | Inga problem identifierade |
| 2       | testGetTemperature                           | Att assertNotEqual = true | assertNotEqual = true | Godkänd  | Inga problem identifierade |
| 3       | testGetWind                                  | Att assertNotNull = true | assertNotNull = true | Godkänd  | Inga problem identifierade |

## Slutsats
Alla tester gick igenom utan problem. Inga problem identifierades. 
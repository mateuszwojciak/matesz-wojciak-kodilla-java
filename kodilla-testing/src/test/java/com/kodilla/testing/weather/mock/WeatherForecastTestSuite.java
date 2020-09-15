package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    private static int testCounter = 0;
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Mock
    private Temperatures averageTemperaturesMock;
    @Test
    void testAverageTemperatureWithMock(){
        //Given
        Map<String, Double> averageTemperaturesMap = new HashMap<>();
        averageTemperaturesMap.put("Rzeszow", 10.0);
        averageTemperaturesMap.put("Krakow", 20.0);
        averageTemperaturesMap.put("Wroclaw", 20.0);
        averageTemperaturesMap.put("Warszawa", 10.0);
        averageTemperaturesMap.put("Gdansk", 15.0);
        when(temperaturesMock.getTemperatures()).thenReturn(averageTemperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double quantityOfSensors = weatherForecast.calculateForecast().size();
        double sum = 0;
        for (double i : averageTemperaturesMap.values()){
            sum += i;
        }
        double average = sum / quantityOfSensors;

        //Then
        Assertions.assertEquals(15, average);
    }

    @Mock
    private Temperatures medianTemperaturesMock;
    @Test
    void testMedianTemperatureWithMock(){
        //Given
        Map<String, Double> medianTemperaturesMap = new HashMap<>();
        medianTemperaturesMap.put("Rzeszow", 10.0);
        medianTemperaturesMap.put("Krakow", 20.0);
        medianTemperaturesMap.put("Wroclaw", 20.0);
        medianTemperaturesMap.put("Warszawa", 10.0);
        medianTemperaturesMap.put("Gdansk", 15.0);
        when(temperaturesMock.getTemperatures()).thenReturn(medianTemperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double quantityOfSensors = weatherForecast.calculateForecast().size();
        double maxValueInMap = (Collections.max(medianTemperaturesMap.values()));
        double minValueinMap = (Collections.min(medianTemperaturesMap.values()));

        double median = (maxValueInMap + minValueinMap) / 2;

        //Then
        System.out.println("max: " + maxValueInMap);
        System.out.println("min: " + minValueinMap);
        Assertions.assertEquals(15, median);
    }
}
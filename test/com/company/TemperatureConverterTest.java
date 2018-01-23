package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void fahrenheitTocelsius() {
    String startUnit = "F";
    String newUnit = "C";
    TemperatureConverter converter = new TemperatureConverter(startUnit, newUnit);
    assertEquals(0.0, converter.converter(32));

    }

    @Test
    void fahrenheitTokelvin() {
        TemperatureConverter converter = new TemperatureConverter("F", "K");
        assertEquals(273.15, converter.converter(32));
    }
    @Test
    void celsiusTofahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("C", "F");
        assertEquals(32, converter.converter(0));
    }
    @Test
    void celsiusTokelvin() {
        TemperatureConverter converter = new TemperatureConverter("C", "K");
        assertEquals(273.15, converter.converter(0));
    }

    @Test
    void kelvinTofahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("K", "F");
        assertEquals(32.0, converter.converter(273.15));
    }

    @Test
    void kelvinTocelsius() {
        TemperatureConverter converter = new TemperatureConverter("K", "C");
        assertEquals(0.0, converter.converter(273.15));
    }

    @Test
    void fahrenheitTofahrenheit() {
        TemperatureConverter converter = new TemperatureConverter("F", "F");
        assertEquals(32, converter.converter(32));
    }
}
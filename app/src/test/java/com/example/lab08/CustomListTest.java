package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city1 = new City("Calgary", "AB");
        list.addCity(city1);
        assertEquals(1, list.countCities());
        City city2 = new City("Vancouver", "BC");
        City city3 = new City("Iqaluit", "NU");
        list.addCity(city2);
        list.addCity(city3);
        assertEquals(3, list.countCities());
        list.deleteCity(city1);
        assertEquals(2, list.countCities());
        list.deleteCity(city2);
        list.deleteCity(city3);
        assertEquals(0, list.countCities());
    }
}

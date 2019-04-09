package com.epam.training.labTask1.services;

import com.epam.training.labTask1.domain.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SaladServiceTest {

    private SaladService saladService;
    private Salad salad;
    private Tomato tomato;
    private Onion onion;
    private Cucumber cucumber;
    private Vegitable[] vegitables;

    @Before
    public void setUp() {
        saladService = new SaladService();
        tomato = new Tomato(100, 6, 3,7,8);
        onion = new Onion(300, 1,4,6,9);
        cucumber = new Cucumber(200,2,5,6,9);
        vegitables = new Vegitable[]{tomato, onion, cucumber};
        salad = new Salad(vegitables);
    }

    @Test
    public void calCaloriesSuccess() {
        double calories = saladService.calCalories(salad);
        assertEquals(100 * 6 / 100 + 300 * 1 / 100 + 200 * 2 / 100, calories, 0);
    }

    @Test
    public void sortWeigthSuccess() {
        saladService.sortWeigth(salad);
        assertEquals(tomato, vegitables[0]);
        assertEquals(cucumber, vegitables[1]);
        assertEquals(onion, vegitables[2]);
    }

    @Test
    public void findCaloriesSuccess() {
        List<Vegitable> vegitables = saladService.findCalories(salad, 2, 5);
        assertTrue(vegitables.contains(cucumber));
        assertTrue(vegitables.contains(onion));
    }
}
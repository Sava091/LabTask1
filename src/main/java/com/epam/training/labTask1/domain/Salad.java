package com.epam.training.labTask1.domain;

import java.util.Arrays;

public class Salad {
    private Vegitable[] vegitables;

    public Salad(Vegitable[] vegitables) {
        this.vegitables = vegitables;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegitables=" + Arrays.toString(vegitables) +
                '}';
    }

    public Vegitable[] getVegitables() {
        return vegitables;
    }
}


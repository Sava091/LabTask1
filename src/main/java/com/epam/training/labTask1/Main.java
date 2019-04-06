package com.epam.training.labTask1;

import  com.epam.training.labTask1.domain.*;
import  com.epam.training.labTask1.services.SaladService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Onion onion = new Onion(300,1,3,2,4);
        Tomato tomato = new Tomato(400,2,3,5,6);
        Cucumber cucumber = new Cucumber(200,14,7,5,4);

        Vegitable[] Vegitables = new Vegitable[3];
        Vegitables[0] = onion;
        Vegitables[1] = tomato;
        Vegitables[2] = cucumber;

        Salad salad = new Salad(Vegitables);
        SaladService saladService = new SaladService();
        double calories = saladService.calCalories(salad);
        System.out.println("Salad's calories =" + calories);

        saladService.sortWeigth(salad);

        Scanner scanner = new Scanner(System.in);
        int minCalories = scanner.nextInt();
        int maxCalories = scanner.nextInt();

        saladService.findCalories(salad, minCalories, maxCalories);
    }
}

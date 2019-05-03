package com.epam.training.labTask1;

import  com.epam.training.labTask1.domain.*;
import  com.epam.training.labTask1.services.SaladService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vegitable[] Vegitables = new Vegitable[3];
        Vegitables[0] = new Onion(300,1,3,2,4);
        Vegitables[1] = new Tomato(400,2,3,5,6);
        Vegitables[2] = new Cucumber(200,14,7,5,4);

        Salad salad = new Salad(Vegitables);
        SaladService saladService = new SaladService();
        double calories = saladService.calCalories(salad);
        System.out.println("Salad's calories =" + calories);

        saladService.sortWeigth(salad);

        Scanner scanner = new Scanner(System.in);
        int minCalories = scanner.nextInt();
        int maxCalories = scanner.nextInt();

        List<Vegitable> vegitables = saladService.findCalories(salad, minCalories, maxCalories);
        System.out.println(vegitables);
    }
}

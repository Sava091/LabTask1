package com.epam.training.labTask1.domain;

public class Vegitable {
    private double calories;
    private double protein;
    private double fat;
    private double carbonyhydrate;
    private double weigth;

    public Vegitable(double weight, double calories, double protein, double fat, double carbonyhydrate) {
        this.setWeigth(weight);
        this.setCalories(calories);
        this.setProtein(protein);
        this.setFat(fat);
        this.setCarbonyhydrate(carbonyhydrate);
    }

    public double calCalories() {
        return weigth * calories / 100;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbonyhydrate() {
        return carbonyhydrate;
    }

    public void setCarbonyhydrate(double carbonyhydrate) {
        this.carbonyhydrate = carbonyhydrate;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return String.valueOf(this.weigth);
    }
}

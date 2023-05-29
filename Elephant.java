package com.company;
public class Elephant {
    public double height;
    public double weight;
    public double speed;
    public String color;
    public Elephant(double height, double weight, double speed, String color) {
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }
    double square() {
        double s;
        s = (height * height) / weight;
        return s;
    }


}
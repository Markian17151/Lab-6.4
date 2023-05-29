package com.company;

public class Main1 {
    public static void main(String[] args) {
        Elephant obj1 = new Elephant(3, 5, 20, "Білий");
        Wolf obj2 = new Wolf(1, 300, 35, "Чорний");
        Parrot obj3 = new Parrot(40, 1.5, 30, "Червоний");
        Giraffe obj4 = new Giraffe(5, 1.2, 20, "Жовтий");

        System.out.println("Слон-" + "Висота в м: " + obj1.height + "  Вага в т: " + obj1.weight + "  Швидкість в км/г: " + obj1.speed + "  Колір: " + obj1.color);
        System.out.println("Вовк-" + "Висота в м: " + obj2.height + "  Вага в т: " + obj2.weight + "  Швидкість в км/г: " + obj2.speed + "  Колір: " + obj2.color);
        System.out.println("Папуга-" + "Висота в м: " + obj3.height + "  Вага в т: " + obj3.weight + "  Швидкість в км/г: " + obj3.speed + "  Колір: " + obj3.color);
        System.out.println("Жираф-" + "Висота в м: " + obj4.height + "  Вага в т: " + obj4.weight + "  Швидкість в км/г: " + obj4.speed + "  Колір: " + obj4.color);
        System.out.println();
    }

}
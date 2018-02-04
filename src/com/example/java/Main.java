package com.example.java;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of an Ice Cream Stand and its inventory");

        String[] iceCreamStand = {"Dry Ice", "flavored Ice Cream", "Cones", "Cart", "Toppings"};
        double[] inventory = {3,5,2,1,100};
        for (int i = 0; i < iceCreamStand.length; i++) {
            System.out.println(iceCreamStand[i] + " \n" + inventory[i]);

        }

        for (int i = 0; i<iceCreamStand.length; i++){
            if (iceCreamStand[i] == "flavored Ice Cream"){
                inventory[i] += 10;
                System.out.println(iceCreamStand[i] + "\n" + inventory[i]);
            }
        }
    }
}
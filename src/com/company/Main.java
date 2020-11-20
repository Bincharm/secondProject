package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballThree = new Ball();

        ballThree.anotherColor = "BLUE"; //null
        ballThree.price = 20;
        ballThree.radius = 6;
        ballThree.producerCountry = "GERMANY";

        System.out.println(ballThree.anotherColor + " " + ballThree.price + " " + ballThree.radius + " " + ballThree.producerCountry);


    }
}

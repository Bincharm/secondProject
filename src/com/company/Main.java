package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballTwo = new Ball();

        ballTwo.anotherColor = "BLUE"; //null
        ballTwo.price = 20;
        ballTwo.radius = 6;
        ballTwo.producerCountry = "GERMANY";

        System.out.println(ballTwo.anotherColor + " " + ballTwo.price + " " + ballTwo.radius + " " + ballTwo.producerCountry);



    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Ball ballOne = new Ball();

        ballOne.anotherColor = "BLUE"; //null
        ballOne.price = 20;
        ballOne.radius = 6;
        ballOne.producerCountry = "GERMANY";

        System.out.println(ballOne.anotherColor + " " + ballOne.price + " " + ballOne.radius + " " + ballOne.producerCountry);



    }
}

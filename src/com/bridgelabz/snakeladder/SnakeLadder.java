package com.bridgelabz.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        int startPosition = 0;                                           // initialize startPosition to zero
        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);    // it will generate 1 to 6 number randomly
        System.out.println("Dice Roll Number : "+ dieRoll);
    }
}

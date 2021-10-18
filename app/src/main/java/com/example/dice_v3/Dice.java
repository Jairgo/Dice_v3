package com.example.dice_v3;

import java.util.Random;

public class Dice {

    private final int max = 6;
    private int actual;
    private Random rand = new Random();

    public Dice(){
        this.actual = 1;
    }

    public Dice(int val){
        this.actual = val;
    }

    public int girarDado(){
        this.actual = rand.nextInt(6) + 1;
        return this.actual;
    }
}

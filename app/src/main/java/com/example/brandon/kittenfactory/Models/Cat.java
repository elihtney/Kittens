package com.example.brandon.kittenfactory.Models;

/**
 * Created by Brandon on 4/2/2016.
 */

/*
    Enums give each item a number based on order starting from 0
    0 is the lowest rank (recessive)

 */
public class Cat {

    public enum FurColor {
        BLACK, ORANGE, WHITE
    }

    public enum FurLength {
        LONG, SHORT
    }

    private FurColor furColor;
    private FurLength furLength;

    public Cat(FurColor furColor, FurLength furLength) {
        this.furColor = furColor;
        this.furLength = furLength;
    }
    public Cat(){

    }

    public FurColor getFurColor() {
        return furColor;
    }

    public void setFurColor(FurColor furColor) {
        this.furColor = furColor;
    }

    public FurLength getFurLength() {
        return furLength;
    }

    public void setFurLength(FurLength furLength) {
        this.furLength = furLength;
    }
}

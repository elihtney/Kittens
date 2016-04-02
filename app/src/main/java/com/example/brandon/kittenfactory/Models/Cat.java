package com.example.brandon.kittenfactory.Models;

import java.util.ArrayList;

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

    public enum EyeColor {
        MIX, BLUE, GREEN, ORANGE
    }

    private FurColor furColor;
    private FurLength furLength;
    private EyeColor eyeColor;

    public Cat(FurColor furColor, FurLength furLength, EyeColor eyeColor) {
        this.furColor = furColor;
        this.furLength = furLength;
        this.eyeColor = eyeColor;
    }
    public Cat(){

    }

    public FurColor getFurColor() {
        return furColor;
    }

    public void setFurColor(FurColor furColor) {
        this.furColor = furColor;
    }
}

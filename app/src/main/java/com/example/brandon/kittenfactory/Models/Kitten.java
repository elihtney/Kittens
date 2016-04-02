package com.example.brandon.kittenfactory.Models;

/**
 * Created by Brandon on 4/2/2016.
 */
public class Kitten extends Cat{

    private String kittenFurColor;
    //private String kittenEyeColor;
    private String kittenFurLength;

    public Kitten(FurColor furColor, FurLength furLength){
        super(furColor, furLength);
    }

    public void setKittenFurColor(String fur){
        kittenFurColor = fur;
    }

//    public void setKittenEyeColor(String eyes){
//        kittenEyeColor = eyes;
//    }

    public void setKittenFurLength(String length){
        kittenFurLength = length;
    }

}

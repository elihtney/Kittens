package com.example.brandon.kittenfactory;

public class Cat {
	
	// Fur alleles
	public char[] lengthAlleles = new char[2];
	public char[] colorAlleles = new char[2];	
	
	//Constructor
	public Cat() {
	}
	
	public Cat(char[] lengthAlleles, char[] colorAlleles) {
		this.lengthAlleles = lengthAlleles;
		this.colorAlleles = colorAlleles;
	}
	
	public char[] getLengthAlleles() {
		return lengthAlleles;
	}
	
	public char[] getColorAlleles() {
		return colorAlleles;
	}
	
	public void setLengthAlleles(char[] lengthAlleles) {
		this.lengthAlleles = lengthAlleles;
	}
	
	public void setColorAlleles(char[] colorAlleles) {
		this.colorAlleles = colorAlleles;
	}

}

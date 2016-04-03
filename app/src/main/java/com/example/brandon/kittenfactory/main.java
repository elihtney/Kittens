package com.example.brandon.kittenfactory;

import java.io.Console;

public class main {	
	public static char[] babyLengthAlleles = new char[2];
	public static char[] babyColorAlleles = new char[2];
	static Cat baby = new Cat();

		public static void main (String[] args) {
			// Create our cats
			Cat[] cats = new Cat[4];

			for (int i = 0; i < cats.length; i++) {
				cats[i] = new Cat();
			}
			
			// Create & set character array for fur alleles of ORANGE CAT
			char[] orangeLengthAlleles = {'H', 'h'};
			char[] orangeColorAlleles = {'O','O'};
			cats[0].setLengthAlleles(orangeLengthAlleles);
			cats[0].setColorAlleles(orangeColorAlleles);
			
			// Create & set character array for alleles of WHITE CAT
			char[] whiteLengthAlleles = {'h', 'h'};
			char[] whiteColorAlleles = {'W', 'W'};
			cats[1].setLengthAlleles(whiteLengthAlleles);
			cats[1].setColorAlleles(whiteColorAlleles);
			
			// Create & set character array for alleles of BLACK CAT
			char[] blackLengthAlleles = {'H', 'h'};
			char[] blackColorAlleles = {'B', 'B'};
			cats[2].setLengthAlleles(blackLengthAlleles);
			cats[2].setColorAlleles(blackColorAlleles);
			
			// Create & set character array for alleles of BLACK LONG HAIR CAT
			char[] blackLongLengthAlleles = {'h', 'h'};
			char[] blackLongColorAlleles = {'B', 'B'};
			cats[3].setLengthAlleles(blackLongLengthAlleles);
			cats[3].setColorAlleles(blackLongColorAlleles);		
			
			
			
			// Let's see if this works...
			
			calculateLengthPunnett(cats[0], cats[3]);
			calculateColorPunnett(cats[0], cats[3]);
			
			baby.setLengthAlleles(babyLengthAlleles);
			baby.setLengthAlleles(babyColorAlleles);
			
			System.out.println(Character.toString(babyLengthAlleles[0]) + Character.toString(babyLengthAlleles[1]));
			System.out.println(Character.toString(babyColorAlleles[0]) + Character.toString(babyColorAlleles[1]));


		}
		
		// Only deals with length alleles
		public static void calculateLengthPunnett(Cat cat1, Cat cat2) {
			if ((cat1.lengthAlleles[0] == 'H' && cat1.lengthAlleles[1] == 'h') 
					|| (cat2.lengthAlleles[0] == 'H' && cat2.lengthAlleles[1] == 'h')) {
				
				// This next if will handle Hh x hh
				//		  H	  h
				//	 h [ Hh | hh ]
				//	 h [ Hh | hh ]
				if ((cat1.lengthAlleles[0] == 'h' && cat1.lengthAlleles[1] == 'h') 
						|| (cat2.lengthAlleles[0] == 'h') && (cat2.lengthAlleles[1] == 'h')) {
					int random = (int)(Math.random() * 2);
					
					// 50% chance for long hair
					if (random == 0) {
						babyLengthAlleles[0] = 'h';
						babyLengthAlleles[1] = 'h';
					}
					
					// 50% chance for short hair
					else if (random == 1) {
						babyLengthAlleles[0] = 'H';
						babyLengthAlleles[1] = 'h';
					}
					
				}
				
				// This next if will handle Hh x Hh
				//		  H	  h
				//	 H [ Hh | Hh ]
				//	 h [ Hh | hh ]
				else if (cat2.lengthAlleles[0] == 'H' && cat2.lengthAlleles[1] == 'h') {
					int random = (int)(Math.random() * 4);
					// 75%  for short hair
					if (random == 0 || random == 1 || random == 2) {
						babyLengthAlleles[0] = 'H';
						babyLengthAlleles[1] = 'h';
					}
					
					// 25% for long hair
					else if (random == 3) {
						babyLengthAlleles[0] = 'h';
						babyLengthAlleles[1] = 'h';
					}
				}
				
			} // end outer if
			
			
			if ((cat1.lengthAlleles[0] == 'h' && cat1.lengthAlleles[1] == 'h') 
					|| (cat2.lengthAlleles[0] == 'h' && cat2.lengthAlleles[1] == 'h')) {

				// This next if will handle hh x Hh
				//		  H	  h
				//	 h [ Hh | hh ]
				//	 h [ Hh | hh ]
				if ((cat1.lengthAlleles[0] == 'H' && cat1.lengthAlleles[1] == 'h') 
						|| (cat2.lengthAlleles[0] == 'H') && (cat2.lengthAlleles[1] == 'h')) {
					int random = (int)(Math.random() * 2);
					
					// 50% chance for long hair
					if (random == 0) {
						babyLengthAlleles[0] = 'h';
						babyLengthAlleles[1] = 'h';
					}
					
					// 50% chance for short hair
					else if (random == 1) {
						babyLengthAlleles[0] = 'H';
						babyLengthAlleles[1] = 'h';
					}
					
				}
				
				// This next if will handle hh x hh
				//		  h	  h
				//	 h [ hh | hh ]
				//	 h [ hh | hh ]
				else if ((cat1.lengthAlleles[0] == 'h' && cat1.lengthAlleles[1] == 'h') 
						|| (cat2.lengthAlleles[0] == 'h') && (cat2.lengthAlleles[1] == 'h')) {
					// 100% long hair
					babyLengthAlleles[0] = 'h';
					babyLengthAlleles[1] = 'h';
				}
				
			} // end outer if
			
		}
		
		// Only deals with color alleles
		public static void calculateColorPunnett(Cat cat1, Cat cat2) {
			// White (W) > Orange (O) > Black (B)
			if (cat1.colorAlleles[0] == 'W' || cat2.colorAlleles[0] == 'W') {
				babyColorAlleles[0] = 'W';
				babyColorAlleles[1] = 'W';
			}
			
			else if (cat1.colorAlleles[0] == 'O' || cat2.colorAlleles[0] == 'O') {
				babyColorAlleles[0] = 'O';
				babyColorAlleles[1] = 'O';				
			}
			
			else if (cat1.colorAlleles[0] == 'B' || cat2.colorAlleles[0] == 'B') {
				babyColorAlleles[0] = 'B';
				babyColorAlleles[1] = 'B';
			}
			
		}

}

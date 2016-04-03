package com.example.brandon.kittenfactory;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.brandon.kittenfactory.Models.Cat;

import java.util.ArrayList;

/**
 * Created by Brandon on 4/2/2016.
 */
public class SquaresFragment extends Fragment{

    public static char[] babyLengthAlleles = new char[2];
    public static char[] babyColorAlleles = new char[2];
    static com.example.brandon.kittenfactory.Cat baby = new com.example.brandon.kittenfactory.Cat();

    private ArrayList<Cat> catList;
    private Button seeResult;



    public SquaresFragment(ArrayList arrayList){
        catList = arrayList;
    }

    private ImageView catParent1;
    private ImageView catParent2;
    private ImageView furLength;
    private ImageView furColor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_squares, container, false);


        seeResult = (Button)v.findViewById(R.id.seeResult);
        seeResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewResult();
            }
        });

        catParent1 = (ImageView)v.findViewById(R.id.imgCat1);
        catParent2 = (ImageView)v.findViewById(R.id.imgCat2);

        Cat catTestOne;
        catTestOne = catList.get(0);
        catTestOne.getFurColor();
        catTestOne.getFurLength();

        Cat catTestTwo;
        catTestTwo = catList.get(1);
        catTestTwo.getFurColor();
        catTestTwo.getFurLength();

        Log.d("This is catTestOne", catTestOne.getFurColor().toString());
        Log.d("This is catTestTwo", catTestTwo.getFurColor().toString());

        if (catTestOne.getFurColor().toString() == "WHITE" && catTestOne.getFurLength().toString() == "LONG"){
            catParent1.setImageResource(R.drawable.cat3);
        }

        if (catTestOne.getFurColor().toString() == "ORANGE" && catTestOne.getFurLength().toString() == "SHORT"){
            catParent1.setImageResource(R.drawable.cat2);
        }

        if (catTestOne.getFurColor().toString() == "BLACK" && catTestOne.getFurLength().toString() == "SHORT"){
            catParent1.setImageResource(R.drawable.cat1);
        }

        if (catTestOne.getFurColor().toString() == "BLACK" && catTestOne.getFurLength().toString() == "LONG"){
            catParent1.setImageResource(R.drawable.cat4);
        }

        if (catTestTwo.getFurColor().toString() == "WHITE" && catTestTwo.getFurLength().toString() == "LONG"){
            catParent2.setImageResource(R.drawable.cat3);
        }

        if (catTestTwo.getFurColor().toString() == "ORANGE" && catTestTwo.getFurLength().toString() == "SHORT"){
            catParent2.setImageResource(R.drawable.cat2);
        }

        if (catTestTwo.getFurColor().toString() == "BLACK" && catTestTwo.getFurLength().toString() == "SHORT"){
            catParent2.setImageResource(R.drawable.cat1);
        }

        if (catTestTwo.getFurColor().toString() == "BLACK" && catTestTwo.getFurLength().toString() == "LONG"){
            catParent2.setImageResource(R.drawable.cat4);
        }



        // Create our cats
        com.example.brandon.kittenfactory.Cat[] cats = new com.example.brandon.kittenfactory.Cat[4];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new com.example.brandon.kittenfactory.Cat();
        }

        // Create & set character array for alleles of BLACK CAT
        char[] blackLengthAlleles = {'H', 'h'};
        char[] blackColorAlleles = {'B', 'B'};
        cats[0].setLengthAlleles(blackLengthAlleles);
        cats[0].setColorAlleles(blackColorAlleles);

        // Create & set character array for fur alleles of ORANGE CAT
        char[] orangeLengthAlleles = {'H', 'h'};
        char[] orangeColorAlleles = {'O','O'};
        cats[1].setLengthAlleles(orangeLengthAlleles);
        cats[1].setColorAlleles(orangeColorAlleles);

        // Create & set character array for alleles of WHITE LONG HAIR CAT
        char[] whiteLengthAlleles = {'h', 'h'};
        char[] whiteColorAlleles = {'W', 'W'};
        cats[2].setLengthAlleles(whiteLengthAlleles);
        cats[2].setColorAlleles(whiteColorAlleles);


        // Create & set character array for alleles of BLACK LONG HAIR CAT
        char[] blackLongLengthAlleles = {'h', 'h'};
        char[] blackLongColorAlleles = {'B', 'B'};
        cats[3].setLengthAlleles(blackLongLengthAlleles);
        cats[3].setColorAlleles(blackLongColorAlleles);


//        // Selected cats will be saved into indexes to call a method later
//        int index1 = 0;
//        int index2 = 0;
//
//
//         //We will offset the indexes by 1 for "checking" purposes
//        if (catTestOne.getFurColor().toString().equalsIgnoreCase("BLACK") && catTestTwo.getFurColor().toString().equalsIgnoreCase("BLACK")) {
//            index1 = 1;
//            if (cats[index1 -1].getColorAlleles().equals('B')&& (cats[index1 -1].getColorAlleles().equals('B');
//            //calculateColorPunnett(cats[index1 - 1], cats[index2 + 3]);
//            furColor.setImageResource(R.drawable.bbbb_uppercase);
//
//
//        }
//
//        if (catTestOne.getFurColor().toString() == "ORANGE" && catTestTwo.getFurColor().toString() == "WHITE") {
//            if (index1 == 0){
//                index1 = 2;
//                furColor.setImageResource(R.drawable.wwoo_uppercase);
//            }
//            else {
//                index2 = 2;
//
//            }
//        }
//
//        if (catTestOne.getFurColor().toString() == "WHITE" && catTestTwo.getFurColor().toString() == "BLACK") {
//            if (index1 == 0 ) {
//                index1 = 3;
//                furColor.setImageResource(R.drawable.wwbb_uppercase);
//            }
//            else if (index2 == 0) {
//                index2 = 3;
//
//            }
//
//        }
//
//        if (catTestOne.getFurColor().toString().equalsIgnoreCase("BLACK") && catTestTwo.getFurColor().toString().equalsIgnoreCase("ORANGE")) {
//            if (index1 == 0 ) {
//                index1 = 4;
//                furColor.setImageResource(R.drawable.bboo_uppercase);
//
//            }
//            else if (index2 == 0) {
//                index2 = 4;
//
//            }
//        }


          //Let's see if this works...
//        calculateLengthPunnett(cats[index1 -1], cats[index2 - 1]);
//        calculateColorPunnett(cats[index1 -1], cats[index2 -1]);

        baby.setLengthAlleles(babyLengthAlleles);
        baby.setLengthAlleles(babyColorAlleles);

        return v;
    }

    public void viewResult(){
        Fragment fragment = new ResultFragment();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    // Only deals with length alleles
    public static void calculateLengthPunnett(com.example.brandon.kittenfactory.Cat cat1, com.example.brandon.kittenfactory.Cat cat2) {
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
    public static void calculateColorPunnett(com.example.brandon.kittenfactory.Cat cat1, com.example.brandon.kittenfactory.Cat cat2) {
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

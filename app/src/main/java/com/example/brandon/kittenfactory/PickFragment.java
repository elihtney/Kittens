package com.example.brandon.kittenfactory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.brandon.kittenfactory.Models.Cat;

import java.util.ArrayList;

/**
 * Created by Brandon on 4/2/2016.
 */
public class PickFragment extends Fragment {

    // Have an int keep track of how many cats are selected
    private int selected = 0;
    private CheckBox catOne;
    private CheckBox catTwo;
    private CheckBox catThree;
    private CheckBox catFour;
    private Button nextPage;
    PickCallback callback = null;
    private ArrayList<Cat> catList;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callback = (PickCallback)activity;
    }

    public PickFragment(ArrayList arrayList){
        catList = arrayList;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_game, container, false);

        final Cat[] cats = new Cat[4];

        for(int i=0; i<4;i++){
            cats[i] = new Cat();
        }

        cats[0].setFurColor(Cat.FurColor.BLACK);
        cats[1].setFurColor(Cat.FurColor.ORANGE);
        cats[2].setFurColor(Cat.FurColor.WHITE);
        cats[3].setFurColor(Cat.FurColor.BLACK);

        cats[0].setFurLength(Cat.FurLength.SHORT);
        cats[1].setFurLength(Cat.FurLength.SHORT);
        cats[2].setFurLength(Cat.FurLength.LONG);
        cats[3].setFurLength(Cat.FurLength.LONG);


        nextPage = (Button)v.findViewById(R.id.next);

        if (selected < 2) {
            nextPage.setEnabled(false);
        }

        catOne = (CheckBox)v.findViewById(R.id.cat1);
        catOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[0]);
                Log.d("Adding cat 0 to catList", catList.toString());
                checkIfSelected(catOne);
            }
        });

        catTwo = (CheckBox)v.findViewById(R.id.cat2);
        catTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[1]);
                Log.d("Adding cat 1 to catList", catList.toString());
                checkIfSelected(catTwo);
            }
        });

        catThree = (CheckBox)v.findViewById(R.id.cat3);
        catThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[2]);
                Log.d("Adding cat 2 to catList", catList.toString());
                checkIfSelected(catThree);
            }
        });

        catFour = (CheckBox)v.findViewById(R.id.cat4);
        catFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[3]);
                Log.d("Adding cat 3 to catList", catList.toString());
                checkIfSelected(catFour);
            }
        });

//        final CheckBox[] checkboxArray = {catOne, catTwo, catThree, catFour};
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.viewSquares();
            } // end onClick
        });

        return v;
    }

    public void checkIfSelected(CheckBox c) {
        if (c.isChecked()) {
            if (selected < 2) {
                nextPage.setEnabled(false);
            }
            selected++;

            if (selected > 2){
                // If user ever selects more than 2 cats, checkbox will be unchecked
                c.setChecked(false);
                selected--;
            }

            if (selected == 2){

                // Enable "next" button when we have enough cats
                nextPage.setEnabled(true);
            }
        }
        else {
            // if unchecked, decrement by 1
            selected--;

        }
    }

    public interface PickCallback{
        void viewSquares();
    }

}

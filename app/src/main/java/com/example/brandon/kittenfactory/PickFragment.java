package com.example.brandon.kittenfactory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.brandon.kittenfactory.Models.Cat;

import java.util.ArrayList;

/**
 * Created by Brandon on 4/2/2016.
 */
public class PickFragment extends Fragment {

    private Button catOne;
    private Button catTwo;
    private Button catThree;
    private Button catFour;
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

        catOne = (Button)v.findViewById(R.id.cat1);
        catOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[0]);
            }
        });
        catTwo = (Button)v.findViewById(R.id.cat2);
        catTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[1]);
            }
        });
        catThree = (Button)v.findViewById(R.id.cat3);
        catThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[2]);
            }
        });
        catFour = (Button)v.findViewById(R.id.cat4);
        catFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catList.add(cats[3]);
            }
        });
        nextPage = (Button)v.findViewById(R.id.next);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.viewSquares();
            }
        });
        return v;
    }


    public interface PickCallback{
        void viewSquares();
    }

    public void addCats(){

    }

}

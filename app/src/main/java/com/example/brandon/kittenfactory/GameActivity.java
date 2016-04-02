package com.example.brandon.kittenfactory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brandon.kittenfactory.Models.Cat;

/**
 * Created by Brandon on 4/1/2016.
 */
public class GameActivity extends SingleFragmentActivity {

//    private Button catOne;
//    private Button catTwo;
//    private Button catThree;
//    private Button catFour;

    @Override
    protected Fragment createFragment() {
        return new PickFragment();
    }


//        Cat[] cats = new Cat[4];
//        cats[0].setFurColor(Cat.FurColor.BLACK);
//        cats[1].setFurColor(Cat.FurColor.ORANGE);
//        cats[2].setFurColor(Cat.FurColor.WHITE);
//        cats[3].setFurColor(Cat.FurColor.BLACK);
//
//        catOne = (Button)findViewById(R.id.cat1);
//        catOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        catTwo = (Button)findViewById(R.id.cat2);
//        catThree = (Button)findViewById(R.id.cat3);
//        catFour = (Button)findViewById(R.id.cat4);



}

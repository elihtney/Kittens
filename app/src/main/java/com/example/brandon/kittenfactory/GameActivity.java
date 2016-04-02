package com.example.brandon.kittenfactory;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;


import android.support.v4.app.Fragment;

import com.example.brandon.kittenfactory.Models.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon on 4/1/2016.
 */
public class GameActivity extends SingleFragmentActivity implements PickFragment.PickCallback{
    ArrayList<Cat> catList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        catList = new ArrayList();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return new PickFragment(catList);
    }

    @Override
    public void viewSquares() {
        Fragment fragment = new SquaresFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}

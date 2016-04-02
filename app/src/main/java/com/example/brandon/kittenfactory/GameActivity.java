package com.example.brandon.kittenfactory;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;


import android.support.v4.app.Fragment;

/**
 * Created by Brandon on 4/1/2016.
 */
public class GameActivity extends SingleFragmentActivity implements PickFragment.PickCallback{

    @Override
    protected Fragment createFragment() {
        return new PickFragment();
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

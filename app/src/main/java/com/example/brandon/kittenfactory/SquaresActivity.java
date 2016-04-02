package com.example.brandon.kittenfactory;

import android.support.v4.app.Fragment;

/**
 * Created by Brandon on 4/1/2016.
 */
public class SquaresActivity extends SingleFragmentActivity {
        protected Fragment createFragment() {
            return new SquaresFragment();
        }

}

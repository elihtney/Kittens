package com.example.brandon.kittenfactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Brandon on 4/2/2016.
 */
public class LearnFragment extends Fragment {

    private Button nextLearn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_learnmore1, container, false);

        nextLearn = (Button)v.findViewById(R.id.learnMore2);
        nextLearn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                viewLearnMore2();
            }

        });
        return v;
    }

    public void viewLearnMore2() {
        Fragment fragment = new LearnFragment2();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}

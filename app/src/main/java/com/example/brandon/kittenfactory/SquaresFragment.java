package com.example.brandon.kittenfactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.brandon.kittenfactory.Models.Cat;
import com.example.brandon.kittenfactory.R;

import java.util.ArrayList;

/**
 * Created by Brandon on 4/2/2016.
 */
public class SquaresFragment extends Fragment {

    private ArrayList<Cat> catList;
    private TextView catOne;
    private TextView catTwo;
    private Button seeResult;

    public SquaresFragment(ArrayList arrayList){
        catList = arrayList;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_squares, container, false);

        catOne = (TextView)v.findViewById(R.id.cat1);
        catTwo = (TextView)v.findViewById(R.id.cat2);

//        catOne.setText(catList.get(0).getFurColor().toString());
//        catTwo.setText(catList.get(1).getFurColor().toString());

        seeResult = (Button)v.findViewById(R.id.seeResult);
        seeResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewResult();
            }
        });
        return v;
    }

    public void viewResult(){
        Fragment fragment = new ResultFragment();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}

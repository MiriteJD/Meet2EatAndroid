package com.example.dreher.meet2eat;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by dreher on 01.12.2015.
 */
public class HomeFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";


    public static HomeFragment newInstance(int sectionNumber) {
        HomeFragment hfragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        hfragment.setArguments(args);
        return hfragment;
    }

    public HomeFragment() {

    }
    ListView HomeList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hometab, container, false);

        HomeList = (ListView)rootView.findViewById(R.id.ListViewHome);

        return rootView;
    }

}

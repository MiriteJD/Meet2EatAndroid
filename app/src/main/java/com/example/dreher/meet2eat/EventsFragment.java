package com.example.dreher.meet2eat;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class EventsFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";


    public static EventsFragment newInstance(int sectionNumber) {
        EventsFragment efragment = new EventsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        efragment.setArguments(args);

        return efragment;
    }

    public EventsFragment() {

    }

    ListView ListViewEvents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);

        ListViewEvents = (ListView) rootView.findViewById(R.id.ListViewEvents);



        return rootView;
    }

}

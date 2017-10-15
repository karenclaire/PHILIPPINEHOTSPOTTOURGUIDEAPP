package com.example.android.philippinehotspottourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.philippinehotspottourguideapp.Place;
import com.example.android.philippinehotspottourguideapp.PlaceAdapter;

import java.util.ArrayList;

/**
 * Created by karenulmer on 6/19/2017.
 *
 *
 *
 */

public class FiestaFragment extends Fragment {
    public FiestaFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.atiatihan, R.string.atiatihan_address, R.string.atiatihan_number ));
        places.add(new Place(R.string.cutud, R.string.cutud_address, R.string.cutud_number));
        places.add(new Place(R.string.dinagyang, R.string.dinagyang_address, R.string.dinagyang_number));
        places.add(new Place(R.string.masskara, R.string.masskara_address, R.string.masskara_number));
        places.add(new Place(R.string.pahiyas, R.string.pahiyas_address, R.string.pahiyas_number));
        places.add(new Place(R.string.sinulog, R.string.sinulog_address, R.string.sinulog_number));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.fiesta_category);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }
}

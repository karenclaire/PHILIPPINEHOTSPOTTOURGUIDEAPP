package com.example.android.philippinehotspottourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karenulmer on 6/19/2017.
 * Source content and photos: https://wanderwisdom.com/travel-destinations/A-JOURNEY-TO-PARADISE
 */

public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.boracay, R.string.boracay_where, R.string.boracay_known_for,R.drawable.boracay));
        places.add(new Place(R.string.coron, R.string.coron_where, R.string.coron_known_for,R.drawable.coron));
        places.add(new Place(R.string.elnido, R.string.elnido_where, R.string.elnido_known_for,R.drawable.elnido));
        places.add(new Place(R.string.mactan, R.string.mactan_where, R.string.mactan_known_for,R.drawable.mactan));
        places.add(new Place(R.string.pagudpod, R.string.pagudpod_where, R.string.pagudpod_known_for,R.drawable.pagudpod));
        places.add(new Place(R.string.palaui, R.string.palaui_where, R.string.palaui_known_for,R.drawable.palaui));
        places.add(new Place(R.string.panglao, R.string.panglao_where, R.string.panglao_known_for,R.drawable.panglao));
        places.add(new Place(R.string.puerto, R.string.puerto_where, R.string.puerto_known_for,R.drawable.puertogalera));
        places.add(new Place(R.string.samal, R.string.samal_where, R.string.samal_known_for,R.drawable.samal));
        places.add(new Place(R.string.siargao, R.string.siargao_where, R.string.siargao_known_for,R.drawable.siargao));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.beach_category);

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

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
 * Source contents and photos: https://www.tripadvisor.com/TravelersChoice-Hotels-cTop-g294245
 */

public class HotelFragment extends Fragment {
    public HotelFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.amanpulo, R.string.amanpulo_address, R.string.amanpulo_number,R.drawable.amanpulo));
        places.add(new Place(R.string.amorita, R.string.amorita_address, R.string.amorita_number,R.drawable.amorita));
        places.add(new Place(R.string.atmosphere, R.string.atmosphere_address, R.string.atmosphere_number,R.drawable.atmosphere));
        places.add(new Place(R.string.discoveryprimea, R.string.discoveryprimea_address, R.string.discoveryprimea_number,R.drawable.discoveryprimea));
        places.add(new Place(R.string.discoveryshores, R.string.discoveryshores_address, R.string.discoveryshores_number,R.drawable.raffles));
        places.add(new Place(R.string.peacock, R.string.peacock_address, R.string.peacock_number,R.drawable.peacockgarden));
        places.add(new Place(R.string.raffles, R.string.raffles_address, R.string.raffles_number,R.drawable.raffles));
        places.add(new Place(R.string.shangrila, R.string.shangrila_address, R.string.shangrila_number,R.drawable.shangrila));
        places.add(new Place(R.string.villa, R.string.villa_address, R.string.villa_number,R.drawable.villacaemilla));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.hotel_category);

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

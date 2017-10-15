package com.example.android.philippinehotspottourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

import android.support.v4.app.Fragment;

/**
 * Created by karenulmer on 6/18/2017.
 * Content and image source http://ph.dining.asiatatler.com/features/top-20-best-restaurants-2016
 */

public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.abaca, R.string.abaca_address, R.string.abaca_number,R.drawable.abaca));
        places.add(new Place(R.string.antonios, R.string.antonios_address, R.string.antonios_number,R.drawable.antonios));
        places.add(new Place(R.string.blackbird, R.string.blackbird_address, R.string.blackbird_number,R.drawable.blackbird));
        places.add(new Place(R.string.caviar, R.string.caviar_address, R.string.caviar_number,R.drawable.caviar));
        places.add(new Place(R.string.cru, R.string.cru_address, R.string.cru_number,R.drawable.cru));
        places.add(new Place(R.string.crystal, R.string.crystal_address, R.string.crystal_number,R.drawable.crystal));
        places.add(new Place(R.string.inagiku, R.string.inagiku_address, R.string.inagiku_number,R.drawable.inagiku));
        places.add(new Place(R.string.jasmine, R.string.jasmine_address, R.string.jasmine_number,R.drawable.jasmine));
        places.add(new Place(R.string.mdining, R.string.mdining_address, R.string.mdining_number,R.drawable.mdining));
        places.add(new Place(R.string.nobu, R.string.nobu_address, R.string.nobu_number,R.drawable.nobu));
        places.add(new Place(R.string.old_manila, R.string.old_manila_address, R.string.old_manila_number,R.drawable.oldmanila));
        places.add(new Place(R.string.people, R.string.people_address, R.string.people_number,R.drawable.people));
        places.add(new Place(R.string.vask, R.string.vask_address, R.string.vask_number,R.drawable.vask));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.restaurant_category);

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
package polytech.android.LGLPDR.AndroidApp.beers.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import polytech.android.LGLPDR.AndroidApp.R;

/**
 * Created by Robin on 15/01/2018.
 */

public class ListBeerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_list_beer, container, false);
    }


}

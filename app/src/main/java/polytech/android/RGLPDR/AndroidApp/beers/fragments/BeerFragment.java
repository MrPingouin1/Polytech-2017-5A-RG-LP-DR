package polytech.android.RGLPDR.AndroidApp.beers.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import polytech.android.RGLPDR.AndroidApp.R;
import polytech.android.RGLPDR.AndroidApp.objects.Beer;

public class BeerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.beer_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        beer((Beer) bundle.getSerializable("beer"));
    }

    public void beer(Beer beer){

        Picasso.with(getContext()).load(beer.getImage_url()).into((ImageView) getActivity().findViewById(R.id.beerImageDetails));

        ((TextView) getActivity().findViewById(R.id.beerNameDetails)).setText(beer.getName());
        ((TextView) getActivity().findViewById(R.id.beerTaglineDetails)).setText(beer.getTagline());
        ((TextView) getActivity().findViewById(R.id.beerDescriptionDetails)).setText(beer.getDescription());
        ((TextView) getActivity().findViewById(R.id.beerBrewersTipsDetails)).setText(beer.getBrewers_tips());
    }
}
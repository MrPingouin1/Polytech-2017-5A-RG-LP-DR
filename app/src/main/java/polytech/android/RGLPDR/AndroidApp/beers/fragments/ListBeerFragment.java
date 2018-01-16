package polytech.android.RGLPDR.AndroidApp.beers.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import polytech.android.RGLPDR.AndroidApp.R;
import polytech.android.RGLPDR.AndroidApp.beers.BeerAdapter;
import polytech.android.RGLPDR.AndroidApp.objects.Beer;

import static android.content.ContentValues.TAG;

public class ListBeerFragment extends Fragment {

    private ListView listView;
    private List<Beer> beerList;
    private BeerAdapter beerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_beer_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        beerList = new ArrayList<>();
        this.listView = (ListView) getActivity().findViewById(R.id.beerList);

        listBeer();
    }

    private void listBeer() {
        final String api_url = "https://api.punkapi.com/v2/beers";
        final Beer default_beer = new Beer();
        final Context context = getActivity().getApplicationContext();
        RequestQueue queue = Volley.newRequestQueue(context);
        beerList = new ArrayList<>();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest (api_url, response -> {
            try {
                for(int i=0; i < response.length(); i++) {
                    JSONObject jsonObject = response.getJSONObject(i);
                    Beer beer = new Beer(jsonObject);
                    beerList.add(beer);
                }
            }
            catch(JSONException e) {
                e.printStackTrace();
                beerList.add(default_beer);
            }

            beerAdapter = new BeerAdapter(context, beerList);
            listView.setAdapter(beerAdapter);}, null);
        queue.add(jsonArrayRequest);
    }

}

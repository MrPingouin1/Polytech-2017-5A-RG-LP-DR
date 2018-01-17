package polytech.android.RGLPDR.AndroidApp.beers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import polytech.android.RGLPDR.AndroidApp.R;
import polytech.android.RGLPDR.AndroidApp.beers.fragments.ListBeerFragment;

public class BeerActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        if(savedInstanceState != null){
            return;
        }

        ListBeerFragment listFragment = new ListBeerFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.beerFragment, listFragment).commit();

    }
}

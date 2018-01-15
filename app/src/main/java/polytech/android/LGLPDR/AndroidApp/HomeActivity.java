package polytech.android.LGLPDR.AndroidApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import polytech.android.LGLPDR.AndroidApp.beers.BeerActivity;
import polytech.android.LGLPDR.AndroidApp.beers.fragments.ListBeerFragment;
import polytech.android.LGLPDR.AndroidApp.questions.SelectionActivity;

/**
 * Created by Robin on 21/12/2017.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button button_beer = (Button) findViewById(R.id.beer_app);
        final Button button_question = (Button) findViewById(R.id.question_app);

        button_beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, BeerActivity.class));
            }
        });

        button_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SelectionActivity.class));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}

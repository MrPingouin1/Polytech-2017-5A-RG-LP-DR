package polytech.android.LGLPDR.AndroidApp.questions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import polytech.android.LGLPDR.AndroidApp.R;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        final Button b_vsIA = (Button) findViewById(R.id.b_vsIA);
        b_vsIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("toto","onclick ok");
                startActivity(new Intent(SelectionActivity.this, QuestionActivity.class));

            }
        });

        final Button b_vsPonline = (Button) findViewById(R.id.b_vsPonline);
        b_vsPonline.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                i++;
                b_vsPonline.setText(String.valueOf(i));

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

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

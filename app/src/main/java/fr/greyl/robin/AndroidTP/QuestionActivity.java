package fr.greyl.robin.AndroidTP;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        List<String> choix;
        String bonneReponse;

        final Button buttonAnswer1 = (Button) findViewById(R.id.b_answer1);
        final Button buttonAnswer2 = (Button) findViewById(R.id.b_answer2);
        final Button buttonAnswer3 = (Button) findViewById(R.id.b_answer3);
        final Button buttonAnswer4 = (Button) findViewById(R.id.b_answer4);

        final TextView textViewScore = (TextView) findViewById(R.id.textScore);

        textViewScore.setText("@String/score" + " " + String.valueOf(0));

        choix = new ArrayList<>();
        choix.add("pingouin");
        choix.add("pangolin");
        choix.add("ornithorynque");
        choix.add("calopsitte");
        bonneReponse = choix.get(0);

        buttonAnswer1.setText(choix.get(0));
        buttonAnswer2.setText(choix.get(1));
        buttonAnswer3.setText(choix.get(2));
        buttonAnswer4.setText(choix.get(3));

        buttonAnswer1.setOnClickListener(new View.OnClickListener() {
            int score = 0;
            @Override
            public void onClick(View v) {
                score++;
                textViewScore.setText("@String/score" + " " + String.valueOf(score));
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

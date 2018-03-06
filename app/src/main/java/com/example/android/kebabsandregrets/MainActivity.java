package com.example.android.kebabsandregrets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int christofferKebabs = 0;
    int christofferRegrets = 0;
    int patrickKebabs = 0;
    int patrickRegrets = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the Satisfaction score for Christoffer.
     */
    public void satisfactionChristoffer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.christoffer_satisfaction);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Regret score for Christoffer.
     */
    public void displayRegretC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.christoffer_regrets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the satisfaction score for Christoffer by 1 point for kebabs.
     */
    public void kebabC(View v) {
        christofferKebabs = christofferKebabs + 1;
        satisfactionChristoffer(christofferKebabs);
    }

    /**
     * Increase the satisfaction score for Christoffer. Plov is awesome, at least as good as kebab, but may surprise you.
     * Therefore, the value of plov increases satisfaction by a random number from 1 to 5.
     */
    public void plovC(View v) {
        int plov = new Random().nextInt(5 ) + 1;
        christofferKebabs = christofferKebabs + plov;
        satisfactionChristoffer(christofferKebabs);
    }

    /**
     * Increase the regret score for Christoffer by 1 and reduces satisfaction for Christoffer by 1.
     */
    public void regretC(View v) {
        christofferRegrets = christofferRegrets + 1;
        christofferKebabs = christofferKebabs - 1;
        displayRegretC(christofferRegrets);
        satisfactionChristoffer(christofferKebabs);
    }

    /**
     * Displays the Satisfaction score for Patrick.
     */
    public void satisfactionPatrick(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patrick_satisfaction);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Regret score for Patrick.
     */
    public void displayRegretP(int score) {
        TextView scoreView = (TextView) findViewById(R.id.patrick_regrets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the satisfaction score for Patrick by 1 point for kebabs.
     */
    public void kebabP(View v) {
        patrickKebabs = patrickKebabs + 1;
        satisfactionPatrick(patrickKebabs);
    }

    /**
     * Increase the satisfaction score for Patrick. Plov is awesome, at least as good as kebab, but may surprise you.
     * Therefore, the value of plov increases satisfaction by a random number from 1 to 5.
     */
    public void plovP(View v) {
        int plov = new Random().nextInt(5 ) + 1;
        patrickKebabs = patrickKebabs + plov;
        satisfactionPatrick(patrickKebabs);
    }

    /**
     * Increase the regret score for Patrick by 1 and reduces satisfaction for Patrick by 1.
     */
    public void regretP(View v) {
        patrickRegrets = patrickRegrets + 1;
        patrickKebabs = patrickKebabs - 1;
        displayRegretP(patrickRegrets);
        satisfactionPatrick(patrickKebabs);
    }

    /**
     * Reset all scores
     */
    public void resetAll(View v) {
        christofferKebabs = 0;
        christofferRegrets = 0;
        satisfactionChristoffer(christofferKebabs);
        displayRegretC(christofferRegrets);
        patrickKebabs = 0;
        patrickRegrets = 0;
        satisfactionPatrick(patrickKebabs);
        displayRegretP(patrickRegrets);
    }

    /**
     * Getting robbed by police resets all satisfaction to zero, but carries over regrets.
     */

    public void robbedByPolice(View v) {
        christofferKebabs = 0;
        patrickKebabs = 0;
        satisfactionChristoffer(christofferKebabs);
        satisfactionPatrick(patrickKebabs);
    }
}
package com.example.android.quiz;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score;

    public void Results() {
        score = 0;
        RadioButton q1, q2 ,q3, q4, q5;
        q1 = findViewById(R.id.right_answer_Q1);
        q2 = findViewById(R.id.right_answer_Q2);
        q3 = findViewById(R.id.right_answer_Q3);
        q4 = findViewById(R.id.right_answer_Q4);
        q5 = findViewById(R.id.right_answer_Q5);

        CheckBox c1, c2, c3;
        c1 = findViewById(R.id.check_1);
        c2 = findViewById(R.id.check_2);
        c3 = findViewById(R.id.check_3);

        if (q1.isChecked()) {
            score++;
        }
        if (q2.isChecked()) {
            score++;
        }
        if (q3.isChecked()) {
            score++;
        }
        if (q4.isChecked()) {
            score++;
        }
        if (q5.isChecked()) {
            score++;
        }
        if (c1.isChecked() & c2.isChecked() & c3.isChecked()){
            score+=3;
        }
    }
    public String getName() {
        EditText name_input = (EditText) findViewById(R.id.name_input);
        String name = name_input.getText().toString();
        return name;
    }

    public void showToast(View view) {
        String name = getName();
        Results();
        Context context = getApplicationContext();
        CharSequence text ="Congratulations, " +name + " you got " +score +" points!!" ;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

package com.example.gillaniquizappforandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textViewQuestion;
    TextView textViewSummary;
    TextView textViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewQuestion = findViewById(R.id.testViewQuestion);
        textViewSummary = findViewById(R.id.textViewIntroduction);
        textViewAnswer = findViewById(R.id.textViewAnswer);
    }


    public void onRadioClick(View view) {


        switch (view.getId())
        {
            case R.id.radioButtonBerlin:

                textViewAnswer.setText("Correct");
                textViewAnswer.setTextColor(Color.rgb(34,139,34));
                break;
            default:
                textViewAnswer.setText("Incorrect");
                textViewAnswer.setTextColor(Color.RED);

        }
    }
}
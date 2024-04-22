package com.example.assignment1;

import android.R.layout;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button cityInfoButton;
    private Button startQuizButton;

      private ListView answerListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityInfoButton = findViewById(R.id.main_city);
        startQuizButton = findViewById(R.id.start_quiz_button);
        answerListView= findViewById(R.id.answer_list);




  if(Answers.getAllAnswers()!=null){

      List<String> result =Answers.getAllAnswers();
      String[] arr = result.toArray(new String[result.size()]);
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
              android.R.layout.simple_list_item_1, arr);
      answerListView.setAdapter(adapter);
  }

        cityInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CityInfoActivity.class);
                startActivity(intent);

            }
        });

        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);


            }
        });
    }
}
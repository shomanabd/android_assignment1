package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {


    List<Question> questionList;
    int currentQuestionIndex = 0;

    Double mark =0.0;

    TextView questionText;
    RadioGroup answerGroup;
    RadioButton trueOption, falseOption;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        questionText = findViewById(R.id.question_text);
        answerGroup = findViewById(R.id.answer_group);
        trueOption = findViewById(R.id.true_option);
        falseOption = findViewById(R.id.false_option);
        submitButton = findViewById(R.id.submit_button);


        questionList = new ArrayList<>();
        questionList.add(new Question("In 2017, the population of Jenin was about 50 thousand people?", true));
        questionList.add(new Question("Nablus is a Palestinian city in the West Bank, located about 49 kilometers (30 miles) south of Jerusalem.?", false));
        questionList.add(new Question("Ramallah is a Palestinian city in the central West Bank or Ramallah Bank, that serves as the de facto administrative capital of the State of Palestine?", true));
        questionList.add(new Question("Bethlehem is a Palestinian city located west of Jerusalem in the West Bank.?", false));
        questionList.add(new Question("jerusalem one of the oldest cities in the world, it is considered sacred to the three main Abrahamic religions – Judaism, Christianity and Islam.?", true));


        updateQuestion();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isCorrect = checkAnswer();
                if (isCorrect)
                    mark++;


                currentQuestionIndex++;
                if (currentQuestionIndex < questionList.size()) {
                    updateQuestion();
                } else {
                    Toast.makeText(QuizActivity.this, "Quiz Finished!", Toast.LENGTH_SHORT).show();


                    if(mark!=0)
                        mark/=5.0;

                    Answers.add(mark);


                    startActivity(new Intent(QuizActivity.this, MainActivity.class) );
                }
            }
        });
    }

    private void updateQuestion() {
        Question currentQuestion = questionList.get(currentQuestionIndex);
        questionText.setText(currentQuestion.getQuestionText());
        answerGroup.clearCheck();
    }

    private boolean checkAnswer() {
        Question currentQuestion = questionList.get(currentQuestionIndex);

        int selectedOptionId = answerGroup.getCheckedRadioButtonId();
        boolean userAnswer = (selectedOptionId == R.id.true_option);

        return userAnswer == currentQuestion.isCorrectAnswer();
    }



}

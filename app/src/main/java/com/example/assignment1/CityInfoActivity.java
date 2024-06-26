package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityInfoActivity extends AppCompatActivity {

    private ImageView cityImageView;
    private TextView cityNameTextView;
    private TextView cityInfoTextView;
    private Button prevButton;
    private Button nextButton;



    private String[] cityNames = {"Jenin", "Nablus", "Ramallah", "Bethlehem", "Jerusalem"};
    private String[] cityInfos; // Declare the array here

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_info);

        // Initialize cityInfos array
        cityInfos = new String[]{
                getString(R.string.jenin_info),
                getString(R.string.nablus_info),
                getString(R.string.ramallah_info),
                getString(R.string.bethlehem_info),
                getString(R.string.jerusalem_info)
        };

        cityImageView = findViewById(R.id.city_image_view);
        cityNameTextView = findViewById(R.id.city_name_text_view);
        cityInfoTextView = findViewById(R.id.city_info_text_view);
        prevButton = findViewById(R.id.prev_button);
        nextButton = findViewById(R.id.next_button);


        // Display initial city
        displayCity(currentIndex);
        prevButton.setEnabled(false);

// Set click listeners for navigation buttons
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentIndex > 0) {
                    currentIndex--;
                    displayCity(currentIndex);
                }


                nextButton.setText("Next");
                nextButton.setEnabled(true);


                if (currentIndex == 0) {
                    prevButton.setEnabled(false);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (currentIndex == cityNames.length -1) {
                    startActivity(new Intent(CityInfoActivity.this,MainActivity.class));
                }

                if (currentIndex < cityNames.length - 1) {
                    currentIndex++;
                    displayCity(currentIndex);
                }


                if (currentIndex == cityNames.length - 1) {

                    nextButton.setText("Finish");
                }




                prevButton.setEnabled(true);
            }
        });
    }

    private void displayCity(int index) {
        // Set city name and info
        cityNameTextView.setText(cityNames[index]);
        cityInfoTextView.setText(cityInfos[index]);

        // Set city image
        int imageResource = getResources().getIdentifier(cityNames[index].toLowerCase(), "drawable", getPackageName());
        cityImageView.setImageResource(imageResource);
    }
}

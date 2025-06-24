package com.example.foundersbase;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FoundersBrief extends AppCompatActivity {

    private ImageView founderImage;
    private TextView founderName;
    private TextView founderDescription;

    TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.founders_brief);

        // Initialize views
        founderImage = findViewById(R.id.founder_img);
        founderName = findViewById(R.id.founder_heading);
        founderDescription = findViewById(R.id.founder_desc);

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> finish());

        // Retrieve data passed from previous activity
        FounderDetails founder = (FounderDetails) getIntent().getSerializableExtra("founderData");

        if (founder != null) {
            founderImage.setImageResource(founder.getImgId());
            founderName.setText(founder.getName());
            founderDescription.setText(founder.getDesc());
        } else {
            founderName.setText("Founder not found");
            founderDescription.setText("No details available.");
        }
    }
}

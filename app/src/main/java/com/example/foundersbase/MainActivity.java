package com.example.foundersbase;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FounderDetails>founderDetailsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.founders_list);
        founderDetailsList = new ArrayList<>();
        founderDetailsList.add(new FounderDetails("Kutti Krishnan","Kutti Krishnan P C: Founded Bumberry to offer eco-friendly, reusable cloth diapers for babies in India.",R.drawable.bumberry));
        founderDetailsList.add(new FounderDetails("Andy Rubin","Andy Rubin: Co-founded Android Inc. to develop an open-source mobile OS, later acquired by Google.",R.drawable.android));
        founderDetailsList.add(new FounderDetails("Melanie Perkins","Melanie Perkins: Co-founded Canva to simplify graphic design for everyone through a user-friendly online platform.",R.drawable.canva));
        founderDetailsList.add(new FounderDetails("Mark Zuckerberg","Mark Zuckerberg: Launched Facebook from his Harvard dorm to connect people globally via social networking.",R.drawable.facebook));
        founderDetailsList.add(new FounderDetails("Kevin Systrom & Mike Krieger","Kevin Systrom & Mike Krieger: Built Instagram as a photo-sharing app focused on simplicity and beauty, later acquired by Facebook.",R.drawable.instagram));
        founderDetailsList.add(new FounderDetails("Reid Hoffman","Reid Hoffman: Founded LinkedIn to create a professional networking platform connecting job seekers and businesses.",R.drawable.linkedin));
        founderDetailsList.add(new FounderDetails("Jensen Huang","Jensen Huang: Co-founded NVIDIA to pioneer graphics processing technology and AI hardware innovation.",R.drawable.nvidia));
        founderDetailsList.add(new FounderDetails("Jack Dorsey","Jack Dorsey: Created Twitter as a microblogging platform for real-time sharing, later rebranded to X by Elon Musk.",R.drawable.twitterx));
        founderDetailsList.add(new FounderDetails("Bill Gates","Bill Gates: Launched Microsoft Windows to bring graphical user interfaces to personal computers worldwide.",R.drawable.windows));

        RVAdapter rvAdapter = new RVAdapter(this, founderDetailsList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(rvAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
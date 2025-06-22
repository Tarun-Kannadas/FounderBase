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
        founderDetailsList.add(new FounderDetails("Kutti Krishnan","Kutti Krishnan P C founded Bumberry in 2013 to introduce reusable cloth diapers to Indian families, aiming to reduce environmental waste caused by disposables. The brand focuses on eco-friendly, washable, and skin-safe diapering solutions that combine traditional practices with modern designs.",R.drawable.bumberry));
        founderDetailsList.add(new FounderDetails("Andy Rubin","Andy Rubin co-founded Android Inc. with the vision of creating a free, open-source mobile operating system that could power a wide range of devices. His work led to the development of the Android OS, which was later acquired by Google and became the world’s most widely used smartphone platform.",R.drawable.android));
        founderDetailsList.add(new FounderDetails("Melanie Perkins, Cliff Obrecht & Cameron Adams","Canva was co-founded by Melanie Perkins, Cliff Obrecht, and Cameron Adams to democratize design. Their intuitive web-based platform allows users with no prior graphic design experience to create stunning visuals, from presentations and posters to social media posts and more.",R.drawable.canva));
        founderDetailsList.add(new FounderDetails("Mark Zuckerberg","Mark Zuckerberg launched Facebook in 2004 from his Harvard dorm room as a social network for college students. It quickly grew into a global platform that redefined how billions of people connect, share, and communicate online.",R.drawable.facebook));
        founderDetailsList.add(new FounderDetails("Kevin Systrom & Mike Krieger","Kevin Systrom and Mike Krieger built Instagram to make mobile photo sharing fast, beautiful, and social. With its clean interface and powerful filters, it quickly became a cultural phenomenon before being acquired by Facebook in 2012.",R.drawable.instagram));
        founderDetailsList.add(new FounderDetails("Reid Hoffman","Reid Hoffman founded LinkedIn in 2002 to transform how professionals connect, network, and build careers online. The platform became the world’s largest professional networking site, helping millions find jobs, share insights, and grow professionally.",R.drawable.linkedin));
        founderDetailsList.add(new FounderDetails("Jensen Huang","Jensen Huang co-founded NVIDIA in 1993 with a focus on high-performance graphics processing. Under his leadership, NVIDIA became a pioneer in GPU technology and played a key role in revolutionizing fields like gaming, AI, and deep learning.",R.drawable.nvidia));
        founderDetailsList.add(new FounderDetails("Jack Dorsey, Biz Stone & Evan Williams","Originally conceived as a platform for sharing short status updates, Twitter was co-founded by Jack Dorsey, Biz Stone, and Evan Williams. It evolved into a real-time information network shaping news, culture, and public discourse — and was later rebranded to \"X\" under Elon Musk’s ownership.",R.drawable.twitterx));
        founderDetailsList.add(new FounderDetails("Bill Gates","Bill Gates, co-founder of Microsoft, introduced Windows as a graphical operating system to make personal computing more accessible. The platform revolutionized the software industry and became the backbone of PC computing for decades.",R.drawable.windows));
        founderDetailsList.add(new FounderDetails("Larry Page & Sergey Brin","Larry Page and Sergey Brin founded Google in 1998 as a research project at Stanford University. Their mission was to organize the world’s information and make it universally accessible. Today, Google powers billions of searches daily and is the foundation of one of the world’s largest tech ecosystems.",R.drawable.google));

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
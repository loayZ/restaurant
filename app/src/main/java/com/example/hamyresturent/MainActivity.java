package com.example.hamyresturent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
CardView startersCard;
CardView mainsCard;
CardView DessertsCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard=findViewById(R.id.cardview_Starters);
       mainsCard=findViewById(R.id.cardview_MainCourses);



        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent=new Intent(MainActivity.this, StarterActivity2.class);

                startActivity(startersActivityIntent);
            }
        });

mainsCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent mainCoursesActivity=new Intent(MainActivity.this, MainCourseActivity.class);

        startActivity(mainCoursesActivity);
    }
});
        TextView Emailsend;
        Emailsend=findViewById(R.id.EmailIntent);

        Emailsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SendEmail=new Intent(Intent.ACTION_SENDTO);
                SendEmail.setData(Uri.parse("mailto:"));
                startActivity(SendEmail);
            }
        });
        DessertsCard=findViewById(R.id.cardview_Desserts);

        DessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DessertActivityIntent=new Intent(MainActivity.this, Desserts.class);

                startActivity(DessertActivityIntent);
            }
        });


    }

}

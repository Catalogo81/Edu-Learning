package com.example.edu_learning.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.edu_learning.CourseDetails.CourseDetails;
import com.example.edu_learning.R;

public class Home extends AppCompatActivity {

    TextView tvChemistry, tvMaths, tvPhysics, tvEnglish, tvAccounting, tvFullName;
    ImageView ivLectureImageGuy;

    String name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvMaths = findViewById(R.id.tvMaths);
        tvChemistry = findViewById(R.id.tvChemistry);
        tvPhysics = findViewById(R.id.tvPhysics);
        tvEnglish = findViewById(R.id.tvEnglish);
        tvAccounting = findViewById(R.id.tvAccounting);
        ivLectureImageGuy = findViewById(R.id.ivLectureImageGuy);
        tvFullName = findViewById(R.id.tvFullName);

        //Retrieve data in the intent from other activity
        Intent intent_fullName = getIntent();
        name = intent_fullName.getStringExtra("name");
        surname = intent_fullName.getStringExtra("surname");
        tvFullName.setText(name + " " + surname);


        tvEnglish.setOnClickListener(view -> {
            Intent intent_english = new Intent(Home.this, CourseDetails.class);

            String english = "English";
            String lecture_course = "English HL Teacher";
            String lecture_name = "Thandeka Smith";
            String lecture_ratings = "545";
            intent_english.putExtra("english", english);
            intent_english.putExtra("lecture_course", lecture_course);
            intent_english.putExtra("lecture_name", lecture_name);
            intent_english.putExtra("lecture_ratings", lecture_ratings);

            startActivity(intent_english);
        });

        tvMaths.setOnClickListener(view -> {
            Intent intent_maths = new Intent(Home.this, CourseDetails.class);

            String maths = "Maths";
            String lecture_course = "Maths Teacher";
            String lecture_name = "Kgotso Williams";
            String lecture_ratings = "1456";
            intent_maths.putExtra("maths", maths);
            intent_maths.putExtra("lecture_course", lecture_course);
            intent_maths.putExtra("lecture_name", lecture_name);
            intent_maths.putExtra("lecture_ratings", lecture_ratings);

            startActivity(intent_maths);
        });

        tvChemistry.setOnClickListener(view -> {
            Intent intent_chemistry = new Intent(Home.this, CourseDetails.class);

            String chemistry = "Chemistry";
            String lecture_course = "Chemistry Teacher";
            String lecture_name = "Steven Lebese";
            String lecture_ratings = "1456";
            intent_chemistry.putExtra("chemistry", chemistry);
            intent_chemistry.putExtra("lecture_course", lecture_course);
            intent_chemistry.putExtra("lecture_name", lecture_name);
            intent_chemistry.putExtra("lecture_ratings", lecture_ratings);

            startActivity(intent_chemistry);
        });

        tvPhysics.setOnClickListener(view -> {
            Intent intent_physics = new Intent(Home.this, CourseDetails.class);

            String physics = "Physics";
            String lecture_course = "Physics Teacher";
            String lecture_name = "Nelly Merry";
            String lecture_ratings = "1456";
            intent_physics.putExtra("physics", physics);
            intent_physics.putExtra("lecture_course", lecture_course);
            intent_physics.putExtra("lecture_name", lecture_name);
            intent_physics.putExtra("lecture_ratings", lecture_ratings);

            startActivity(intent_physics);
        });

        tvAccounting.setOnClickListener(view -> {
            Intent intent_accounting = new Intent(Home.this, CourseDetails.class);

            String accounting = "Accounting";
            String lecture_course = "Accounting Teacher";
            String lecture_name = "Lebza Scott";
            String lecture_ratings = "1456";
            intent_accounting.putExtra("accounting", accounting);
            intent_accounting.putExtra("lecture_course", lecture_course);
            intent_accounting.putExtra("lecture_name", lecture_name);
            intent_accounting.putExtra("lecture_ratings", lecture_ratings);

            startActivity(intent_accounting);
        });
    }
}
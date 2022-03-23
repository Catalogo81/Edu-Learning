package com.example.edu_learning.CourseDetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.edu_learning.Home.Home;
import com.example.edu_learning.R;

public class CourseDetails extends AppCompatActivity {

    TextView tvCourseChosen, tvLectureName, tvLectureCourse, tvLectureRatings;
    ImageView ivLectureImage, ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        tvCourseChosen = findViewById(R.id.tvCourseChosen);
        tvLectureCourse = findViewById(R.id.tvLectureCourse);
        tvLectureName = findViewById(R.id.tvLectureName);
        tvLectureRatings = findViewById(R.id.tvLectureRatings);
        ivLectureImage = findViewById(R.id.ivLectureImage);
        ivBack = findViewById(R.id.ivBack);

        //Retrieve data in the intent from other activity
        Intent intent_english = getIntent();
        String english = intent_english.getStringExtra("english");


        Intent intent_maths = getIntent();
        String maths = intent_maths.getStringExtra("maths");

        Intent intent_physics = getIntent();
        String physics = intent_physics.getStringExtra("physics");

        Intent intent_accounting = getIntent();
        String accounting = intent_accounting.getStringExtra("accounting");

        Intent intent_chemistry = getIntent();
        String chemistry = intent_chemistry.getStringExtra("chemistry");


        if(english != null)
        {
            String lecture_course = intent_english.getStringExtra("lecture_course");
            String lecture_name = intent_english.getStringExtra("lecture_name");
            String lecture_ratings = intent_english.getStringExtra("lecture_ratings");

            tvCourseChosen.setText("Online course in " + english);
            tvLectureCourse.setText(lecture_course);
            tvLectureName.setText(lecture_name);
            tvLectureRatings.setText(lecture_ratings);
            ivLectureImage.setImageDrawable(getResources().getDrawable(R.drawable.teacher_girl));
        }
        else if(maths != null)
        {
            String lecture_course = intent_maths.getStringExtra("lecture_course");
            String lecture_name = intent_maths.getStringExtra("lecture_name");
            String lecture_ratings = intent_maths.getStringExtra("lecture_ratings");

            tvCourseChosen.setText("Online course in " + maths);
            tvLectureCourse.setText(lecture_course);
            tvLectureName.setText(lecture_name);
            tvLectureRatings.setText(lecture_ratings);
            ivLectureImage.setImageDrawable(getResources().getDrawable(R.drawable.teacher_guy));
        }
        else if(physics != null)
        {
            String lecture_course = intent_physics.getStringExtra("lecture_course");
            String lecture_name = intent_physics.getStringExtra("lecture_name");
            String lecture_ratings = intent_physics.getStringExtra("lecture_ratings");

            tvCourseChosen.setText("Online course in " + physics);
            tvLectureCourse.setText(lecture_course);
            tvLectureName.setText(lecture_name);
            tvLectureRatings.setText(lecture_ratings);
            ivLectureImage.setImageDrawable(getResources().getDrawable(R.drawable.teacher_girl));
        }
        else if(chemistry != null)
        {
            String lecture_course = intent_chemistry.getStringExtra("lecture_course");
            String lecture_name = intent_chemistry.getStringExtra("lecture_name");
            String lecture_ratings = intent_chemistry.getStringExtra("lecture_ratings");

            tvCourseChosen.setText("Online course in " + chemistry);
            tvLectureCourse.setText(lecture_course);
            tvLectureName.setText(lecture_name);
            tvLectureRatings.setText(lecture_ratings);
            ivLectureImage.setImageDrawable(getResources().getDrawable(R.drawable.teacher_girl));
        }
        else
        {
            String lecture_course = intent_accounting.getStringExtra("lecture_course");
            String lecture_name = intent_accounting.getStringExtra("lecture_name");
            String lecture_ratings = intent_accounting.getStringExtra("lecture_ratings");

            tvCourseChosen.setText("Online course in " + accounting);
            tvLectureCourse.setText(lecture_course);
            tvLectureName.setText(lecture_name);
            tvLectureRatings.setText(lecture_ratings);
            ivLectureImage.setImageDrawable(getResources().getDrawable(R.drawable.teacher_guy));
        }

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CourseDetails.this, Home.class));
                finish();
            }
        });

    }
}
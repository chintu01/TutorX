package com.sreyans.tutorx.Intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sreyans.tutorx.MainActivity;
import com.sreyans.tutorx.R;
import com.sreyans.tutorx.Student.StudentsHomeActivity;


public class StartActivity extends AppCompatActivity {
    Button teacherButton,studentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        studentButton = (Button) findViewById(R.id.studentbutton);
        teacherButton = (Button) findViewById(R.id.teacherbutton);

        //If not logged in for Students

        studentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,StudentsHomeActivity.class));
            }
        });

        //If not logged in for Teachers

        teacherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(StartActivity.this, TeacherLoginActivity.class));
            }
        });

        }

}

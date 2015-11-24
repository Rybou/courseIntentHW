package com.example.bourymbodj.courseintenthw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CourseInfo> courses = GetCourseInfos();
        final ListView lv1 = (ListView) findViewById(R.id.listView);
        lv1.setAdapter(new CustomBaseAdapter(this, courses));


        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                if (id == 0) {
                    Intent i = new Intent(getApplicationContext(), Mentor1.class);
                    startActivity(i);


                } else if (id == 1) {
                    Intent i = new Intent(getApplicationContext(), Mentor2.class);
                    startActivity(i);

                } else if (id == 2) {

                    Intent i = new Intent(getApplicationContext(), Mentor3.class);
                    startActivity(i);
                } else if (id == 3) {

                    Intent i = new Intent(getApplicationContext(), Mentor4.class);
                    startActivity(i);
                } else if (id == 4) {

                    Intent i = new Intent(getApplicationContext(), Mentor5.class);
                    startActivity(i);
                }


                //String item = ((TextView) view).getText().toString();

                //Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });

    }
    private ArrayList<CourseInfo> GetCourseInfos(){
        ArrayList<CourseInfo> results = new ArrayList<CourseInfo>();

        CourseInfo sr1 = new CourseInfo();
        sr1.setCourseName("Android");
        sr1.setMentor ("R.J");
        results.add(sr1);

        CourseInfo sr2 = new CourseInfo();
        sr2.setCourseName("FrontEnd Web development");
        sr2.setMentor("A M");
        results.add(sr2);

        CourseInfo sr3 = new CourseInfo();
        sr3.setCourseName("Full Stack Web Development");
        sr3.setMentor("R B");
        results.add(sr3);

        CourseInfo sr4 = new CourseInfo();
        sr4.setCourseName("Node JS");
        sr4.setMentor("B M");
        results.add(sr4);

        CourseInfo sr5 = new CourseInfo();
        sr5.setCourseName("Robotics");
        sr5.setMentor("L C");
        results.add(sr5);





        return results;
    }
}





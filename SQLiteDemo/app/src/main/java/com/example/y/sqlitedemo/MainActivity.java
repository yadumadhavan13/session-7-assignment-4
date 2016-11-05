package com.example.y.sqlitedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String[]  firstname, lastname,idnum;
    Students students;
    Dbhandler dbhandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbhandler = new Dbhandler(this);
        firstname = new String[]{"Rosmi", "Sanam", "Yadu", "Anoop", "Ashish"};
        lastname = new String[]{"Kurian","Kader","Madhavan","Nair","Kumar"};
        idnum = new String[]{"1","2","3","4","5"};
        textView = (TextView) findViewById(R.id.textview);

        insertvalue();
       loaddatafromarray();

    }

    public boolean insertvalue(){
        for(int i = 0;i < idnum.length;i++){
            students = new Students();
            students.setid("Id: ");
            students.setidnum(idnum[i]);
            students.setfirstname("First Name: ");
            students.setfirstnamevalue(firstname[i]);
            students.setlastname("Last Name: ");
            students.setlastnamevalue(lastname[i]);
            dbhandler.addvalues(students);

        }
        Log.e("Mainactivity","Values Inserted ");
        return true;

    }
    Boolean loaddatafromarray() {
        try {
            ArrayList array_list = dbhandler.databasetoarray();
            Log.e("student List Size ", String.valueOf(array_list.size()));

            if(!array_list.isEmpty()){

                StringBuilder stringBuilderFull,stringBuilderstudents;
                stringBuilderFull = new StringBuilder();


                for (int i=0;i<array_list.size();i++){
                    Students students1 = (Students) array_list.get(i);
                    stringBuilderstudents=  new StringBuilder()
                            .append(students1.getid())
                            .append(students1.getidnum()).append(" ,")
                            .append(students1.getfirstname())
                            .append(students1.getfirstnamevalue()).append(" ,")
                            .append(students1.getlastname())
                            .append(students1.getlastnamevalue())
                            .append("\n").append("\n");
                    stringBuilderFull.append(stringBuilderstudents);
                }

                textView.setText(stringBuilderFull);
                Log.e("MainActivity", "The Student List is displayed.");
            }else {
                Log.e("MainActivity", "No Students available.");
            }

            return true;
        } catch (Exception e) {
            Log.e("MainActivity"," Error is " + e.getLocalizedMessage());

            return false;
        }
    }





}


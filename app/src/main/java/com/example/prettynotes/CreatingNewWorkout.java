package com.example.prettynotes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.CheckBox;

public class CreatingNewWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_new_workout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("New Workout");
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            /*The workout can be saved if the following requisites are met:
            It has a title  -- Done!
            At least one of the days is checked -- TBD
            There is at least one exercise -- TBD*/



            if(((TextInputLayout)findViewById(R.id.workout_title)).getEditText().getText()
                    .toString().isEmpty())
                Snackbar.make(view, "Enter a title", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();

            if (!(((CheckBox)findViewById(R.id.checkbox_monday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_tuesday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_wednesday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_thursday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_friday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_saturday)).isChecked()
                    || ((CheckBox)findViewById(R.id.checkbox_sunday)).isChecked()

            ))
                Snackbar.make(view, "Check at least one day", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

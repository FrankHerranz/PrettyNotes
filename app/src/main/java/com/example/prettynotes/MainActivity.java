package com.example.prettynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar bottomAppBar = (BottomAppBar) findViewById(R.id.bar);
        setSupportActionBar(bottomAppBar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()) {
            case R.id.app_bar_search:
                Toast.makeText(this, "You have selected Search Menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.app_bar_settings:
                Toast.makeText(this, "You have selected Settings Menu", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void createNewWorkout(View view) {
        Intent intent = new Intent(this, CreatingNewWorkout.class);
        startActivity(intent);
    }

}

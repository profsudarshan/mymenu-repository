package com.example.mymenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(MainActivity.this);
        inflater.inflate(R.menu.option_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.bluetooth:
                Toast.makeText(this,item.getTitle()+" selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.file:
                Toast.makeText(this,item.getTitle()+" selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.edit:
                Toast.makeText(this,item.getTitle()+" selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.cut:
                Toast.makeText(this,item.getTitle()+"selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.copy:
                Toast.makeText(this,item.getTitle()+"selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.paste:
                Toast.makeText(this,item.getTitle()+"selected",Toast.LENGTH_LONG).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}

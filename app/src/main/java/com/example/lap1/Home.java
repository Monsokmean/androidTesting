package com.example.lap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //---------Toolbar
        ImageView leftIcon = findViewById(R.id.left_arrow_back_icon);
        ImageView rightIcon = findViewById(R.id.right_menu_icon);
        TextView title = findViewById(R.id.toolbar_title);
        //----Call class
        Intent intent = new Intent(Home.this, Home_with_navigation.class);
        //-----Menu toolbar-----

        leftIcon.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "You click on left icon", Toast.LENGTH_SHORT).show();
            }
        });
        rightIcon.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "You click on right icon", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        title.setText("username: admin");
    }
}
package com.example.lap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    int count= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView username = (TextView) findViewById(R.id.username);
//
//        TextView password = (TextView) findViewById(R.id.password);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        EditText confirm_password = (EditText) findViewById(R.id.confirm_password);
        CheckBox checkbox = (CheckBox) findViewById(R.id.check_show_password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);


        //Call another activity
        Intent intent = new Intent(MainActivity.this,Home.class);
        Intent wifi_animation_form = new Intent(MainActivity.this,Home_with_navigation.class);
        //startActivity(wifi_animation_form);

        //To Show or Hide password
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkbox.isChecked()){
                    password.setTransformationMethod(null);
                    confirm_password.setTransformationMethod(null);
                }else{
                    password.setTransformationMethod(new PasswordTransformationMethod());
                    confirm_password.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        //admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin") && confirm_password.getText().toString().equals("admin")){
                    //Correct login
                    username.getText().clear();
                    password.getText().clear();
                    confirm_password.getText().clear();
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else if(username.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Username is Required", Toast.LENGTH_SHORT).show();
                    username.setFocusable(true);
                }else if(password.getText().toString().equals("")){
                    password.setFocusable(true);
                    Toast.makeText(MainActivity.this, "Password is Required", Toast.LENGTH_SHORT).show();
                }else if(confirm_password.getText().toString().equals("")){
                    confirm_password.setFocusable(true);
                    Toast.makeText(MainActivity.this, "Confirm Password is Required", Toast.LENGTH_SHORT).show();
                }else if(!username.getText().toString().equals("admin") && !password.getText().toString().equals("admin") && !confirm_password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Wrong information", Toast.LENGTH_SHORT).show();
                    username.setFocusable(true);
                    count += 1;
                    if (count > 3){
                        System.exit(1);
                    }


                }
                else{//Incorrect login
                    username.setFocusable(true);
                    Toast.makeText(MainActivity.this,"LOGIN FAILED!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
//onChecboxClicked
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     EditText   editText1 = findViewById(R.id.email);
     EditText   editText2 = findViewById(R.id.passFild);
     Button  button = findViewById(R.id.btn_b);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (editText1.getText().toString().equals("Admin")  && editText2.getText().toString().equals("Admin")) {
                 button.setVisibility(View.GONE);
                 editText1.setVisibility(View.GONE);
                 editText2.setVisibility(View.GONE);
                 button.setVisibility(View.GONE);
                 editText1.setVisibility(View.GONE);
                 editText2.setVisibility(View.GONE);
                 Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_LONG).show();
             } else {
                 Toast.makeText(MainActivity.this, "Не правильный логин или пароль!", Toast.LENGTH_LONG).show();
             }
         }
     });

     editText1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (editText1.length()>0 || editText2.length()>0){
                 button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
             } else {
                 button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
             }
         }
     });
    }

}










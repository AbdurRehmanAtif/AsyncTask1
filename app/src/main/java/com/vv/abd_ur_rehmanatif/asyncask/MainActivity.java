package com.vv.abd_ur_rehmanatif.asyncask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    Button Btn;
    EditText Email;
    EditText Password;
   static ProgressBar progressBar;
    public static final String Tag = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Btn = (Button)findViewById(R.id.button);
        Email = (EditText)findViewById(R.id.Email);
        Password = (EditText)findViewById(R.id.Password);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

Btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

         Email.getText().toString();

        new CoustomAsyncClass(getApplicationContext() ,  Email.getText().toString() ,  Password.getText().toString() ).execute();

    }
});



    }

    public void ProgressbarMethid() {

        Log.d(Tag , "ProgressBar");

    }


}


  //new CoustomAsyncClass(getApplicationContext()).execute("pak", "Ind", "Aus", "Neitherland", "Nesdfdsitherland");
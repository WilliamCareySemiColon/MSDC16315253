package com.example.williamcarey.c16315253assignmentdt228;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    Button register, reset;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (Button)findViewById(R.id.register);
        register.setBackgroundColor(getResources().getColor(R.color.aqua));

        reset =  (Button)findViewById(R.id.reset);
        reset.setBackgroundColor(getResources().getColor(R.color.aqua));
    }
}

package com.example.williamcarey.c16315253assignmentdt228;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button register, reset;
    EditText [] textfields;
    int buttonColorSet, textFieldColorSet;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonColorSet = getColor(R.color.black);
        textFieldColorSet = getColor(R.color.white);

        textfields = new EditText[] {
                findViewById(R.id.name),
                findViewById(R.id.address1),
                findViewById(R.id.address2),
                findViewById(R.id.address3),
                findViewById(R.id.email),
                findViewById(R.id.username),
                findViewById(R.id.password)
        };

        for(EditText t: textfields)
        {
            t.setTextColor(textFieldColorSet);
        }

        register = (Button)findViewById(R.id.register);
        register.setBackgroundColor(buttonColorSet);
        register.setOnClickListener(this);

        reset =  (Button)findViewById(R.id.reset);
        reset.setBackgroundColor(buttonColorSet);
        reset.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == reset.getId())
        {
            for(EditText t: textfields)
            {
                t.setText("");
            }
            Toast.makeText(getApplicationContext(),
                    "Textfields have been reset",
                    Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "You have pressed the register button",
                    Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.williamcarey.c16315253assignmentdt228;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener
{

    //button variables to work with
    private Button register, reset;
    private EditText [] textfields;
    //colours to work with
    private int buttonColorSet, textFieldColorSet;

    //Person to get access to the person data
    public Person person;

    @Override
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
            person = new Person(textfields[0].getText().toString(),
                    textfields[1].getText().toString(),
                    textfields[2].getText().toString(),
                    textfields[3].getText().toString(),
                    textfields[4].getText().toString(),
                    textfields[5].getText().toString(),
                    textfields[6].getText().toString());

            Toast.makeText(getApplicationContext(),
                    "You have pressed the register button",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public class Person {

        private String name,address,username,email, password;
        //allow connection to the database
        private BackEndDatabase BEDB;

        //insertion of data into the database
        long newPerson;

        //register constructor
        public Person(String name, String address1, String address2,String address3,
                      String email,String username, String password )
        {
            //setting the fields to have data
            this.name = name;
            this.address = address1 + " " + address2 + " " + address3;
            this.username = username;
            this.email = email;
            this.password = password;

            BEDB = new BackEndDatabase(getApplicationContext());
            BEDB.open();

            newPerson = BEDB.insertPerson(this.username,this.password,this.name,
                    this.address,this.email);
        }
    }

    /*@Override
    public void onDestroy()
    {
        super.onDestroy();
    }*/
}

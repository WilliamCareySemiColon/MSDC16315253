package com.example.williamcarey.c16315253assignmentdt228;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;

public class home extends ListActivity {

    //buttons to do with this activity
    Button search, cancel, viewItemsBought, searchKeyWord;
    //Edittext to capture the data inside the searchbar
    EditText searchBar;

    //plumbing code to get the look of the layout
    private Cursor c;
    private String [] dbField;
    private int [] ids;
    private SimpleCursorAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}

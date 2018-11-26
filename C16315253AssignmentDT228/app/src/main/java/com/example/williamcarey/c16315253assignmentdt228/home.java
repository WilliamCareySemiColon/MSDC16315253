package com.example.williamcarey.c16315253assignmentdt228;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class home extends ListActivity {

    //buttons to do with this activity
    private Button search, cancel, viewItemsBought, searchKeyWord ;
    private Button [] buttons;
    //Edittext to capture the data inside the searchbar
    private EditText searchBar;
    //the dropdown menu
    Spinner dropdown;

    //ArrayList to store the products
    Product items;

    //plumbing code to get the look of the layout
    private Cursor c;
    private String [] dbField;
    private int [] ids;
    private SimpleCursorAdapter myAdapter;

    //colours to work with
    private int buttonColorSet, textFieldColorSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //setting the colours first
        buttonColorSet = getColor(R.color.black);
        textFieldColorSet = getColor(R.color.white);

        //setting the product first
        //items = new Product(getApplicationContext());
        //all the buttons in the horizontal layout
        search = findViewById(R.id.search);
        cancel = findViewById(R.id.cancel);
        viewItemsBought = findViewById(R.id.viewItemsBought);
        //the searchbar and the associated button
        searchBar = findViewById(R.id.searchBar);
        searchKeyWord = findViewById(R.id.SearchKeyWord);
        //linking the dropdown menu
        dropdown = findViewById(R.id.spinnerAccDetails);

        buttons = new Button[]{findViewById(R.id.search),findViewById(R.id.cancel),
                findViewById(R.id.viewItemsBought),findViewById(R.id.SearchKeyWord)};

        //changing all the colours to black
        for(Button b: buttons)
            b.setBackgroundColor(buttonColorSet);

        //displaying the listview
        dbField = new String[] {"name"};
        ids = new int[] {R.id.productname};
        //c = items.getAllProducts();
       // myAdapter = new SimpleCursorAdapter(this,R.layout.homerow,c,dbField,ids);
        //setListAdapter(myAdapter);
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        String selection = l.getItemAtPosition(position).toString();
        Toast.makeText(this, id + "", Toast.LENGTH_SHORT).show();
    }
}

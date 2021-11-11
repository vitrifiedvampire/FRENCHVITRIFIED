package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("one","un",R.drawable.number_one));
        words.add(new word("two","deux",R.drawable.number_two));
        words.add(new word("three","trois",R.drawable.number_three));
        words.add(new word("four","quatre",R.drawable.number_four));
        words.add(new word("five","cinq",R.drawable.number_five));
        words.add(new word("six","six",R.drawable.number_six));
        words.add(new word("seven","sept",R.drawable.number_seven));
        words.add(new word("eight","huit",R.drawable.number_eight));
        words.add(new word("nine","neuf",R.drawable.number_nine));
        words.add(new word("ten","dix",R.drawable.number_ten));

        //we are creating array adapter that contains a list of strings as data source
        //this refers to numbers activity
        //words= array list of word object
        wordAdapter adapter= new wordAdapter(this,words,R.color.category_numbers);
        //creating a list view
        //this refers to the numbers activity; ArrayAdapter<T> is a generic class, i.e T can be any datatype.
        ListView listview = (ListView)findViewById(R.id.list);
        //bind list view with the adapter
        listview.setAdapter(adapter);
       }

    }
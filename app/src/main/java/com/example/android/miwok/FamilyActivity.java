package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("my family","ma famille",R.drawable.family_older_brother));
        words.add(new word("son","un fils",R.drawable.family_son));
        words.add(new word("daughter","une fille",R.drawable.family_daughter));
        words.add(new word("husband","un mari",R.drawable.family_father));
        words.add(new word("wife","la femme",R.drawable.family_mother));
        words.add(new word("father","une mère",R.drawable.family_father));
        words.add(new word("mother","une mère",R.drawable.family_mother));
        words.add(new word("grandfather","un grand-père",R.drawable.family_grandfather));
        words.add(new word("grandmother","une grand-mère",R.drawable.family_grandmother));
        words.add(new word("uncle","un oncle",R.drawable.family_older_brother));
        words.add(new word("aunt","une tante",R.drawable.family_older_sister));

        //we are creating array adapter that contains a list of strings as data source
        //this refers to numbers activity
        //words= array list of word object
        wordAdapter adapter= new wordAdapter(this,words,R.color.category_family);
        //creating a list view
        //this refers to the numbers activity; ArrayAdapter<T> is a generic class, i.e T can be any datatype.
        ListView listview = (ListView)findViewById(R.id.list);
        //bind list view with the adapter
        listview.setAdapter(adapter);
    }
}
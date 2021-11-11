package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("white","blanc",R.drawable.color_white));
        words.add(new word("blue","bleu",R.drawable.blue));
        words.add(new word("yellow","jaune",R.drawable.color_mustard_yellow));
        words.add(new word("brown","marron",R.drawable.color_brown));
        words.add(new word("black","noir",R.drawable.color_black));
        words.add(new word("orange","orange",R.drawable.orange));
        words.add(new word("pink","rose",R.drawable.pink));
        words.add(new word("red","rouge",R.drawable.color_red));
        words.add(new word("green","vert",R.drawable.color_green));
        words.add(new word("gray","grise",R.drawable.color_gray));

        //we are creating array adapter that contains a list of strings as data source
        //this refers to numbers activity
        //words= array list of word object
        wordAdapter adapter= new wordAdapter(this,words,R.color.category_colors);
        //creating a list view
        //this refers to the numbers activity; ArrayAdapter<T> is a generic class, i.e T can be any datatype.
        ListView listview = (ListView)findViewById(R.id.list);
        //bind list view with the adapter
        listview.setAdapter(adapter);
    }

}
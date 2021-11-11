package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("Goodbye!","Au revoir!"));
        words.add(new word("Enjoy the meal!","Bon appétit!"));
        words.add(new word("Have a good trip!","Bon voyage!"));
        words.add(new word("It doesn't matter.","Ça ne fait rien."));
        words.add(new word("That's life! Such is life!","C'est la vie!"));
        words.add(new word("a feeling of having seen or experienced the present situation before","déjà vu"));
        words.add(new word("in a group; all together","en masse"));
        words.add(new word("on the way; during the course of a journey","en route"));
        words.add(new word("a full and healthy enjoyment of life","joie de vivre"));
        words.add(new word("of the highest class/quality","cordon bleu"));
        words.add(new word("Thank you very much.","Merci beaucoup."));

        //we are creating array adapter that contains a list of strings as data source
        //this refers to numbers activity
        //words= array list of word object
        wordAdapter adapter= new wordAdapter(this,words,R.color.category_phrases);
        //creating a list view
        //this refers to the numbers activity; ArrayAdapter<T> is a generic class, i.e T can be any datatype.
        ListView listview = (ListView)findViewById(R.id.list);
        //bind list view with the adapter
        listview.setAdapter(adapter);
    }
}
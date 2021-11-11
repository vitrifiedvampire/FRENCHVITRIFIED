package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to find view that has number
        TextView numbers=(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //to create a new intent to open numbers activity
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                //start th enew activity
                startActivity(intent);
            }
            });

                //to find view that has family
                TextView family=(TextView)findViewById(R.id.family);
             family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //to create a new intent to open family activity
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                //start th new activity
                startActivity(intent);
            }
            });
                //to find view that has phrases
                TextView phrase=(TextView)findViewById(R.id.phrases);
                phrase.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //to create a new intent to open phrase activity
                        Intent intent = new Intent(MainActivity.this, PhraseActivity.class);
                        //start th new activity
                        startActivity(intent);
                    }
                    });
                        //to find view that has color
                        TextView colors=(TextView)findViewById(R.id.colors);
                        colors.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View view) {
                                //to create a new intent to open color activity
                                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                                //start th new activity
                                startActivity(intent);

                            }

                            });
    }
                    }
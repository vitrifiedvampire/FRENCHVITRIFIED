package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
    private int colorId;
    public wordAdapter(Activity context, ArrayList<word>words,int colorIdpassed){
        super(context,0, words);
        colorId=colorIdpassed;
    }
    @NonNull
    @Override
    //gets called when list view wants to diplay certain items
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        if (listview == null) {
            // Layout inflator is used when there isnt a view. if  a view already exists the use findviewbyid
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_file, parent, false);
        }
        word currentword = getItem(position);
        //listview= convertview thus it will be able to find the "textviewlist"
        TextView  defaultText=(TextView) listview.findViewById(R.id.textviewList2);
        defaultText.setText(currentword.getDefaultTranslation());

        TextView frenchtext= (TextView) listview.findViewById(R.id.textviewlist);
        frenchtext.setText(currentword.getFrenchTranslation());

        ImageView imageView=(ImageView) listview.findViewById(R.id.imageview1);
        if(currentword.checkImage()) {
            imageView.setImageResource(currentword.getImgageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }
        View container= listview.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),colorId);
        container.setBackgroundColor(color);



        return listview;

    }
}
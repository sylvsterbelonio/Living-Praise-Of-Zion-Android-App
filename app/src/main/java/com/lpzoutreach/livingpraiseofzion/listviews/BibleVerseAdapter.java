package com.lpzoutreach.livingpraiseofzion.listviews;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lpzoutreach.livingpraiseofzion.HolyBible;
import com.lpzoutreach.livingpraiseofzion.R;

public class BibleVerseAdapter extends ArrayAdapter<String>{
    Context context;
    int[] logo;
    String[] title;
    String[] subTitle;
    public BibleVerseAdapter(Context context, int[] logos,  String[] titles, String[] subTitles) {
        super(context, R.layout.listview_list_bible_version, R.id.text_view_title_list_bible_verse, titles);
        this.context = context;
        this.logo = logos;
        this.title = titles;
        this.subTitle = subTitles;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View singItem = convertView;
        BibleVerseHolder holder = null;
        if(singItem==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singItem = layoutInflater.inflate(R.layout.listview_list_bible_version,parent,false);
            holder = new BibleVerseHolder(singItem);
            singItem.setTag(holder);
        }else
        {
            holder = (BibleVerseHolder) singItem.getTag();
        }


        holder.logo.setImageResource(logo[position]);
        holder.title.setText(title[position]);
        holder.subTitle.setText(subTitle[position]);


        singItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"HH" + title[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), HolyBible.class);
                Activity activity = (Activity) context;
                activity.startActivity(intent);

                activity.overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);


            }
        });




        return singItem;
    }
}

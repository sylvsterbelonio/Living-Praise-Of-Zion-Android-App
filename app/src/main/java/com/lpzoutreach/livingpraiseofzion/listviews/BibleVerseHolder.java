package com.lpzoutreach.livingpraiseofzion.listviews;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.lpzoutreach.livingpraiseofzion.R;
public class BibleVerseHolder {

    ImageView logo;
    TextView title;
    TextView subTitle;

    BibleVerseHolder(View v)
    {
        logo = v.findViewById(R.id.image_view_logo_list_bible_verse);
        title = v.findViewById(R.id.text_view_title_list_bible_verse);
        subTitle = v.findViewById(R.id.text_view_description_list_bible_verse);
    }


}

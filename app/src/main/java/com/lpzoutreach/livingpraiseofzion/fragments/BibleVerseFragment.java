package com.lpzoutreach.livingpraiseofzion.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lpzoutreach.livingpraiseofzion.R;
import com.lpzoutreach.livingpraiseofzion.listviews.BibleVerseAdapter;

public class BibleVerseFragment extends Fragment {

    private View view;
    private ListView lvBibleVerse;
    private int[] logo = {R.drawable.ic_icon_bible_cebuano,R.drawable.ic_icon_bible_cebuano,R.drawable.ic_icon_bible_cebuano};
    private String[] title = {"Holy Bible 1","Holy 2","Holy 3"};
    private String[] subTitle = {"sHoly Bible 1","sHoly 2","sHoly 3"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_bible_verse,container,false);
        lvBibleVerse = view.findViewById(R.id.lvBibleVerse);

        BibleVerseAdapter bibleVerseAdapter = new BibleVerseAdapter(getActivity(),logo,title,subTitle);
        lvBibleVerse.setAdapter(bibleVerseAdapter);




        return view;
    }
}

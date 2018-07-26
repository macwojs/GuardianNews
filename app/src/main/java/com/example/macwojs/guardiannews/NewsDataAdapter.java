package com.example.macwojs.guardiannews;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsDataAdapter extends ArrayAdapter<NewsData> {

    public NewsDataAdapter(Activity context, ArrayList<NewsData> NewData){
        super(context, 0, NewData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        NewsData currentNewData = getItem(position);

        //MAGNITUDE
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView autorTextView = (TextView) listItemView.findViewById(R.id.autor_text_view);
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_text_view);

        //TITLE
        String title = currentNewData.getmTitle();
        if (title.indexOf(" | ")>0){
            String[] textTitleAutor = title.split("\\|",2);
            titleTextView.setText(textTitleAutor[0]);
        } else {
            titleTextView.setText(title);
        }

        //AUTHOR
        autorTextView.setText(currentNewData.getmAutor());

        //TIME
        String timeData = currentNewData.getmTime();
        String[] textTimeData = timeData.split("T",2);
        dateTextView.setText(textTimeData[0]);
        timeTextView.setText(textTimeData[1].replace("Z",""));

        //SECTION
        sectionTextView.setText(currentNewData.getmSection());

        return listItemView;
    }
}


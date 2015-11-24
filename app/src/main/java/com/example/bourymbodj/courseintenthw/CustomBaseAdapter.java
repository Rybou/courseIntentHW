package com.example.bourymbodj.courseintenthw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bourymbodj on 15-11-24.
 */

public class CustomBaseAdapter extends BaseAdapter {
    private static ArrayList<CourseInfo> courseInfos;

    private LayoutInflater mInflater;

    public CustomBaseAdapter(Context context, ArrayList <CourseInfo> results) {
        courseInfos = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return courseInfos.size();
    }

    public Object getItem(int position) {
        return courseInfos.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_list_item, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.text1);
            holder.txtMentor = (TextView) convertView.findViewById(R.id.text2);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtName.setText(courseInfos.get(position).getCourseName());
        holder.txtMentor.setText(courseInfos.get(position).getMentor());

        return convertView;
    }

    static class ViewHolder {
        TextView txtName;
        TextView txtMentor;
    }
}



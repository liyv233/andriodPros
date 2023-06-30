package com.example.hellow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.hellow.New;
import com.example.hellow.R;

import java.util.List;


//public class NewsAdapter extends ArrayAdapter <New> {
//
//    private List<New> mNewsData;
//    private Context mContext;
//
//    private int resourceId;
//
//    public NewsAdapter(Context context, int resourceId, List<New> data) {
//        super(context, resourceId, data);
//        this.mContext = context;
//        this.mNewsData = data;
//        this.resourceId = resourceId;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        New news = getItem(position);
//        View view;
//
//        view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
//
//        TextView tvTitle = view.findViewById(R.id.tv_title);
//        TextView tvAuthor = view.findViewById(R.id.tv_subtitle);
//        ImageView ivImage = view.findViewById(R.id.iv_image);
//
//        tvTitle.setText(news.getTitle());
//        tvAuthor.setText(news.getAuthor());
//        ivImage.setImageResource(news.getImageId());
//        return view;
//    }
//}


public class NewsAdapter extends ArrayAdapter<New> implements ListAdapter {

    private List<New> mNewsData;
    private Context mContext;

    private int resourceId;

    public NewsAdapter(Context context, int resourceId, List<New> data) {
        super(context, resourceId, data);
        this.mContext = context;
        this.mNewsData = data;
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        New news = getItem(position);
        View view;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(resourceId, parent, false);
        } else {
            view = convertView;
        }

        TextView tvTitle = view.findViewById(R.id.tv_title);
        TextView tvAuthor = view.findViewById(R.id.tv_subtitle);
        ImageView ivImage = view.findViewById(R.id.iv_image);

        tvTitle.setText(news.getTitle());
        tvAuthor.setText(news.getAuthor());
        ivImage.setImageResource(news.getImageId());

        return view;
    }
}


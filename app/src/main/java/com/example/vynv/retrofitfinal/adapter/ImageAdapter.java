package com.example.vynv.retrofitfinal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vynv.retrofitfinal.Model.Image.Model;
import com.example.vynv.retrofitfinal.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/16/15.
 */
public class ImageAdapter extends ArrayAdapter<Model> {
    ImageLoader imageLoader;
    DisplayImageOptions options;
    private LayoutInflater mInflater;
    private List<Model> mModels;
    private Context mContext;

    public ImageAdapter(Context context, List<Model> model) {
        super(context, R.layout.item_list, model);
        mContext = context;
        mModels = model;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(mContext));
        options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .build();
        ViewHolder viewHolder;
        Model model = mModels.get(position);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_list, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.ivFlag = (ImageView) convertView.findViewById(R.id.ivImage);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(model.getTitle());
        imageLoader.displayImage(model.getImage(), viewHolder.ivFlag, options);
        return convertView;

    }


    public class ViewHolder {
        TextView title;
        ImageView ivFlag;
    }
}

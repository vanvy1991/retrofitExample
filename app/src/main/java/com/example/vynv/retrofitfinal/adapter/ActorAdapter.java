package com.example.vynv.retrofitfinal.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vynv.retrofitfinal.Model.Actor.ModelActors;
import com.example.vynv.retrofitfinal.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by vynv on 10/19/15.
 */
public class ActorAdapter extends BaseAdapter {
    ImageLoader imageLoader;
    DisplayImageOptions options;
    private LayoutInflater mInflaterActor;
    private ModelActors mModels;
    private Context mContext;

    public ActorAdapter(Context context, ModelActors models) {
        Log.d("xxx",""+models.getActors().size());
        mContext = context;
        mModels = models;
        mInflaterActor = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mModels.getActors().size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
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
        if (convertView == null) {
            convertView = mInflaterActor.inflate(R.layout.item_actor, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvDateOfBirth = (TextView) convertView.findViewById(R.id.tvDateOfBirth);
            viewHolder.tvHeight = (TextView) convertView.findViewById(R.id.tvHeight);
            viewHolder.tvCountry = (TextView) convertView.findViewById(R.id.tvCountry);
            viewHolder.tvDescriptionn = (TextView) convertView.findViewById(R.id.tvDescriptionn);
            viewHolder.tvSpouse = (TextView) convertView.findViewById(R.id.tvSpouse);
            viewHolder.tvChildren = (TextView) convertView.findViewById(R.id.tvChildren);
            viewHolder.ivImage = (ImageView) convertView.findViewById(R.id.ivImage);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
            viewHolder.tvName.setText(mModels.getActors().get(position).getName());
            viewHolder.tvDateOfBirth.setText(mModels.getActors().get(position).getDob());
            viewHolder.tvHeight.setText(mModels.getActors().get(position).getHeight());
            viewHolder.tvCountry.setText(mModels.getActors().get(position).getCountry());
            viewHolder.tvDescriptionn.setText(mModels.getActors().get(position).getDescription());
            viewHolder.tvSpouse.setText(mModels.getActors().get(position).getSpouse());
            viewHolder.tvChildren.setText(mModels.getActors().get(position).getChildren());
        imageLoader.displayImage(mModels.getActors().get(position).getImage(),viewHolder.ivImage,options);
        return convertView;
    }
    public class ViewHolder {
        TextView tvName;
        TextView tvDateOfBirth;
        TextView tvHeight;
        TextView tvCountry;
        TextView tvDescriptionn;
        TextView tvSpouse;
        TextView tvChildren;
        ImageView ivImage;
    }
}

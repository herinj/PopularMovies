package com.example.jariwher.popularmovies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jariwher on 10/7/2015.
 */
public class GridViewAdapter extends BaseAdapter {
    Context mContext;
    private List<Movie> items;

    public GridViewAdapter(Context context, List<Movie> items) {
        super();
        this.mContext = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
        } else {
            imageView = (ImageView) convertView;
        }
        Picasso.with(mContext)
                .load(items.get(position).getmPoster("w342"))
                .error(android.R.drawable.sym_def_app_icon)
                .into(imageView);

        return imageView;
    }
}

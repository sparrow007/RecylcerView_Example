package com.example.ankit.recylertut;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.ViewHolder> {
  private   LayoutInflater inflater;
    ArrayList<Data> data = null;
    public  RecyleAdapter(Context context, ArrayList<Data> list) {
        inflater = LayoutInflater.from(context);
        data = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.item_list, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Data current = data.get(position);
        holder.textView.setText(current.getTitle());
        holder.imageView.setBackgroundResource(current.getImage());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imaag);
            textView = (TextView) view.findViewById(R.id.textView);
        }
    }
}

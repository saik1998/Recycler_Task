package com.firstapp.addingripple_recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firstapp.addingripple_recyclerview.Model.HerioneModel;
import com.firstapp.addingripple_recyclerview.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class HeroineAdapter extends RecyclerView.Adapter<com.firstapp.addingripple_recyclerview.Adapter.HeroineAdapter.HeroineHolder> {
    Context context;
    List<HerioneModel> herioneModelList=new ArrayList<>();

    public HeroineAdapter(Context context,List<HerioneModel>herioneModelList){
        this.context=context;
        this.herioneModelList=herioneModelList;
    }

    @NonNull
    @Override
    public HeroineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_vertical,parent,false);
        return new HeroineHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroineAdapter.HeroineHolder holder, int position) {
        holder.textView.setText(herioneModelList.get(position).getName());
        holder.shapeableImageView.setImageResource(herioneModelList.get(position).getImage());


    }



    @Override
    public int getItemCount() {

        return herioneModelList.size();
    }

    public class HeroineHolder extends RecyclerView.ViewHolder {
        ShapeableImageView shapeableImageView;
        TextView textView;

        public HeroineHolder(@NonNull View itemView) {
            super(itemView);
            shapeableImageView=itemView.findViewById(R.id.picture_id);
            textView=itemView.findViewById(R.id.text_id);
        }
    }
}

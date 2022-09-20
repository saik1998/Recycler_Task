package com.firstapp.addingripple_recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firstapp.addingripple_recyclerview.Interface.OnItemClick;
import com.firstapp.addingripple_recyclerview.Model.HeroModel;
import com.firstapp.addingripple_recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<com.firstapp.addingripple_recyclerview.Adapter.HeroAdapter.HeroHolder> {
    Context context;
    List<HeroModel> heroModelList=new ArrayList<>();
    OnItemClick onItemClick;

    public HeroAdapter(Context context,List<HeroModel> heroModelList){
        this.context=context;
        this.heroModelList=heroModelList;
    }
    public HeroAdapter(Context context,List<HeroModel> userPojoList,OnItemClick onItemClick){
         this.context=context;
        this.heroModelList=heroModelList;
        this.onItemClick=onItemClick;

        }





    @NonNull
    @Override
    public HeroAdapter.HeroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_horizontal,parent,false);

        return new HeroHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroAdapter.HeroHolder holder, int position) {
        holder.heroname.setText(heroModelList.get(position).getHeroname());
        holder.heroage.setText(heroModelList.get(position).getHeroage());
        holder.heromoives.setText(heroModelList.get(position).getHeromoives());


    }

    @Override
    public int getItemCount() {
        return heroModelList.size();
    }

    public class HeroHolder extends RecyclerView.ViewHolder {
        TextView heroname,heroage,heromoives;
        public HeroHolder(@NonNull View itemView) {
            super(itemView);

            heroname=itemView.findViewById(R.id.txt_heroname);
            heroage=itemView.findViewById(R.id.txt_heroage);
            heromoives=itemView.findViewById(R.id.text_heromoive);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClick.onClick(getAdapterPosition());


                    Toast.makeText(context, ""+heroModelList.get(getAdapterPosition()).getHeroname(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}


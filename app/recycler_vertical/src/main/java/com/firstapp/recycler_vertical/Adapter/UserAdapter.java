package com.firstapp.recycler_vertical.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firstapp.recycler_vertical.Interface.OnItemClick;
import com.firstapp.recycler_vertical.Model.UserPojo;
import com.firstapp.recycler_vertical.R;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    Context context;
    List<UserPojo> userPojoList=new ArrayList<>();
    OnItemClick onItemClick;

    public UserAdapter(Context context,List<UserPojo> userPojoList){
        this.context=context;
        this.userPojoList=userPojoList;

    }
    public UserAdapter(Context context,List<UserPojo> userPojoList,OnItemClick onItemClick){
        this.context=context;
        this.userPojoList=userPojoList;
        this.onItemClick=onItemClick;

    }



    @NonNull
    @Override
    public UserAdapter.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_vertical,parent,false);

        return new UserHolder(root);

    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserHolder holder, int position) {
        holder.gamename.setText(userPojoList.get(position).getAnimalname());
        holder.gamecountry.setText(userPojoList.get(position).getAnimalage());
        holder.gamepeople.setText(userPojoList.get(position).getAnimalweight());


    }

    @Override
    public int getItemCount() {
        return userPojoList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        TextView gamename,gamecountry,gamepeople;
        public UserHolder(@NonNull View itemView){
            super(itemView);

            gamename=itemView.findViewById(R.id.txt_countryname);
            gamecountry=itemView.findViewById(R.id.txt_country);
            gamepeople=itemView.findViewById(R.id.text_countrypeople);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    onItemClick.Onclick(getAdapterPosition());


                }
            });

        }

    }
}

package com.firstapp.recycler_task.Adapter;

import static com.firstapp.recycler_task.R.id.*;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firstapp.recycler_task.Model.UserModel;
import com.firstapp.recycler_task.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    Context context;
    List<UserModel>userModelList=new ArrayList<>();

    public UserAdapter(Context context,List<UserModel>userModelList)
    {
        this.context=context;
        this.userModelList=userModelList;

    }


    @NonNull
    @Override
    public UserAdapter.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_horizental,parent,false);
        return new UserHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserHolder holder, int i) {


        holder.textView.setText(userModelList.get(i).getName());
        holder.shapeableImageView.setImageResource(userModelList.get(i).getImage());

    }

    @Override
    public int getItemCount() {

        return userModelList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder{
        ShapeableImageView shapeableImageView;
        TextView textView;
        public UserHolder(@NonNull View itemView)
        {
            super(itemView);
            shapeableImageView=itemView.findViewById(picture_id);
            textView=itemView.findViewById(text_id);

        }
    }
}

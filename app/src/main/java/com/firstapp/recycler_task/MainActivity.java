package com.firstapp.recycler_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.firstapp.recycler_task.Adapter.UserAdapter;
import com.firstapp.recycler_task.Interface.OnItemClick;
import com.firstapp.recycler_task.Model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClick{

    RecyclerView recyclerView_h;
    UserModel userModel;
    UserAdapter userAdapter;
    List<UserModel> userModelList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView_h = findViewById(R.id.recycler_h1);

            recyclerView_h.setHasFixedSize(true);


            recyclerView_h.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

            userAdapter = new UserAdapter(getApplicationContext(), userModelList);
            recyclerView_h.setAdapter(userAdapter);

            loadHorizontalMethod();
        }


    private void loadHorizontalMethod() {
        userModel=new UserModel(R.drawable.img,"User1");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_1,"User2");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_2,"User3");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_3,"User4");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img,"User1");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_1,"User2");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_2,"User3");
        userModelList.add(userModel);
        userModel=new UserModel(R.drawable.img_3,"User4");
        userModelList.add(userModel);

        userAdapter.notifyDataSetChanged();
    }


    @Override
    public void OnClick(int position) {
        Toast.makeText(this, ""+userModelList.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
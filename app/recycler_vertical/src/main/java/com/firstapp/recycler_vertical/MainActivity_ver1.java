package com.firstapp.recycler_vertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.firstapp.recycler_vertical.Adapter.UserAdapter;
import com.firstapp.recycler_vertical.Interface.OnItemClick;
import com.firstapp.recycler_vertical.Model.UserPojo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_ver1 extends AppCompatActivity implements OnItemClick {
    RecyclerView recyclerView_v;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();
    private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ver1);
        
        recyclerView_v=findViewById(R.id.recycler_v1);
        
        
        recyclerView_v.setHasFixedSize(true);
        
        
        
        recyclerView_v.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        
        
        userAdapter=new UserAdapter(getApplicationContext(),userPojoList);
        recyclerView_v.setAdapter(userAdapter);
        
        
        loadVerticalMethod();
        
    }

    private void loadVerticalMethod() {
        userPojo=new UserPojo(R.drawable.img,"VJ","30","70");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.img_1,"AVRM","30","70");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.img_2,"Ram","30","70");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.img_3,"Prabhas","40","70");
        userPojoList.add(userPojo);
        userPojo=new UserPojo(R.drawable.img_1,"VJ","30","70");
        userPojoList.add(userPojo);
//        userPojo=new UserPojo("Animal2","Age2","12");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("Animal3","Age3","10");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("Animal4","Age4","14");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("Animal1","Age1","11");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("animal2","Age","12");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("animal3","Age3","10");
//        userPojoList.add(userPojo);
//        userPojo=new UserPojo("animal4","Age4","14");
//        userPojoList.add(userPojo);
        
        userAdapter.notifyDataSetChanged();



    }

    @Override
    public void Onclick(int i) {

        Toast.makeText(this, "Please select one item ", Toast.LENGTH_SHORT).show();
        
    }
}
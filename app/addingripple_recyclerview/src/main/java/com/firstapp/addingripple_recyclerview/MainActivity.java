package com.firstapp.addingripple_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.firstapp.addingripple_recyclerview.Adapter.HeroAdapter;
import com.firstapp.addingripple_recyclerview.Adapter.HeroineAdapter;
import com.firstapp.addingripple_recyclerview.Interface.OnItemClick;
import com.firstapp.addingripple_recyclerview.Model.HerioneModel;
import com.firstapp.addingripple_recyclerview.Model.HeroModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    RecyclerView recyclerView_v1, recyclerView_v2, recyclerView_h1, recyclerView_h2;

    HeroModel heroModel;
    HeroAdapter heroAdapter;
    List<HeroModel> heroModelList = new ArrayList<>();

    HeroineAdapter heroineAdapter;
    HerioneModel herioneModel;
    List<HerioneModel> herioneModelList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            recyclerView_h1 = findViewById(R.id.recyler_h1);
            recyclerView_h2 = findViewById(R.id.recyler_h2);
            recyclerView_v1 = findViewById(R.id.recyler_v1);
            recyclerView_v2 = findViewById(R.id.recyler_v2);

            recyclerView_h1.setHasFixedSize(true);
            recyclerView_h2.setHasFixedSize(true);
            recyclerView_v1.setHasFixedSize(true);
            recyclerView_v2.setHasFixedSize(true);


            recyclerView_h1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recyclerView_h2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
            recyclerView_v1.setLayoutManager(new LinearLayoutManager(this));
            recyclerView_v2.setLayoutManager(new LinearLayoutManager(this));


            heroAdapter = new HeroAdapter(getApplicationContext(), heroModelList);
            recyclerView_h1.setAdapter(heroAdapter);
            recyclerView_h2.setAdapter(heroAdapter);


            heroineAdapter = new HeroineAdapter(getApplicationContext(), herioneModelList);
            recyclerView_v1.setAdapter(heroineAdapter);
            recyclerView_v2.setAdapter(heroineAdapter);


            loadHorizontalMethod();
            loadVerticalMethod();
        }

    private void loadVerticalMethod() {
        herioneModel = new HerioneModel(R.drawable.img_6, "Heroine1");
        herioneModelList.add(herioneModel);

        herioneModel = new HerioneModel(R.drawable.img_7, "Heroine2");
        herioneModelList.add(herioneModel);

        herioneModel = new HerioneModel(R.drawable.img_8, "Heroine3");
        herioneModelList.add(herioneModel);

        herioneModel = new HerioneModel(R.drawable.img_9, "Heroine4");
        herioneModelList.add(herioneModel);

        herioneModel = new HerioneModel(R.drawable.img_10, "Heroine5");
        herioneModelList.add(herioneModel);



        heroineAdapter.notifyDataSetChanged();
    }

    private void loadHorizontalMethod()
    {
        heroModel=new HeroModel(R.drawable.img_1,"AA","27","DJ");
        heroModelList.add(heroModel);
        heroModel=new HeroModel(R.drawable.img_2,"Vk","27","AR");
        heroModelList.add(heroModel);
        heroModel=new HeroModel(R.drawable.img_2,"NTR","27","RRR");
        heroModelList.add(heroModel);
        heroModel=new HeroModel(R.drawable.img_2,"Ram","27","RED");
        heroModelList.add(heroModel);
        heroModel=new HeroModel(R.drawable.img_2,"PRABHAS","27","SS");
        heroModelList.add(heroModel);


        heroAdapter.notifyDataSetChanged();


    }


    @Override
    public void onClick(int position) {
        Toast.makeText(this, ""+heroModelList.get(position).getHeroname(), Toast.LENGTH_SHORT).show();

    }



}

package com.example.bai1_chuc_nang_co_ban.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.bai1_chuc_nang_co_ban.Adapter.HourlyAdapter;
import com.example.bai1_chuc_nang_co_ban.Domains.Hourly;
import com.example.bai1_chuc_nang_co_ban.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState==null)
        {
            Log.e(TAG,"bug cua hao");
        }
        else {
            Log.e(TAG,"welcome to hotel");
        }

        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<Hourly> item = new ArrayList<>();

        item.add(new Hourly("10 pm",28,"cloudy"));
        item.add(new Hourly("11 pm",29,"sun"));
        item.add(new Hourly("12 pm",30,"wind"));
        item.add(new Hourly("1 pm",29,"rainy"));
        item.add(new Hourly("2 pm",27,"storm"));

        recyclerView=findViewById(R.id.view1);
        // recyclerview layoutmanager : hiển thị danh sách có thể cuộn
        // false : không thể đảo ngược thứ tự các phần tử trong recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly=new HourlyAdapter(item);
        recyclerView.setAdapter(adapterHourly);
    }
}
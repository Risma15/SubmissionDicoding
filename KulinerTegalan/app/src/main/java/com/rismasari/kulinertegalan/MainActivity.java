package com.rismasari.kulinertegalan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvkuliner;
    private ArrayList<Kuliner> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvkuliner = findViewById(R.id.rv_kuliner);
        rvkuliner.setHasFixedSize(true);

        list.addAll(DataKuliner.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvkuliner.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(list);
        rvkuliner.setAdapter(listKulinerAdapter);

        listKulinerAdapter.setOnItemClickCallback(new ListKulinerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kuliner data) {
                showSelectedKuliner(data);
            }
        });
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            setMode(item.getItemId());
            return super.onOptionsItemSelected(item);
        }
        public void setMode(int selectedMode) {
            switch (selectedMode) {
                case R.id.activity_main:
                    showRecyclerList();
                    break;
                case R.id.action_about:
                    Intent about = new Intent(MainActivity.this,About.class);
                    startActivity(about);

            }
        }


        private void showSelectedKuliner(Kuliner kuliner) {
            Intent detail = new Intent(MainActivity.this,DetailKuliner.class);
            detail.putExtra("KulinerImages", kuliner.getPhoto());
            detail.putExtra("KulinerNames", kuliner.getName());
            detail.putExtra("KulinerDetails", kuliner.getDetail());
            detail.putExtra("KulinerHarga", kuliner.getHarga());
            detail.putExtra("KulinerAlamat", kuliner.getAlamat());
            startActivity(detail);
        }
    }
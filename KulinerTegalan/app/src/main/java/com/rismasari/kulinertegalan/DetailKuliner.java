package com.rismasari.kulinertegalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailKuliner extends AppCompatActivity {
    Toolbar back;
    ImageView imagekuliner;
    TextView namekuliner, detailkuliner, hargakuliner, alamatkuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);

        imagekuliner = findViewById(R.id.img_item_photo);
        namekuliner = findViewById(R.id.tv_item_name);
        detailkuliner = findViewById(R.id.tv_item_detail);
        hargakuliner = findViewById(R.id.tv_item_harga);
        alamatkuliner = findViewById(R.id.tv_item_alamat);


        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("KulinerImages", 0);
        String nama = getIntent().getStringExtra("KulinerNames");
        String deskripsi = getIntent().getStringExtra("KulinerDetails");
        String Harga = getIntent().getStringExtra("KulinerHarga");
        String Alamat = getIntent().getStringExtra("KulinerAlamat");
        imagekuliner.setImageResource(photo);
        namekuliner.setText(nama);
        detailkuliner.setText(deskripsi);
        hargakuliner.setText(Harga);
        alamatkuliner.setText(Alamat);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}

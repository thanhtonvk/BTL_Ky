package com.example.shopdocau.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopdocau.R;

public class ManHinhChinhActivity extends AppCompatActivity {

    ImageButton btnMuaHang, btnGioHang, btnDangXuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
        btnMuaHang = findViewById(R.id.btnMua);
        btnGioHang = findViewById(R.id.btnGioHang);
        btnDangXuat = findViewById(R.id.btnDangXuat);
        btnMuaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TrangChuActivity.class));
            }
        });
        btnGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GioHangActivity.class));
            }
        });
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
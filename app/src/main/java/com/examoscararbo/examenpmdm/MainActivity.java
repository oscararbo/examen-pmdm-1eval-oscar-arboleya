package com.examoscararbo.examenpmdm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.examoscararbo.examenpmdm.databinding.ActivityMainBinding;


import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.examoscararbo.examenpmdm.ui.frmanager.Paginador;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);
    }
}
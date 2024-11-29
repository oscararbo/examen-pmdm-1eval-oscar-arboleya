package com.examoscararbo.examenpmdm.fr.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.examoscararbo.examenpmdm.R;
import com.examoscararbo.examenpmdm.databinding.ActivityMainBinding;
import com.examoscararbo.examenpmdm.ui.frmanager.Paginador;

public class Aficion_1 extends Fragment {

    private ActivityMainBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aficion_1, container, false);

        Button button_cambio = (Button)view.findViewById(R.id.button_cambio);

        button_cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Paginador paginador = new Paginador(this, getSupportFragmentManager());
                ViewPager viewPager = binding.viewPager;
                viewPager.setAdapter(paginador);
            }
        });

        return view;
    }
}
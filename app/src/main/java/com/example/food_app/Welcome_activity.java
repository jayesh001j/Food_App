package com.example.food_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.food_app.databinding.ActivityMainBinding;
import com.example.food_app.databinding.ActivityWelcomeBinding;

public class Welcome_activity extends AppCompatActivity {
    private ActivityWelcomeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonnextpage.setOnClickListener(v -> {
            Intent mainIntent = new Intent(Welcome_activity.this, SignUp_Activity.class);
            startActivity(mainIntent);

        });


    }

}
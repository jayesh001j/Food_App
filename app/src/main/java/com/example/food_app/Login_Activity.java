package com.example.food_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.food_app.databinding.ActivityLoginBinding;
import com.example.food_app.databinding.ActivitySignUpBinding;

public class Login_Activity extends AppCompatActivity {
    private com.example.food_app.databinding.ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button rectangle_1 = findViewById(R.id.rectangle_1);

        rectangle_1.setOnClickListener(v -> {
            Intent mainIntent = new Intent(Login_Activity.this, Home_Activity.class);
            startActivity(mainIntent);

        });

    }
}
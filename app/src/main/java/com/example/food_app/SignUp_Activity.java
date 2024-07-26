package com.example.food_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.food_app.databinding.ActivityMainBinding;
import com.example.food_app.databinding.ActivitySignUpBinding;

public class SignUp_Activity extends AppCompatActivity {
    private ActivitySignUpBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button sing_up = findViewById(R.id.sing_up);

        sing_up.setOnClickListener(v -> {
            Intent mainIntent = new Intent(SignUp_Activity.this, Login_Activity.class);
            startActivity(mainIntent);

        });

    }
}
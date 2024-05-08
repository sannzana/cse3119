package com.example.labtestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvShapeInfo;
    private TextView tvColorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShapeInfo = findViewById(R.id.tvShapeInfo);
        tvColorInfo = findViewById(R.id.tvColorInfo);

        // Shape buttons
        setupShapeButton(R.id.btnCreateCircle, new Circle("Circle", 5.0));
        setupShapeButton(R.id.btnCreateSquare, new Square("Square", 4.0));
        setupShapeButton(R.id.btnCreateTriangle, new Triangle("Triangle", 3.0, 4.0, 5.0));

        // Color buttons
        setupColorButton(R.id.btnRed, new Red());
        setupColorButton(R.id.btnBlue, new Blue());
        setupColorButton(R.id.btnGreen, new Green());

        Button btnNewAct = findViewById(R.id.buttonNewAct);
        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    private void setupShapeButton(int buttonId, Shape shape) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> displayShapeInfo(shape));
    }

    private void setupColorButton(int buttonId, Color color) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> displayColorInfo(color));
    }

    private void displayShapeInfo(Shape shape) {
        String info = "Shape: " + shape.name;
        tvShapeInfo.setText(info);
    }

    private void displayColorInfo(Color color) {
        String info = "Selected Color: " + color.name;
        tvColorInfo.setText(info);
    }
}
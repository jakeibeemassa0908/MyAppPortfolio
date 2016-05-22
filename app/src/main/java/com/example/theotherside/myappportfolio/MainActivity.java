package com.example.theotherside.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button popular_movies = (Button)findViewById(R.id.popular_movies_button);
        Button stock = (Button)findViewById(R.id.stock_hawk_button);
        Button build_bigger = (Button) findViewById(R.id.build_it_bigger_button);
        Button make_material = (Button) findViewById(R.id.make_material_button);
        Button go_ubiquitous = (Button) findViewById(R.id.go_ubiquitous_button);
        Button capstone = (Button) findViewById(R.id.capstone_button);


        popular_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.popular_movies, Toast.LENGTH_SHORT).show();
            }
        });

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.stock_hawk,Toast.LENGTH_SHORT).show();
            }
        });

        build_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.build_it_bigger,Toast.LENGTH_SHORT).show();
            }
        });

        make_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.make_material,Toast.LENGTH_SHORT).show();
            }
        });

        go_ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.go_ubiquitous,Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.capstone,Toast.LENGTH_SHORT).show();
            }
        });


    }
}

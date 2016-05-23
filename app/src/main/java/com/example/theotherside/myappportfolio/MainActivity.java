package com.example.theotherside.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button popular_movies,stock,build_bigger,make_material,go_ubiquitous,capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        popular_movies = (Button)findViewById(R.id.popular_movies_button);
        stock = (Button)findViewById(R.id.stock_hawk_button);
        build_bigger = (Button) findViewById(R.id.build_it_bigger_button);
        make_material = (Button) findViewById(R.id.make_material_button);
        go_ubiquitous = (Button) findViewById(R.id.go_ubiquitous_button);
        capstone = (Button) findViewById(R.id.capstone_button);

        popular_movies.setOnClickListener(this);
        stock.setOnClickListener(this);
        build_bigger.setOnClickListener(this);
        make_material.setOnClickListener(this);
        go_ubiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        String buttonText = ((Button)v).getText().toString();
        Toast.makeText(this,buttonText + " selected",Toast.LENGTH_SHORT).show();
    }
}

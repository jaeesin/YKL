package com.example.salenews;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class credits extends AppCompatActivity {

    ImageButton kbs;
    ImageButton ljs;
    ImageButton ysi;
    Button goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        goBack = findViewById(R.id.goback);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        kbs = findViewById(R.id.kbs);
        kbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tokbsgithub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/beomssoo"));
                startActivity(tokbsgithub);
            }
        });

        ljs = findViewById(R.id.ljs);
        ljs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toljsgithub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jaeesin"));
                startActivity(toljsgithub);
            }
        });

        ysi = findViewById(R.id.ysi);
        ysi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toysigithub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/liqurt"));
                startActivity(toysigithub);
            }
        });
    }
}

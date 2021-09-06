package com.example.megeb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembersOnly extends AppCompatActivity {
Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members_only);
        open = (Button) findViewById(R.id.start);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st();
            }
        });
    }
    public void st() {
        Intent i = new Intent(this, front.class);
        startActivity(i);
    }
}
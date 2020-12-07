package com.pavan.androidmodulelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplayActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);
        String s=getIntent().getStringExtra("jokestring");
        textView=findViewById(R.id.androidtextview);
        textView.setText(s);
    }
}

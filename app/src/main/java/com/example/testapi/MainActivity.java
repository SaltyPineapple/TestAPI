package com.example.testapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    API api = new API();
    EditText et_word;
    Button bt_test;

    String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_word = findViewById(R.id.et_word);
        bt_test = findViewById(R.id.bt_apitest);


    }

    public void apiTestWord(View view) {
        word = et_word.getText().toString();

        // initialize request queue and URL
        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String requestURL = String.format("https://wordsapiv1.p.rapidapi.com/words/%s",word);

//        JsonObjectRequest jsonObjectRequest


        api.isWord(word);
    }
}
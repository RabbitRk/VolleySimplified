package com.jikook.volleysimplified;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rabbitt.simplyvolley.ServerCallback;
import com.rabbitt.simplyvolley.VolleyAdapter;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, String> map = new HashMap<>();
        //..Put your Hashmap values here.


        //GetData method will get the data from the particular url
        new VolleyAdapter(this).getData(Config.URL, new ServerCallback() {
            @Override
            public void onSuccess(String result) {
                //result can be converted in to the JSONarray
                //using JSONObject we can parse the data from the JSONarray
            }

            @Override
            public void onError(String result) {

            }
        });

        //Overloaded getdata method can be used to get the data by sending
        //quering values in the Hashmap
        new VolleyAdapter(this).getData(map, Config.URL, new ServerCallback() {
            @Override
            public void onSuccess(String result) {
                //result can be converted in to the JSONarray
                //using JSONObject we can parse the data from the JSONarray
            }

            @Override
            public void onError(String result) {

            }
        });

        new VolleyAdapter(this).insertData(map, Config.URL, new ServerCallback() {
            @Override
            public void onSuccess(String result) {
                //result can be converted in to the JSONarray
                //using JSONObject we can parse the data from the JSONarray
            }

            @Override
            public void onError(String result) {

            }
        });



    }
}

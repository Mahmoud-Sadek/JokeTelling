package com.sadek.apps.joketeller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public void launchJokeActivity(View view) {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        endpointsAsyncTask.execute();
    }*/


    public void tellJoke(View view) {
//        Toast.makeText(this, JokeProvider.getJoke(), Toast.LENGTH_SHORT).show();
    }


}

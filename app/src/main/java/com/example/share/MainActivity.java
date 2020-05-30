package com.example.share;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View v){

        Intent sharingintent=new Intent(Intent.ACTION_SEND);
        sharingintent.putExtra(Intent.EXTRA_TEXT, "Check out the App at: https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically");
        sharingintent.setType("text/plain");
        startActivity(Intent.createChooser(sharingintent,"Share Using"));
    }
}

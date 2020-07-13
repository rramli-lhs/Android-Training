package com.example.uberclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.LogInCallback;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    Switch userTypeSwitch;

    public void getStarted(View view){

        userTypeSwitch = (Switch) findViewById(R.id.userTypeSwitch);

        Log.i("test","Test");
        Log.i("Switch value", String.valueOf(userTypeSwitch.isChecked()));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        if (ParseUser.getCurrentUser() == null){

            ParseAnonymousUtils.logIn(new LogInCallback() {
                @Override
                public void done(ParseUser user, ParseException e) {

                    if(e == null){

                        Log.i("Info", "Anonymous Login Successful");

                    } else {

                        Log.i("Info", "Anonymous login failed");

                    }

                }
            });

        }

        setContentView(R.layout.activity_main);
    }
}
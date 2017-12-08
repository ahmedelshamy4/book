package com.eslamelhoseiny.bookstore.activities;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eslamelhoseiny.bookstore.R;
import com.eslamelhoseiny.bookstore.util.ActivityLauncher;
import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //wait 3000 mSecs  --------------------------------
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(FirebaseAuth.getInstance().getCurrentUser() == null){
                    ActivityLauncher.openLoginActivity(SplashActivity.this);
                }else{
                    ActivityLauncher.openMyBooksActivity(SplashActivity.this);
                }
                finish();
            }
        }, 3000);

        //end---------------------------



    }
}

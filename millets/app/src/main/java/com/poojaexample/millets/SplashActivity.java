
package com.poojaexample.millets;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Runnable {
    Thread splashTread;
    TextView tv,tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();

        Animation a = AnimationUtils.loadAnimation(this, R.anim.translate);
        a.reset();
        tv = (TextView) findViewById(R.id.t1);
        tv.clearAnimation();
        tv.startAnimation(a);


        Animation a1 = AnimationUtils.loadAnimation(this, R.anim.translate1);
        a1.reset();
        tv1 = (TextView) findViewById(R.id.t2);
        tv1.clearAnimation();
        tv1.startAnimation(a1);



        Animation a3 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a3.reset();
        ImageView v=(ImageView)findViewById(R.id.Image_app) ;
        v.clearAnimation();
        v.startAnimation(a3);


        Animation a4 = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        a4.reset();
        tv2 = (TextView) findViewById(R.id.text_t3);
        tv2.clearAnimation();
        tv2.startAnimation(a4);


        Animation a5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a5.reset();
        a5.setStartOffset(2000);
        tv3 = (TextView) findViewById(R.id.text_t3);
        tv3.clearAnimation();
        tv3.startAnimation(a5);

        Animation a6 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        a6.reset();
        a6.setStartOffset(3000);
        tv4 = (TextView) findViewById(R.id.t4);
        tv4.clearAnimation();
        tv4.startAnimation(a6);


        Handler handle=new Handler();
        handle.postDelayed(this,8000);

}

    @Override
    public void run() {

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}




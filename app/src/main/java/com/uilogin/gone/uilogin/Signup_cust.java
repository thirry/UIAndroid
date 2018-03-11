package com.uilogin.gone.uilogin;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Signup_cust extends AppCompatActivity {

    ImageView imgClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_customer);
//        init();

        imgClick = (ImageView)findViewById(R.id.img_back);

        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent redirect = new Intent(Signup_cust.this, Home.class);
                startActivity(redirect);

            }
        });
    }
}

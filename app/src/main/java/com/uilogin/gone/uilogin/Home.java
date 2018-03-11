package com.uilogin.gone.uilogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    public TextView tv_createaccount;

    public void init(){
        tv_createaccount = (TextView)findViewById(R.id.tv_createaccount);
        tv_createaccount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){

                Intent redirect = new Intent(Home.this, Signup_cust.class);
                startActivity(redirect);

            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        init();
    }
}

package com.example.rizkywiddie.mrhead;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvHello,tvBeard,tvBody,tvEyebrow,tvEyes,tvHair,tvMoustache;
    private ImageView ivBeard,ivBody,ivEyebrow,ivEyes,ivHair,ivMoustache;
    private CheckBox cbBeard,cbBody,cbEyebrow,cbEyes,cbHair,cbMoustache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.tvHello = (TextView) findViewById(R.id.tvHello);
        this.tvBeard = (TextView) findViewById(R.id.tvBeard);
        this.tvBody = (TextView) findViewById(R.id.tvBody);
        this.tvEyebrow = (TextView) findViewById(R.id.tvEyebrow);
        this.tvEyes = (TextView) findViewById(R.id.tvEyes);
        this.tvHair = (TextView) findViewById(R.id.tvHair);
        this.tvMoustache = (TextView) findViewById(R.id.tvMoustache);
        this.ivBeard = (ImageView) findViewById(R.id.ivBeard);
        this.ivBody = (ImageView) findViewById(R.id.ivBody);
        this.ivEyebrow = (ImageView) findViewById(R.id.ivEyebrow);
        this.ivEyes = (ImageView) findViewById(R.id.ivEyes);
        this.ivHair = (ImageView) findViewById(R.id.ivHair);
        this.ivMoustache = (ImageView) findViewById(R.id.ivMoustache);
        this.cbBeard = (CheckBox) findViewById(R.id.cbBeard);
        this.cbBody = (CheckBox) findViewById(R.id.cbBody);
        this.cbEyebrow = (CheckBox) findViewById(R.id.cbEyebrow);
        this.cbEyes = (CheckBox) findViewById(R.id.cbEyes);
        this.cbHair = (CheckBox) findViewById(R.id.cbHair);
        this.cbMoustache = (CheckBox) findViewById(R.id.cbMoustache);

        this.cbHair.setOnClickListener(this);
        this.cbBody.setOnClickListener(this);
        this.cbMoustache.setOnClickListener(this);
        this.cbBeard.setOnClickListener(this);
        this.cbEyebrow.setOnClickListener(this);
        this.cbEyes.setOnClickListener(this);

    }

    @Override
    public void onClick (View view){
        switch(view.getId()) {
            case R.id.cbBody:
                if(cbBody.isChecked())
                {
                    ivBody.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivBody.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.cbHair:
                if(cbHair.isChecked())
                {
                    ivHair.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivHair.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.cbMoustache:
                if(cbMoustache.isChecked())
                {
                    ivMoustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivMoustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.cbEyes:
                if(cbEyes.isChecked())
                {
                    ivEyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivEyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.cbEyebrow:
                if(cbEyebrow.isChecked())
                {
                    ivEyebrow.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivEyebrow.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.cbBeard:
                if(cbBeard.isChecked())
                {
                    ivBeard.setVisibility(View.VISIBLE);
                }
                else
                {
                    ivBeard.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}

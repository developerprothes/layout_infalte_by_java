package com.prothes.layoutinfaltewithjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private AppCompatButton btnNo1,btnNo2,btnNo3;
    private LayoutInflater layoutInflater;
    private TextView bangladeshTitle,bangladeshDetails,prothesDetails,prothesTitle;
    private ImageView bangladeshImg,prothesImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setStatusBarColor(getColor(R.color.sky));
        this.getWindow().setNavigationBarColor(getColor(R.color.sky));
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);
        btnNo1 = findViewById(R.id.btnNo1);
        btnNo2 = findViewById(R.id.btnNo2);
        btnNo3 = findViewById(R.id.btnNo3);
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.about_bangladesh,linearLayout,false);
        View view2 = layoutInflater.inflate(R.layout.about_prothes,linearLayout,false);

        /* যে সকল ডিজাইন সরাসরি activity_main layout এর মাঝে নেই
        LayoutInflater এর মাধ্যমে আনা হয়েছে তাদের মধ্যে কোন Specefiq Design নিয়ে কাজ কতে চাইলে
        তাদের পরিচয় সবসময় LayoutInflater পরিচয় করানোর পরেই করতে হবে কারন এটিই সঠিক ও নির্ভুল নিয়ম */

        bangladeshTitle = view1.findViewById(R.id.bangladeshTitle);
        bangladeshDetails = view1.findViewById(R.id.bangladeshDetails);
        bangladeshImg = view1.findViewById(R.id.bangladeshImg);
        prothesTitle = view2.findViewById(R.id.prothesTitle);
        prothesDetails = view2.findViewById(R.id.prothesDetails);
        prothesImg = view2.findViewById(R.id.prothesImg);


        bangladeshImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNo1.setText("My Country");
            }
        });
        prothesImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNo2.setText("Software Enginner");
            }
        });


        btnNo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViewsInLayout();
                linearLayout.addView(view1);
                
                btnNo1.setText(getString(R.string.bd_title));
                btnNo2.setText(getString(R.string.prothes_title));
            }
        });


        btnNo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViewsInLayout();
                linearLayout.addView(view2);

                btnNo2.setText(getString(R.string.prothes_title));
                btnNo1.setText(getString(R.string.bd_title));
            }
        });


        btnNo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViewsInLayout();

                btnNo2.setText(getString(R.string.prothes_title));
                btnNo1.setText(getString(R.string.bd_title));
            }
        });


    }


}
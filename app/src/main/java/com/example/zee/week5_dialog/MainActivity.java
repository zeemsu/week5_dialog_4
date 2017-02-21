package com.example.zee.week5_dialog;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
public class MainActivity extends AppCompatActivity {

    LinearLayout rootLayout;
    int numOfVeiws=10;
    Configuration configuration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configuration=getResources().getConfiguration();
        rootLayout=(LinearLayout)findViewById(R.id.activity_main);
        ScrollView sv=new ScrollView(this);
        LinearLayout subLayer= new LinearLayout(this);

        if(configuration.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            subLayer.setOrientation(LinearLayout.HORIZONTAL);
        }
        else
        {
            subLayer.setOrientation(LinearLayout.VERTICAL);
        }
        subLayer.setOrientation(LinearLayout.VERTICAL);
        for(int i=0;i<numOfVeiws;i++)
        {
            Button btn=new Button(this);
            btn.setText("Btn "+i);
            btn.setWidth(20);
            btn.setHeight(10);
            subLayer.addView(btn);
        }
        sv.addView(subLayer);
    rootLayout.addView(sv);

    }

}

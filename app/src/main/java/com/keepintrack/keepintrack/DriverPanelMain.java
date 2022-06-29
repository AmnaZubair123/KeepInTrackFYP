package com.keepintrack.keepintrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DriverPanelMain extends AppCompatActivity {
    TextView txt1, txt2, txt3;
    ImageView imageView11,imageView,img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_panel_main);
        imageView11=findViewById(R.id.imageView11);
        imageView=findViewById(R.id.imageView10);
        img=findViewById(R.id.imageView5);
        txt2=findViewById(R.id.Currentlocation);
        txt3=findViewById(R.id.whereto);
        txt1=findViewById(R.id.hellotext);
        btn=findViewById(R.id.signout);


        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });
    }

}

package com.keepintrack.keepintrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoleSelectionUrdu extends AppCompatActivity {

    Button btn1,btn2, btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection_urdu);
        btn1=findViewById(R.id.manager);
        btn2=findViewById(R.id.driver);
        btn3=findViewById(R.id.vendor);
        btn4=findViewById(R.id.organization);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ManagerSignInUrdu.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),DriverSignInUrdu.class);
                startActivity(intent);
            }
        });
    }
}
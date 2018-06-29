package com.example.admin.carcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Show3Activity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show3);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShow2Activity();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShow4Activity();
            }
        });

    }

    public void openShow2Activity(){
        Intent intent = new Intent(this, Show2Activity.class);
        startActivity(intent);
    }

    public void openShow4Activity(){
        Intent intent = new Intent(this, Show4Activity.class);
        startActivity(intent);
    }

}

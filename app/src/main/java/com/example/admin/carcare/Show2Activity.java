package com.example.admin.carcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Show2Activity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShowActivity();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShow3Activity();
            }
        });
    }

    public void openShowActivity(){
        Intent intent = new Intent(this, ShowActivity.class);
        startActivity(intent);
    }

    public void openShow3Activity(){
        Intent intent = new Intent(this, Show3Activity.class);
        startActivity(intent);
    }
}

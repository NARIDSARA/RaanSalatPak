package com.naridsara.raansalatpak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


import com.adedom.library.Dru;

public class MainActivity extends AppCompatActivity {

    private TextView textviewA;
    private TextView textviewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ConnectDB.getConnection() != null) {
            Dru.failed(getBaseContext());
        } else {
            Dru.completed(getBaseContext());
        }

        textviewA = (TextView) findViewById(R.id.textViewA);
        textviewB = (TextView) findViewById(R.id.textViewB);

        textviewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, new AFragment())
                        .commit();
            }
        });

        textviewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, new BFragment())
                        .commit();
            }
        });
    }

}
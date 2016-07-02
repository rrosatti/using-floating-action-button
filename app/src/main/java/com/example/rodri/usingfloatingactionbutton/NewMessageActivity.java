package com.example.rodri.usingfloatingactionbutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by rodri on 7/2/2016.
 */
public class NewMessageActivity extends AppCompatActivity {

    private ImageButton imgCustomFAB;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_message);

        imgCustomFAB = (ImageButton) findViewById(R.id.imgCustomFAB);
        imgCustomFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(android.R.id.content), "Using Floating Action Button!", Snackbar.LENGTH_LONG)
                        .setAction("Got it!", onClickListener)
                        .setActionTextColor(Color.YELLOW)
                        .show();
            }
        });

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It worked!", Toast.LENGTH_SHORT).show();
            }
        };

    }
}

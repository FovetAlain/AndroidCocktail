package com.example.alex.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Alex on 26/02/2018.
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_details);
        overridePendingTransition(
                android.R.anim.slide_in_left,android.R.anim.slide_out_right
        );
        Button button5 = findViewById(R.id.button5);

        TextView detailsTextView = findViewById(R.id.textView_details);
        detailsTextView.setText(getIntent().getExtras().getString("ref"));

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

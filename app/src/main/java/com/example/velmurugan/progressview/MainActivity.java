package com.example.velmurugan.progressview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements UpdatePercentage {

    private TextView scrollPercentage;
    private ProgressView progressView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressView = (ProgressView) findViewById(R.id.progressView);
        scrollPercentage = (TextView) findViewById(R.id.scrollPercentage);
    }

    @Override
    public void updatePercentage(float percentage) {
        scrollPercentage.setText("Percentage = "+progressView.getScrollPercentage());
    }
}

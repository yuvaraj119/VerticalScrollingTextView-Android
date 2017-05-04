package com.yuva.verticalscrollingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerticalScrollingTextView tvContent = (VerticalScrollingTextView) findViewById(R.id.tvContent);
        tvContent.setMovementMethod(new ScrollingMovementMethod());
        tvContent.scroll();

    }
}

package ru.surf.nikita_makarov;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView textview;
    RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textview = (TextView) findViewById(R.id.textview);
        relative = (RelativeLayout) findViewById(R.id.relative);

        Bundle extras = getIntent().getExtras();
        int uni = extras.getInt("position");
        int color  = Color.HSVToColor(new float[]{uni,1f,1f});
        textview.setText("R: " + Color.red(color) + " G: " + Color.green(color) + " B: " + Color.blue(color));
        relative.setBackgroundColor(color);
    }
}

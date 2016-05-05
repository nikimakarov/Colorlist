package ru.surf.nikita_makarov;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView textview, secondtextview;
    RelativeLayout relative;

    protected String DetectColor(int num)
    {
        if (num>330) {return "Красный";}
        else if(num>288) {return "Розовый";}
        else if(num>274) {return "Сиреневый";}
        else if(num>260) {return "Фиолетовый";}
        else if(num>210) {return "Синий";}
        else if(num>138) {return "Голубой";}
        else if(num>69) {return "Зеленый";}
        else if(num>36) {return "Желтый";}
        else if(num>13) { return "Оранжевый";}
        else { return "Красный";}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textview = (TextView) findViewById(R.id.textview);
        secondtextview = (TextView) findViewById(R.id.textview2);
        relative = (RelativeLayout) findViewById(R.id.relative);

        Bundle extras = getIntent().getExtras();
        int uni = extras.getInt("position");
        String nameofcolor = DetectColor(uni);
        int color  = Color.HSVToColor(new float[]{uni,1f,1f});
        String message =  "R: " + Color.red(color) + ", G: " + Color.green(color) + ", B: " + Color.blue(color);
        textview.setText(message);
        secondtextview.setText(nameofcolor);
        relative.setBackgroundColor(color);
    }
}
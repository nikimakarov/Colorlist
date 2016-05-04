package ru.surf.nikita_makarov;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView textview,textview2;
    RelativeLayout relative;
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
*/

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

    /*    ActionBar actionBar = getActionBar();
        actionBar.setHomeButtonEnabled(true);
*/
        textview = (TextView) findViewById(R.id.textview);
        textview2 = (TextView) findViewById(R.id.textview2);
        relative = (RelativeLayout) findViewById(R.id.relative);

        Bundle extras = getIntent().getExtras();
        int uni = extras.getInt("position");
        String nameofcolor = DetectColor(uni);
        int color  = Color.HSVToColor(new float[]{uni,1f,1f});
        textview.setText("R: " + Color.red(color) + " G: " + Color.green(color) + " B: " + Color.blue(color));
        textview2.setText(nameofcolor);
        relative.setBackgroundColor(color);
    }
}

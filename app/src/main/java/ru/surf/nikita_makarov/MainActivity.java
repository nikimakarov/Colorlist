package ru.surf.nikita_makarov;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // элементы списка которые будут в него внесены
    ArrayList<String> colors = new ArrayList<String>();
    static String N = "id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связываемся с ListView
        ListView list = (ListView) findViewById(R.id.list);

        //заполняем элементы списка
        for (int i=0;i<360;i++)
            colors.add("");

        // создаем адаптер
        MyAdapter adapter = new MyAdapter(this, colors);

        // устанавливаем адаптер списку
        list.setAdapter(adapter);

        //клик для каждого элемента списка
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}

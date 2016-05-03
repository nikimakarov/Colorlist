package ru.surf.nikita_makarov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // элементы списка которые будут в него внесены
    String[] colors = new String[360];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связываемся с ListView
        ListView list = (ListView) findViewById(R.id.list);

        //заполняем элементы списка
        for (int i=0;i<360;i++)
            colors[i] = "";

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item, colors);

        // устанавливаем адаптер списку
        list.setAdapter(adapter);

        // пробный клик для каждого элемента списка
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), "itemClick: position = " +
                                position + ", id = " + id, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
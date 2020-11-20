package com.example.adapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> names = new ArrayList<>();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names.add("Petya 1"); names.add("Petya 2"); names.add("Petya 3"); names.add("Petya 4");
        // TODO: 1) написать генератор случайных людей (фамилии и имена взять из strings.xml)
        // 1) создаём интерфейс со списком
        // 2) добавляем адаптер
        // 3) отображаем данные и обновляем в случае изменения
        lv = findViewById(R.id.list);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, R.layout.item, names);
        lv.setAdapter(adapter);
        names.add("Kesha");
        adapter.notifyDataSetChanged();
        // TODO: реализовать кнопку сортировки по алфавиту
        Collections.sort(names);

    }
}

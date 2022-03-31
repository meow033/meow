package com.example.splashvlada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();

        TextView infoTextView = findViewById(R.id.textView);
        ImageView infoImageView = findViewById(R.id.imageView3);

        // Операции для выбранного пункта меню
        switch (id) {
            case R.id.action_skachat:
                infoTextView.setText("Вы выбрали скачать!");
                infoImageView.setImageResource(R.drawable.download);
                return true;
            case R.id.action_proclyshat:
                infoTextView.setText("Вы выбрали прослушать!");
                infoImageView.setImageResource(R.drawable.listening);

                return true;
            case R.id.action_ponravilos:
                infoTextView.setText("Вы выбрали понравилось!");
                infoImageView.setImageResource(R.drawable.love);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
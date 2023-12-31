package com.example.c7p1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinearLayout baseLayout;
        Button button1;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setTitle("배경색 바꾸기");
            baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
            button1 = (Button) findViewById(R.id.button1);

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            super.onCreateOptionsMenu(menu);
            menuInflater mInflater = getMenuInflater();
            mInflater.inflate(R.menu.menu1, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;

            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.subRotate:
                button1.setRotation(45):
                return true;

            case R.id.subSize:
                button1.setScaleX(2);:
                return true;

            }
            return false;
        }

    }
}
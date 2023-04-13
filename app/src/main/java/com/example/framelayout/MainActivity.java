package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView tv1;
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (ImageView) findViewById(R.id.tv1);
        boton1 =(Button)  findViewById(R.id.btn1);

    }
    public void ocultar(View view){
        boton1.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.VISIBLE);
    }
}
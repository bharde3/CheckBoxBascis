package com.example.checkboxbascis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox android, java, php, python, unity3d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.androidc);
        android.setOnClickListener(this);
        java = findViewById(R.id.javac);
        java.setOnClickListener(this);
        php=findViewById(R.id.phpc);
        php.setOnClickListener(this);
        python = findViewById(R.id.pythonc);
        python.setOnClickListener(this);
        unity3d = findViewById(R.id.unity3dc);
        unity3d.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.androidc:
                if (android.isChecked())
                    Toast.makeText(this, "android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.javac:
                if (java.isChecked())
                    Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                break;
            case R.id.phpc:
                if (php.isChecked())
                    Toast.makeText(this, "php", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pythonc:
                if (python.isChecked())
                    Toast.makeText(this, "python", Toast.LENGTH_SHORT).show();
                break;
            case R.id.unity3dc:
                if (unity3d.isChecked())
                    Toast.makeText(this, "unity3d", Toast.LENGTH_SHORT).show();
                break;







        }


    }
}

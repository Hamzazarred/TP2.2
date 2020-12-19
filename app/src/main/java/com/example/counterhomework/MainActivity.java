package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView dd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dd = findViewById(R.id.compteur_ID);

        if(savedInstanceState !=null ){
            dd.setText(savedInstanceState.getString("Count_NB"));
            mCount = savedInstanceState.getInt("Nombre");
        }
    }
    public void Incr(View view) {
        mCount++;
        if(dd != null){
            dd.setText(Integer.toString(mCount));
        }

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Count_NB", dd.getText().toString());
        outState.putInt("Nombre", mCount);
    }

}

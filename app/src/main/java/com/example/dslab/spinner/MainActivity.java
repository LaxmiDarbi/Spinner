package com.example.dslab.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity implements
    AdapterView.OnItemSelectedListener{
    private String mSpinnerLabel = "";

    Spinner mlabelSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlabelSpinner = (Spinner) findViewById(R.id.spinner);
        if (mlabelSpinner != null) {
            mlabelSpinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.BLDE, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mlabelSpinner.setAdapter(adapter);

    }
    public void onItemSelected(AdapterView<?> adapterView, View view, int
            i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this,"Laxmi From:"+mSpinnerLabel,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}

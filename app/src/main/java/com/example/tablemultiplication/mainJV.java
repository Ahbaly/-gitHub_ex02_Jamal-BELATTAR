package com.example.tablemultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mainJV extends AppCompatActivity
{
    EditText nbr;
    Button reinitialiser, quitter;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ac);

        setTitle("TPC04.EX02");

        nbr = findViewById(R.id.etNbr);
        reinitialiser = findViewById(R.id.btnRntlsr);
        quitter = findViewById(R.id.btnQtr);

        reinitialiser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txt = String.format("%s", nbr.getText());

                if (txt.isEmpty())
                {
                    Toast.makeText(mainJV.this, "aslan khawi", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    nbr.setText("");
                }
            }
        });

        quitter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                System.exit(0);
            }
        });
    }
}

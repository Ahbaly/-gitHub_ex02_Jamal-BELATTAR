package com.example.tablemultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mainJV extends AppCompatActivity
{
    EditText nbr;
    Button reinitialiser, quitter;
    String txt, error;
    TextView multiplication;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_ac);

        setTitle("TABLE DE MULTIPLICATION");

        nbr = findViewById(R.id.etNbr);
        reinitialiser = findViewById(R.id.btnRntlsr);
        quitter = findViewById(R.id.btnQtr);
        multiplication = findViewById(R.id.tvMltplct);

        reinitialiser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txt = String.format("%s", nbr.getText());

                if (txt.isEmpty())
                {
                    error = "aslan edit text khawi";

                    txt = String.format("%s", multiplication.getText());
                    if (txt.charAt(0) == '?')
                    {
                        error += " and TABLE DE MULTIPLICATION madarch";
                    }
                    else
                    {
                        multiplication.setText(R.string.multpleTv);
                    }

                    Toast.makeText(mainJV.this, error, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    nbr.setText("");

                    if (txt.charAt(0) != '?')
                    {
                        multiplication.setText(R.string.multpleTv);
                    }
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

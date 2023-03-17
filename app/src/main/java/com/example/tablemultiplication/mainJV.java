package com.example.tablemultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class mainJV extends AppCompatActivity
{
    EditText nbr;
    Button reinitialiser, quitter, afficher , white, pink, purple;
    String txt, error;
    TextView multiplication;
    int nombre;
    View main_ac;

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
        afficher = findViewById(R.id.btnAfchr);
        multiplication = findViewById(R.id.tvMltplct);

        white = findViewById(R.id.white);
        pink = findViewById(R.id.pink);
        purple = findViewById(R.id.purple);

        main_ac = findViewById(R.id.main_ac);

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
                        Toast.makeText(mainJV.this, error, Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        multiplication.setText(R.string.multpleTv);
                    }
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

        white.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_ac.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });

        pink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_ac.setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });

        purple.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                main_ac.setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
        });

        afficher.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v)
            {
                try
                {
                    nombre = Integer.parseInt(String.format("%s", nbr.getText()));

                    txt = String.format("%d * 0 = 0\n%d * 1 = %d\n%d * 2 = %d\n%d * 3 = %d\n%d * 4 = %d\n%d * 5 = %d\n%d * 6 = %d\n%d * 7 = %d\n%d * 8 = %d\n%d * 9 = %d\n%d * 10 = %d",
                            nombre,
                            nombre, nombre,
                            nombre, nombre * 2,
                            nombre, nombre * 3,
                            nombre, nombre * 4,
                            nombre, nombre * 5,
                            nombre, nombre * 6,
                            nombre, nombre * 7,
                            nombre, nombre * 8,
                            nombre, nombre * 9,
                            nombre, nombre * 10
                    );

                    multiplication.setText(txt);
                }
                catch (Exception e)
                {
                    Toast.makeText(mainJV.this, "rah maktbti walo", Toast.LENGTH_SHORT).show();

                    txt = String.format("%s", multiplication.getText());
                    if (txt.charAt(0) != '?')
                    {
                        multiplication.setText(R.string.multpleTv);
                    }
                }
            }
        });
    }
}

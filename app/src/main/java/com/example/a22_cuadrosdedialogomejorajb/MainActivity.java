package com.example.a22_cuadrosdedialogomejorajb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dentro del on click va el código que queremos ejecutar cuando pulsemos el botón 'Invocar alerta'

                MyFirstDialog dialog = new MyFirstDialog();

                dialog.show(getFragmentManager(), "1234");

                //De momento aquí mostraremos un diálogo en pantalla
                //que tiene por identificador '1234' y más adelante
                //veremos para qué sirve o cómo interactuar con él...

            }
        });

    }
    public void accionAceptar() {

        Toast.makeText(this, "Has pulsado ACEPTAR", Toast.LENGTH_LONG).show();
    }
    public void accionCancelar() {

        Toast.makeText(this, "Has pulsado CANCELAR", Toast.LENGTH_LONG).show();
    }
}

package com.example.a22_cuadrosdedialogomejorajb;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by JuanGabriel
 */

public class MyFirstDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //El dialogo tendrá por título "Elige una opción de las siguientes
        builder.setMessage("Elige una opción de las siguientes:")
                //Y también tendrá un botón OK, que no hace nada de momento
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Aquí iría el código de cuando pulsamos el botón OK
                        //De momento no hace nada, ya que no hay ni una línea de código programada
                        ((MainActivity)getActivity()).accionAceptar();
                    }
                })
                //Y tendrá un segundo botón Cancelar que de momento tampoco hace nada
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Aquí iría el código del botón cuando le demos a Cancelar
                        //De momento tampoco hace nada!

                        ((MainActivity)getActivity()).accionCancelar();
                    }
                });

        //Devolvemos el objecto fabricado
        return builder.create();
    }
}

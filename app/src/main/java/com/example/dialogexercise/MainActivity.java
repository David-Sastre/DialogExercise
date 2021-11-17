package com.example.dialogexercise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verDialogo(view);
            }
        });
    }
    public void verDialogo(View v){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        dialogo.create();
        dialogo.setTitle("PRUEBA DIALOGO");
        dialogo.setMessage("Esta es la primera prueba." + "\n" + "¡Enhorabuena, ha sido un Éxito!" +
                "\n" + "¿Quieres Salir?");
        dialogo.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        dialogo.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView resp = findViewById(R.id.texto);
                resp.setText("Has seleccionado No. Vuelve a presionar el botón.");
            }
        });

        dialogo.show();

    }
}

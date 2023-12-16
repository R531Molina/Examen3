package com.movil.miexamen;
import com.movil.miexamen.Entrevista;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button btnListar, btnTomarFoto, btnAudio, btnGuardar;
    private EditText txtFecha, txtDescripcion, txtPeriodista;
    private TextView textView, textView2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        btnListar = findViewById(R.id.btnListar);
        btnTomarFoto = findViewById(R.id.btnTomarFoto);
        btnAudio = findViewById(R.id.btnAudio);
        btnGuardar = findViewById(R.id.btnGuardar);
        txtFecha = findViewById(R.id.txtFecha);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtPeriodista = findViewById(R.id.txtPeriodista);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);

        // Configurar listeners si es necesario

    }
}

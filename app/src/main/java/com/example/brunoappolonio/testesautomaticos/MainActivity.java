package com.example.brunoappolonio.testesautomaticos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblMudado;
    Button btnOk;
    EditText edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMudado = (TextView) findViewById(R.id.lblMudado);
        btnOk = (Button) findViewById(R.id.btnOk);
        edtTexto = (EditText) findViewById(R.id.edtTexto);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblMudado.setText(edtTexto.getText());
            }
        });
    }
}

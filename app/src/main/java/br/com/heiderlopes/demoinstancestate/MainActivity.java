package br.com.heiderlopes.demoinstancestate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "DemoCiclodeVida";
    private final String EXTRA_TEXTO = "texto";
    private EditText etNome;
    private Button btAtualizar;
    private TextView tvNomeDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Método OnCreate()");
        setContentView(R.layout.activity_main);

        etNome = (EditText) findViewById(R.id.etNome);
        btAtualizar = (Button) findViewById(R.id.btAtualizar);
        tvNomeDigitado = (TextView) findViewById(R.id.tvNomeDigitado);
        btAtualizar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                tvNomeDigitado.setText(etNome.getText().toString());
            }
        });

        /*Podemos recuperar as informações dessa maneira
        em vez de utilizar onRestoreInstanceState

        if(savedInstanceState!= null)
        {
            tvNomeDigitado.setText(savedInstanceState.getString(EXTRA_TEXTO));
        }
        */
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Método OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Método OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Método OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Método OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Método OnDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Método onSaveInstanceState()");
        outState.putString(EXTRA_TEXTO, (String) tvNomeDigitado.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");
        tvNomeDigitado.setText(savedInstanceState.getString(EXTRA_TEXTO));
    }
}
package sv.edu.udb.resultados1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cont = 0;
    private TextView txtNumero;
    private Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = (TextView) findViewById(R.id.txtNumero);
        btnSumar = findViewById(R.id.btnSumar);

        if(savedInstanceState != null)
        {
            cont = savedInstanceState.getInt("Contador");
            txtNumero.setText((String.valueOf(cont)));
        }
    }

    public void Aumentar(View view)
    {
        if(cont <= 8)
        {
            cont++;
        }
        else
        {
            cont = 0;
        }

        String resultado = String.valueOf(cont);
        txtNumero.setText(resultado);
    }


}
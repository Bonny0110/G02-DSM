package sv.edu.udb.resultados2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtHoras;
    private Button btnCalcular;
    double horaPrecio = 8.50;
    double descuentoIss = 0.02;
    double descuentoAfp = 0.03;
    double impuestoRenta = 0.04;
    double totalSalario, salarioNeto, deducc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtHoras = (EditText) findViewById(R.id.txtHoras);
    }


    public void mainActivity2(View v) {
        String nombre = txtNombre.getText().toString();
        String valorHoras = txtHoras.getText().toString();

        int hora = Integer.parseInt(valorHoras);

        totalSalario = horaPrecio * hora;
        deducc = (totalSalario * descuentoIss) + (totalSalario * descuentoAfp) + (totalSalario * impuestoRenta);
        salarioNeto = totalSalario - deducc;
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("txtNombre", txtNombre.getText().toString());
        i.putExtra("salarioTotal", String.valueOf(totalSalario));
        i.putExtra("salarioNeto", String.valueOf(salarioNeto));
        i.putExtra("txtHoras", txtHoras.getText().toString());

        startActivity(i);
    }
}
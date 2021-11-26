package cat.dam.andy.activitatsmultiples;

import androidx.appcompat.app.AppCompatActivity;
//importem classes necessàries
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Accés als views del model vista
        final TextView et_nom = findViewById(R.id.activity_main_et_nom);
        final Button btn_ok = findViewById(R.id.activity_main_btn_ok);
        //Control del botó que envia nom entrat a la second activity
        btn_ok.setOnClickListener((View v) -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            //afegim a l'intent un bundle amb la informació
            Bundle bundle = new Bundle();
            // Afegim nom entrat al bundle per enviar a l'altra activity
            bundle.putString("nom", et_nom.getText().toString());
            intent.putExtras(bundle);
            // Iniciem la segona activity amb l'intent
            startActivity(intent);
        });
    }
}
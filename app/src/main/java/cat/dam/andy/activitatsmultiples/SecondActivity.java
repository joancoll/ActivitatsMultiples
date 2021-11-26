package cat.dam.andy.activitatsmultiples;
import androidx.appcompat.app.AppCompatActivity;
//importem classes necessàries
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Accés als views del model vista
        final TextView tv_salutacio= findViewById(R.id.activity_second_tv_helloMessage);
        final Button btn_back= findViewById(R.id.activity_second_btn_back);
        //Recuperem la informació passada amb el bundle
        Bundle bundle = this.getIntent().getExtras();
        //Construïm el missatge a mostrar
        String bundle_nom= bundle.getString("nom");
        //Mostrem el missatge
        tv_salutacio.setText(getString(R.string.activity_second_tv_welcome,bundle_nom));
        //Control del botó de retorn a la main activity
        btn_back.setOnClickListener((View v) -> {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                // Iniciem la main activity amb l'intent (sense cap bundle)
                startActivity(intent);
        });
    }
}
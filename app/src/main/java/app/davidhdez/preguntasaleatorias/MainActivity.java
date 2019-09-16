package app.davidhdez.preguntasaleatorias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Q3 = findViewById(R.id.editText2);
        final Button Btn_Registrar = findViewById(R.id.btn);

Btn_Registrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String Preg3 = Q3.getText().toString();

    }
});

    }

}

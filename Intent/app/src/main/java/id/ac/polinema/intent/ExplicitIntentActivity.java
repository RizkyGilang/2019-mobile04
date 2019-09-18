package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        et1 = findViewById(R.id.input_name);
        tv1 = findViewById(R.id.text_output);
    }

    public void handleSubmits(View view) {
        String name = et1.getText().toString();
        tv1.setText("Hello " + name);
    }
}

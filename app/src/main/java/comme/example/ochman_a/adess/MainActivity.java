package comme.example.ochman_a.adess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSuivi = (Button) findViewById(R.id.button);
        btnSuivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, suivi.class));
            }
        });

        Button btnProg = (Button) findViewById(R.id.button2);
        btnProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, programme.class));
            }
        });

        Button btnSeance = (Button) findViewById(R.id.button3);
        btnSeance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                startActivity(new Intent(MainActivity.this, Seance.class));
            }
        });
    }
}

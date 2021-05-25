package sg.edu.rp.c346.id20026955.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnShow1;
    TextView btnShow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow1 = findViewById(R.id.C346);
        btnShow2 = findViewById(R.id.C235);

        Intent intent = new Intent(MainActivity.this,secondActivity.class);

    btnShow1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intent.putExtra("value" ,"C346");
            startActivity(intent);
        }
    });

    btnShow2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intent.putExtra("value" ,"C235");
            startActivity(intent);
        }
    });
    }
}
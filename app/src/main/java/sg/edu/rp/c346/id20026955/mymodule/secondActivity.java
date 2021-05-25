package sg.edu.rp.c346.id20026955.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDisplay = findViewById(R.id.tvDisplay);
        back = findViewById(R.id.back);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("value");

        String message346 = "Module Code: C346" +
                "\nModule Name: Android Programming" +
                "\nAcademic Year: 2020" +
                "\nSemester: 1" +
                "\nModule Credit: 4" +
                "\nVenue: W63F";

        String message235 = "Module Code: C235" +
                "\nModule Name: IT Security and Management" +
                "\nAcademic Year: 2020" +
                "\nSemester: 1" +
                "\nModule Credit: 4" +
                "\nVenue: W63A";

        if (moduleSelected.equals("C346")){
            tvDisplay.setText(message346);
        }else if(moduleSelected.equals("C235")){
            tvDisplay.setText(message235);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }


}
package hcmute.doanthithanhvan.mssv19110313.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbChocolate, cbSprinkles, cbCrushed, cbCherries, cbOrio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbChocolate = (CheckBox) findViewById(R.id.cbChocolate);
        cbSprinkles = (CheckBox) findViewById(R.id.cbSprinkles);
        cbCrushed = (CheckBox) findViewById(R.id.cbCrushed);
        cbCherries = (CheckBox) findViewById(R.id.cbCherries);
        cbOrio = (CheckBox) findViewById(R.id.cbOrio);
        Button btnShowToast = (Button) findViewById(R.id.btnShow);
        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Toppings:";
                if (cbChocolate.isChecked()) {
                    result += " Chocolate syrup";
                }
                if (cbSprinkles.isChecked()) {
                    result += " Sprinkles";
                }
                if (cbCrushed.isChecked()) {
                    result += " Crushed nuts";
                }
                if (cbCherries.isChecked()) {
                    result += " Cherries";
                }
                if (cbOrio.isChecked()) {
                    result += " Orio cookie crumbles";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
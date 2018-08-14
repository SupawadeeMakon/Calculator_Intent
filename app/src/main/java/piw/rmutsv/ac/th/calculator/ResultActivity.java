package piw.rmutsv.ac.th.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    //Button button;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //รับค่า จาก input
        
        Intent intent = getIntent();
        String Tem = intent.getExtras().getString("Temperature");
        String unit = intent.getExtras().getString("Unit");
        String Answer = intent.getExtras().getString("Answer");

        TextView textTem = (TextView) findViewById(R.id.txtStrtemperature);
        textTem.setText(Tem);
        textTem.setTextSize(20);

        TextView textUnit = (TextView) findViewById(R.id.txtStrTem);
        textUnit.setText(unit);
        textUnit.setTextSize(20);

        TextView textAnswer = (TextView) findViewById(R.id.txtResult);
        textAnswer.setText(Answer);
        textAnswer.setTextSize(20);


        imageButton = (ImageButton) findViewById(R.id.btnHome);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });




    }
}

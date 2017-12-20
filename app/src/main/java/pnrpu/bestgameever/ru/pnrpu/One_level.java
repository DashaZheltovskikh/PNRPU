package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class One_level extends AppCompatActivity {

    OneTable oneTable = new OneTable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final ImageView room3 = (ImageView)findViewById(R.id.room3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final Button button_sleep_1level = (Button)findViewById(R.id.one_button_sleep);
        button_sleep_1level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_sleep_1level.setBackgroundResource(R.drawable.button_sleep_1level_press);
                try {
                    Intent intent = new Intent(One_level.this, ModeSelection.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button button_univer_1level = (Button)findViewById(R.id.one_button_univer);
        button_univer_1level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_univer_1level.setBackgroundResource(R.drawable.button_univer_1level_press);
                try {
                    Intent intent = new Intent(One_level.this, Two_level.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button button_dota_1level = (Button)findViewById(R.id.one_button_dota);
        button_dota_1level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_dota_1level.setBackgroundResource(R.drawable.button_dota_1level_press);
                try {
                    Intent intent = new Intent(One_level.this, ModeSelection.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        textView1.setText(oneTable.onescenario[0]);
        textView2.setText(oneTable.onescenario[1]);
        textView4.setText(oneTable.onescenario[2]);
        textView5.setText(oneTable.onescenario[3]);
        textView6.setText(oneTable.onescenario[4]);
        textView12.setText(oneTable.onescenario[5]);
        textView7.setText(oneTable.onescenario[6]);
        textView8.setText(oneTable.onescenario[7]);
        textView9.setText(oneTable.onescenario[8]);
        textView10.setText(oneTable.onescenario[9]);
        textView11.setText(oneTable.onescenario[10]);

    }
}

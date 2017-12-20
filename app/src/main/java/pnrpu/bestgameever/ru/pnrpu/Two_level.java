package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Two_level extends AppCompatActivity {

    TwoTable twoTable = new TwoTable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final ImageView students6 = (ImageView)findViewById(R.id.students6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final Button button_wait_2level = (Button)findViewById(R.id.two_button_wait);
        button_wait_2level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_wait_2level.setBackgroundResource(R.drawable.button_wait_2level_press);
                try {
                    Intent intent = new Intent(Two_level.this, Three_level.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button button_eat_2level = (Button)findViewById(R.id.two_button_eat);
        button_eat_2level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_eat_2level.setBackgroundResource(R.drawable.button_eat_2level_press);
                try {
                    Intent intent = new Intent(Two_level.this, ModeSelection.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button button_home_2level = (Button)findViewById(R.id.two_button_home);
        button_home_2level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_home_2level.setBackgroundResource(R.drawable.button_home_2level_press);
                try {
                    Intent intent = new Intent(Two_level.this, ModeSelection.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        textView1.setText(twoTable.onescenario2[0]);
        textView2.setText(twoTable.onescenario2[1]);
        textView3.setText(twoTable.onescenario2[2]);
        textView4.setText(twoTable.onescenario2[3]);
        textView5.setText(twoTable.onescenario2[4]);
        textView7.setText(twoTable.onescenario2[5]);
        textView8.setText(twoTable.onescenario2[6]);
        textView9.setText(twoTable.onescenario2[7]);
        textView10.setText(twoTable.onescenario2[8]);
        textView11.setText(twoTable.onescenario2[9]);
        textView12.setText(twoTable.onescenario2[10]);
        textView13.setText(twoTable.onescenario2[11]);
        textView14.setText(twoTable.onescenario2[12]);

    }
}

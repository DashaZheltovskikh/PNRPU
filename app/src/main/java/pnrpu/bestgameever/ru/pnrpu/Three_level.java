package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Three_level extends AppCompatActivity {

    ThreeTable threeTable = new ThreeTable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final ImageView clas12 = (ImageView)findViewById(R.id.clas12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final ImageView frodo15 = (ImageView)findViewById(R.id.frodo15);
        final Button button_try_again = (Button)findViewById(R.id.button_try_again);
        button_try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_try_again.setBackgroundResource(R.drawable.button_try_again_press);
                try {
                    Intent intent = new Intent(Three_level.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button button_exit = (Button)findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                button_exit.setBackgroundResource(R.drawable.button_exit_press);
                try {
                    Intent intent = new Intent(Three_level.this, Reclam.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });

        textView1.setText(threeTable.onescenario3[0]);
        textView2.setText(threeTable.onescenario3[1]);
        textView3.setText(threeTable.onescenario3[2]);
        textView4.setText(threeTable.onescenario3[3]);
        textView5.setText(threeTable.onescenario3[4]);
        textView6.setText(threeTable.onescenario3[5]);
        textView7.setText(threeTable.onescenario3[6]);
        textView8.setText(threeTable.onescenario3[7]);
        textView9.setText(threeTable.onescenario3[8]);
        textView10.setText(threeTable.onescenario3[9]);
        textView11.setText(threeTable.onescenario3[10]);
        textView13.setText(threeTable.onescenario3[11]);
        textView14.setText(threeTable.onescenario3[12]);

    }
}

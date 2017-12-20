package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class FirstLevel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);
       final Button button3 = (Button) findViewById(R.id.answer1);
        /* button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button3.setBackgroundResource(R.drawable.yes_button_press);
                try {
                    Intent intent = new Intent(FirstLevel.this, FirstLevel.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });*/
    }
}

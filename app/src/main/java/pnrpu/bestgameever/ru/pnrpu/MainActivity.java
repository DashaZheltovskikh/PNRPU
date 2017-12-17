package pnrpu.bestgameever.ru.pnrpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startButton = (Button)findViewById(R.id.menuPNRPUbut);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // while (startButton.isPressed() == true) {
                    startButton.setBackgroundResource(R.drawable.button_press);
              //  }
            }
        });
    }
}

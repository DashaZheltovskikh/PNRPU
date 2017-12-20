package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_selection);
        final Button newGameButton = (Button)findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                newGameButton.setBackgroundResource(R.drawable.new_game_button_press);
                try {
<<<<<<< HEAD
                    Intent intent = new Intent(ModeSelection.this, MainTwo.class);
=======
                    Intent intent = new Intent(ModeSelection.this, One_level.class);
>>>>>>> VM
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
        final Button loadGameButton = (Button)findViewById(R.id.loadGameButton);
        loadGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // while (startButton.isPressed() == true) {
                loadGameButton.setBackgroundResource(R.drawable.load_game_button_press);
                try {
                    Intent intent = new Intent(ModeSelection.this, SavedGames.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                //  }
            }
        });
    }
}

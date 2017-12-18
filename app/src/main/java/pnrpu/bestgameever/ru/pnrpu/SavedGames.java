package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SavedGames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_games);
        final Button okButtonSG = (Button)findViewById(R.id.okButtonSG);
        okButtonSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                okButtonSG.setBackgroundResource(R.drawable.ok_play_button);
                try {
                    Intent intent = new Intent(SavedGames.this, FirstLevel.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    }
}

package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import java.time.OffsetDateTime;

public class SavedGames extends AppCompatActivity {
    static String name3;
    static String name4;
    static String name5;
    static String name6;
    static String name7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final int[] b3 = new int[1];
        /*final int[] b4 = new int[1];
        final int[] b5 = new int[1];
        final int[] b6 = new int[1];
        final int[] b7 = new int[1];*/

        final int[] yes = {0};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_games);

        final Button yesButtonSG = (Button)findViewById(R.id.yesButtonSG);
        yesButtonSG.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                yesButtonSG.setBackgroundResource(R.drawable.yes_button_press);
                yes[0] = 1;
                try {
<<<<<<< HEAD
                    if (b3[0] == 1 && yes[0] == 1) {
                        Intent intent = new Intent(SavedGames.this, ModeSelection.class);
                        startActivity(intent);
                        finish();
                    }
=======
                    Intent intent = new Intent(SavedGames.this, One_level.class);
                    startActivity(intent);
                    finish();
>>>>>>> VM
                }
                catch (Exception e) {
                    e.printStackTrace();
                }/**/
            }

        });

        final Button deleteButtonSG = (Button)findViewById(R.id.deleteButtonSG);
        deleteButtonSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteButtonSG.setBackgroundResource(R.drawable.delete_button_press);
                try {
                    Intent intent = new Intent(SavedGames.this, ModeSelection.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });

        final Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button3.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
                button3.setText(name3);
                //button3.setText();
            }

        });
        final Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
                button4.setText(name4);
            }

        });
        final Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
                button5.setText(name5);
            }

        });
        final Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
                button6.setText(name6);
            }

        });
        final Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
                button7.setText(name7);
            }

        });

        //

    }
}

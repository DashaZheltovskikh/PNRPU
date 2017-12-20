package pnrpu.bestgameever.ru.pnrpu;

import android.content.Intent;
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
                    if (b3[0] == 1 && yes[0] == 1) {
                        Intent intent = new Intent(SavedGames.this, ModeSelection.class);
                        startActivity(intent);
                        finish();
                    }
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
                button3.setText("dfb");
            }

        });
        final Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
            }

        });
        final Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
            }

        });
        final Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
            }

        });
        final Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setBackgroundResource(R.drawable.delete_button_press);
                b3[0] = 1;
            }

        });

        //
        // делаем запрос всех данных из таблицы mytable, получаем Cursor
        /*Cursor c = db.query("mytable", null, null, null, null, null, null);

      // ставим позицию курсора на первую строку выборки
      // если в выборке нет строк, вернется false
      if (c.moveToFirst()) {

        // определяем номера столбцов по имени в выборке
        int idColIndex = c.getColumnIndex("id");
        int nameColIndex = c.getColumnIndex("name");
        int emailColIndex = c.getColumnIndex("email");

        do {
          // получаем значения по номерам столбцов и пишем все в лог
          Log.d(LOG_TAG,
              "ID = " + c.getInt(idColIndex) +
              ", name = " + c.getString(nameColIndex) +
              ", email = " + c.getString(emailColIndex));
          // переход на следующую строку
          // а если следующей нет (текущая - последняя), то false - выходим из цикла
        } while (c.moveToNext());
      } else
        Log.d(LOG_TAG, "0 rows");*/
    }
}

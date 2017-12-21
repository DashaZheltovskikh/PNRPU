package pnrpu.bestgameever.ru.pnrpu;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainTwo extends Activity implements OnClickListener{
    final String LOG_TAG = "myLogs";
    Button btnAdd, btnRead, btnClear;
    EditText etName, etEmail;
    DBHelper dbHelper;
    static Cursor c;
    ArrayList<String> dbNames = new ArrayList<String>();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_two);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        etName = (EditText) findViewById(R.id.etName);
        // создаем объект для создания и управления версиями БД
        dbHelper = new DBHelper(this);
    }


    @Override
    public void onClick(View v) {
        // создаем объект для данных
        ContentValues cv = new ContentValues();
        // получаем данные из полей ввода
        String name = etName.getText().toString();
        if (name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4") || name.contains("5") || name.contains("6") ||
                name.contains("7") || name.contains("8") || name.contains("9") || name == null)
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Имя не должно содержать цифры", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            // подключаемся к БД
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            switch (v.getId()) {
                case R.id.btnAdd:
                    dbNames.add(name);
                    addName(dbNames);
                    Log.d(LOG_TAG, "--- Insert in mytable: ---");

                    // подготовим данные для вставки в виде пар: наименование столбца - значение

                    cv.put("name", name);
                    // вставляем запись и получаем ее ID
                    long rowID = db.insert("mytable", null, cv);
                    Log.d(LOG_TAG, "row inserted, ID = " + rowID);
                    break;
            }
            // закрываем подключение к БД
            dbHelper.close();
            Intent intent = new Intent(MainTwo.this, One_level.class);
            startActivity(intent);
            //
            //c.getCount();
            finish();

            // делаем запрос всех данных из таблицы mytable, получаем Cursor
            //Cursor c = db.query("mytable", null, null, null, null, null, null);

            // ставим позицию курсора на первую строку выборки
            // если в выборке нет строк, вернется false
     /* if (c.moveToFirst()) {

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

    public void addName(ArrayList<String> name) {
        if (SavedGames.name3 != "test3") {
            String strName = name.toString();
            SavedGames.name3 = strName;
        }
        if (SavedGames.name4 != "test3") {
            String strName = name.toString();
            SavedGames.name4 = strName;
        }
        if (SavedGames.name5 != "test3") {
            String strName = name.toString();
            SavedGames.name5 = strName;
        }
        if (SavedGames.name6 != "test3") {
            String strName = name.toString();
            SavedGames.name6 = strName;
        }
        if (SavedGames.name7 != "test3") {
            String strName = name.toString();
            SavedGames.name7 = strName;
        }
    }


    class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context) {
            // конструктор суперкласса
            super(context, "myDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.d(LOG_TAG, "--- onCreate database ---");
            // создаем таблицу с полями
            db.execSQL("create table mytable ("
                    + "id integer primary key autoincrement,"
                    + "name text,"
                    + "email text" + ");");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

}

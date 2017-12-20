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

public class MainTwo extends Activity implements OnClickListener{
    final String LOG_TAG = "myLogs";

    Button btnAdd, btnRead, btnClear;
    EditText etName, etEmail;

    DBHelper dbHelper;

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
            Intent intent = new Intent(MainTwo.this, ModeSelection.class);
            startActivity(intent);
            finish();
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

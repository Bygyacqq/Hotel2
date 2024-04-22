package moviles.hotel.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import moviles.hotel.data.ReservaContrat.ReservaEntry;
public class RDBhelper extends SQLiteOpenHelper

{
    private static final String DATABASE_NAME = "hotel";
    private static final int DATABASE_VERSION = 1;

    public RDBhelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase2)
    {
        sqLiteDatabase2.execSQL(" CREATE TABLE "+ ReservaEntry.TABLE_NAME +"( " +
                ReservaEntry._ID +"INTEGER, " +
                ReservaEntry.col_id_R + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ReservaEntry.col_id_U + " INTEGER NOT NULL, " +
                ReservaEntry.col_fecha + " TEXT NOT NULL, " +
                ReservaEntry.col_Hora + " TEXT NOT NULL, " +
                ReservaEntry.col_Servicio + " TEXT NOT NULL, " +
                ReservaEntry.col_Cantidad + "INTEGER NOT NULL, " +
                ")");
    }
    @Override
    public void onOpen(SQLiteDatabase sqLiteDatabase2)
    {
        super.onOpen(sqLiteDatabase2);
        sqLiteDatabase2.setForeignKeyConstraintsEnabled(true);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

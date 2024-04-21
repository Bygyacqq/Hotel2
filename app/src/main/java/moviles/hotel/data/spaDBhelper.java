package moviles.hotel.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import moviles.hotel.data.spaContract.SpaEntry;
public class spaDBhelper extends SQLiteOpenHelper {
    public static final String Database_name = "Hotel";
    public static final int Database_version = 1;
    public spaDBhelper(@Nullable Context context){
        super(context, Database_name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(" CREATE TABLE " + SpaEntry.table_name + "(" +
                SpaEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
        

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    publi
}

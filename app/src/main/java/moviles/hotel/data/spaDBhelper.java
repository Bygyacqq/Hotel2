package moviles.hotel.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class spaDBhelper extends SQLiteOpenHelper {
    public static final String Database_name = "Hotel";
    public static final int Database_version = 1;
    public spaDBhelper(@Nullable Context context){
        super(context, Database_name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    publi
}

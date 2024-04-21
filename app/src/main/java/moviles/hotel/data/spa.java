package moviles.hotel.data;

import android.content.ContentValues;
import android.database.Cursor;

public class spa {
    private String tipo_z;
    private int cod_h;
    private String nombre;
    private double precio_extra;

    public spa(String tipo_z, int cod_h, String nombre, double precio_extra) {
        this.tipo_z = tipo_z;
        this.cod_h = cod_h;
        this.nombre = nombre;
        this.precio_extra = precio_extra;
    }

    public ContentValues toContentValues() {
        ContentValues valuess = new ContentValues();
        valuess.put(spaContract.SpaEntry.table_name, tipo_z);
        valuess.put(spaContract.SpaEntry.col_nombre, nombre);
        return valuess;
    }
    public Spa (Cursor cursor){
        this.tipo_z = cursor.getString( cursor.getColumnIndex( spaContract.SpaEntry.table_name) );
        this.nombre = cursor.getString( cursor.getColumnIndex( spaContract.SpaEntry.col_nombre ) );
    }

    public String getTipo_z() {
        return tipo_z;
    }

    public int getCod_h() {
        return cod_h;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio_extra() {
        return precio_extra;
    }
}

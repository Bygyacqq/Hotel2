package moviles.hotel.data;

import android.content.ContentValues;
import android.database.Cursor;

public class Reserva
{
    private int id_Reserva;
    private int id_usuario;
    private String fecha_R;
    private String hora_R;
    private String servicio;
    private int cantidad;

    public Reserva(int id_Reserva, int id_usuario, String fecha_R, String hora_R,
                   String servicio, int cantidad) {
        this.id_Reserva = id_Reserva;
        this.id_usuario = id_usuario;
        this.fecha_R = fecha_R;
        this.hora_R = hora_R;
        this.servicio = servicio;
        this.cantidad = cantidad;
    }
    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(ReservaContrat.ReservaEntry.col_id_R, id_Reserva);
        values.put(ReservaContrat.ReservaEntry.col_id_U, id_usuario);
        values.put(ReservaContrat.ReservaEntry.col_fecha, fecha_R);
        values.put(ReservaContrat.ReservaEntry.col_Hora, hora_R);
        values.put(ReservaContrat.ReservaEntry.col_Servicio, servicio);
        values.put(String.valueOf(ReservaContrat.ReservaEntry.col_Cantidad), cantidad);
        return values;
    }
    public Reserva(Cursor cursor){
        this.id_Reserva = Integer.parseInt(cursor.getString(cursor.getColumnIndex(ReservaContrat.ReservaEntry.col_id_R)));
        this.id_usuario = Integer.parseInt(cursor.getString(cursor.getColumnIndex(ReservaContrat.ReservaEntry.col_id_U)));
        this.fecha_R = cursor.getString( cursor.getColumnIndex(ReservaContrat.ReservaEntry.col_fecha));
        this.hora_R = cursor.getString( cursor.getColumnIndex(ReservaContrat.ReservaEntry.col_Hora ));
        this.servicio = cursor.getString(cursor.getColumnIndex( ReservaContrat.ReservaEntry.col_Servicio ));
        this.cantidad = Integer.parseInt(cursor.getString(cursor.getColumnIndex(ReservaContrat.ReservaEntry.col_Cantidad)));
    }
    public int getId_Reserva() {
        return id_Reserva;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getFecha_R() {
        return fecha_R;
    }

    public String getHora_R() {
        return hora_R;
    }

    public String getServicio() {
        return servicio;
    }

    public int getCantidad() {
        return cantidad;
    }
}

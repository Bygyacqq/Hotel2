package moviles.hotel.data;

import android.provider.BaseColumns;

public class ReservaContrat
{
    public static abstract class ReservaEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "Reserva";
        public static final String col_id_R = "Reserva";
        public static final String col_id_U = "Usuario";
        public static final String col_fecha = "Fecha";
        public static final String col_Hora = "Hora";
        public static final String col_Servicio = "Tipo de Servicio";
        public static final String col_Cantidad = "Cantidad de personas";

    }
}

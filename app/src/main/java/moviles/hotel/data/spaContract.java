package moviles.hotel.data;
import android.provider.BaseColumns;
public class spaContract
{
    public static abstract class SpaEntry implements BaseColumns
    {
        public static final String table_name = "tipo_zona";
        public static final String col_nombre = "name";
    }
}

package moviles.hotel.data;

import android.provider.BaseColumns;

public class spacontract
{
    public static abstract class spaEntry implements BaseColumns {
        public static final String TABLE_NAME = "spa";

        public static final String COLUMN_GUEST_ID = "huesped_id";

        public static final String COLUMN_SPA_ZONE = "zona";

        public static final String COLUMN_DATE = "fecha";

        public static final String COLUMN_TIME = "tiempo";
    }
}

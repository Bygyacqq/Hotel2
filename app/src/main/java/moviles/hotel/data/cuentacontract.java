package moviles.hotel.data;

import android.provider.BaseColumns;

public class cuentacontract {
    public static abstract class cuentaEntry implements BaseColumns {
        public static final String TABLE_NAME = "Cuenta";

        public static final String COLUMN_GUEST_ID = "id_huesped";

        public static final String COLUMN_AMOUNT = "cantidad";

        public static final String COLUMN_DATE = "fecha";
    }
}

package moviles.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import moviles.hotel.data.HotelDBHelper;

public class MainActivity extends AppCompatActivity {
    private HotelDBHelper dbHelper;
    private Button btnReserveSpa, btnCalculateBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnReserveSpa = findViewById(R.id.btnSpa);
        btnCalculateBill = findViewById(R.id.btnCuenta);
    }
        btnReserveSpa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Reserve spa
            Reservation reservation = new Reservation(1, "2023-03-01", "Spa", 1);
            dbHelper.insertReservation(reservation);
            Toast.makeText(MainActivity.this, "Spa reservation successful!", Toast.LENGTH_SHORT).show();
        }
    });
    btnCalculateBill.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Calculate bill
            Bill bill = new Bill(1, "2023-03-01", 100.0, 1);
            dbHelper.insertBill(bill);
            Toast.makeText(MainActivity.this, "Bill calculated successfully!", Toast.LENGTH_SHORT).show();
        }
    });
}
package moviles.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import moviles.hotel.data.HotelDBHelper;

public class MainActivity extends AppCompatActivity {
    private HotelDBHelper dbHelper;
    private Button btnReserveSpa, btnCalculateBill;

    private EditText etUsername, etPassword;

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
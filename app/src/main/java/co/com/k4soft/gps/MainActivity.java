package co.com.k4soft.gps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import co.com.k4soft.gps.geographic.GPS;

public class MainActivity extends AppCompatActivity {

    private TextView txtLatitud;
    private TextView txtLongitud;
    private GPS gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLatitud = findViewById(R.id.txtLatitud);
        txtLongitud = findViewById(R.id.txtLongitud);
        gps = new GPS(this);
    }

    public TextView getTxtLatitud() {
        return txtLatitud;
    }

    public TextView getTxtLongitud() {
        return txtLongitud;
    }
}

package net.androidbootcamp.movingtruckrentalapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int intTruck;
    int intDays;
    float decMiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText truck = (EditText)findViewById(R.id.txtTruck);
        final EditText days = (EditText)findViewById(R.id.txtDays);
        final EditText miles = (EditText)findViewById(R.id.txtMiles);
        Button button = (Button)findViewById(R.id.btnPayment);
        final SharedPreferences shardPref = PreferenceManager.getDefaultSharedPreferences(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intTruck = Integer.parseInt(truck.getText().toString());
                intDays = Integer.parseInt(days.getText().toString());
                decMiles = Float.parseFloat(miles.getText().toString());
                SharedPreferences.Editor editor = shardPref.edit();
                editor.putInt("key1", intTruck);
                editor.putInt("key2", intDays);
                editor.putFloat("key3", decMiles);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Payment.class));
            }
        });
    }
}

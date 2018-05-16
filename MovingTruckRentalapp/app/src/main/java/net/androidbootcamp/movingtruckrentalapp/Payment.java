package net.androidbootcamp.movingtruckrentalapp;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView rentalPayment = (TextView) findViewById(R.id.txtRentalPayment);
        ImageView image = (ImageView) findViewById(R.id.imgTruck);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        int intTruck = sharedPref.getInt("key1", 0);
        int intDays = sharedPref.getInt("key2", 0);
        float decMiles = sharedPref.getFloat("key3", 0);
        double decRentalPayment = 0;
        DecimalFormat currency = new DecimalFormat("$###,###.##");

        if (intTruck == 10) {
            image.setImageResource(R.drawable.one);
            decRentalPayment = (19.95 * intDays) + (decMiles * 0.99);

        }
        else if (intTruck == 17) {
            image.setImageResource(R.drawable.two);
            decRentalPayment = (29.95 * intDays) + (decMiles * 0.99);
        }
        else if (intTruck == 26) {
            decRentalPayment = (39.95 * intDays) + (decMiles * 0.99);
            image.setImageResource(R.drawable.three);
        }
        else {
            rentalPayment.setText("Please enter 10, 17 , or 26.");
        }
        rentalPayment.setText("Rental Payment  " + currency.format(decRentalPayment));
    }
}
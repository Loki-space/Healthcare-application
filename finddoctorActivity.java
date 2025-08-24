package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class finddoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddoctor);

        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(finddoctorActivity.this,homeActivity.class));

            }
        });
        CardView familyphysician = findViewById(R.id.cardFDFamilyPhysician);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(finddoctorActivity.this, doctorddetailsActivity.class);
                it.putExtra("title", "Family Physicians");
                startActivity(it);

            }
        });

        CardView dieticien = findViewById(R.id.cardFDDieticien);
        dieticien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(finddoctorActivity.this, doctorddetailsActivity.class);
                it.putExtra("title", "Dietician");
                startActivity(it);

            }
        });
        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(finddoctorActivity.this, doctorddetailsActivity.class);
                it.putExtra("title", "Dentist");
                startActivity(it);

            }
        });

        CardView surgeon = findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(finddoctorActivity.this, doctorddetailsActivity.class);
                it.putExtra("title", "Cardiologists");
                startActivity(it);

            }
        });

        CardView cardiologists = findViewById(R.id.cardFDCardiologists);
        cardiologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(finddoctorActivity.this, doctorddetailsActivity.class);
                it.putExtra("title", "Cardiologists");
                startActivity(it);

            }
        });

    }
}

package com.example.lat1_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 4, 2019
 * - All the Layout and Function
 * - Except Validation for name in Tampil.java
 * Detailed CHANGELOG
 * CHANGELOG April 4, 2019 08.00
 * - Membuat Halaman 1 ( Main Activity )
 * CHANGELOG April 4, 2019 13.00
 * - Membuat function pindah halaman
 * - Membuat Halaman 2 ( Verifikasi )
 * CHANGELOG April 4, 2019 15:00
 * - Membuat Halaman 3 ( Tampil )
 * CHANGELOG April 4, 2019 17:00
 * - Membuat Halaman 4 ( Tampil )
 * - Membuat Function Send Extra lewat Intent
 */

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        
        ConfigureFirstButton();
        
    }
    
    private void ConfigureFirstButton()
    {
        Button btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, Verifikasi.class ));
            }
        });
    }
    
}

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
 * - New Layout and Function
 * test
 */

public class Verifikasi extends AppCompatActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_verifikasi);
  
    ConfigureSecondButton();
  
  }
  
  private void ConfigureSecondButton()
  {
    Button btn1 = (Button) findViewById(R.id.button);
    btn1.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        startActivity(new Intent(Verifikasi.this, Biodata.class ));
      }
    });
  }
}

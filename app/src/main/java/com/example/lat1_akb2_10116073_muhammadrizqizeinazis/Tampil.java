package com.example.lat1_akb2_10116073_muhammadrizqizeinazis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 4, 2019
 * - All the Layout and Function
 * -Except Validation for name in Tampil.java
 */

public class Tampil extends AppCompatActivity
{
  
  TextView tamppilnama;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tampil);
    String nama = getIntent().getStringExtra("StringNama");
    if(nama.isEmpty())
    {
      nama = "Blank";
    }
    tamppilnama = (TextView) findViewById(R.id.textView13);
    tamppilnama.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    
    
  }
}

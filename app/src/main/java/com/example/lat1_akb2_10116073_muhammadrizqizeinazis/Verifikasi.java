package com.example.lat1_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.Html;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 4, 2019
 * - All the Layout and Function
 * -Except Validation for name in Tampil.java
 */

public class Verifikasi extends AppCompatActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_verifikasi);
    
    TextView textView = (TextView) findViewById(R.id.textView5);
    String editedtext = "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami";
    textView.setText(Html.fromHtml(editedtext));
  
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

package com.example.lat1_akb2_10116073_muhammadrizqizeinazis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *Created By
 *NIM   : 10116073
 *Nama  : Muhammad Rizqi Zein Azis
 *Kelas : IF-2 / AKB-2
 *CHANGELOG April 4, 2019
 * - All the Layout and Function
 * -Except Validation for name in Tampil.java
 */

public class Biodata extends AppCompatActivity
{
  
  public EditText edit;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_biodata);
    edit = (EditText) findViewById(R.id.editText2);
    String nama = edit.getText().toString();
    if(!(nama.isEmpty()) )
    {
      edit.setError("Masukkan Nama");
    }
    else
    {
      ConfigureThirdButton();
    }
  }
  
  private void ConfigureThirdButton()
  {
    
    Button btn1 = (Button) findViewById(R.id.button4);
    btn1.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        edit.setError(null);
        String nama = edit.getText().toString();
        Intent start = new Intent(Biodata.this, Tampil.class);
        start.putExtra("StringNama",nama);
        startActivity(start);
      }
    });
    
  }
}

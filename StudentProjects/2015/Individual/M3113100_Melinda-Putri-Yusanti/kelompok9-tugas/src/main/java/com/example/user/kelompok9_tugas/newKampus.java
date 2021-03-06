package com.example.user.kelompok9_tugas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

/**
 * Created by USER on 03/12/2015.
 */
public class newKampus extends Activity {
    EditText kampusName,alamat;
    com.example.user.kelompok9_tugas.dbController controller = new com.example.user.kelompok9_tugas.dbController(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_kampus);
        kampusName = (EditText) findViewById(R.id.txtKampusName);
        alamat = (EditText) findViewById(R.id.txtAlamat);
    }
    /* kode untuk menambah data kampus*/
    public void addNewKampus(View view) {
        HashMap<String, String> queryValues =  new  HashMap<String, String>();
        queryValues.put("kampusName", kampusName.getText().toString());
        queryValues.put("alamat", alamat.getText().toString());
        controller.addKampus(queryValues);
        this.callHomeActivity(view);
    }
    /* panggil MainActivity */
    public void callHomeActivity(View view) {
        Intent objIntent = new Intent(getApplicationContext(), com.example.user.kelompok9_tugas.MainActivity.class);
        startActivity(objIntent);
    }
}

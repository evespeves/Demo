package com.example.evaaherne.foodhive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button buttonAdd;
    Spinner spinnerGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        spinnerGenre = (Spinner) findViewById(R.id.spinnerGenre);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            addArtist();
            }
        });
    }

    private void addArtist(){
        String name = editTextName.getText().toString().trim();
        String genre = spinnerGenre.getSelectedItem().toString();

        if(!TextUtils.isEmpty(name)){


        }else{
            Toast.makeText(this, "You should enter a name", Toast.LENGTH_LONG).show();
        }

    }
}

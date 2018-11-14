package com.example.evaaherne.foodhive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {


    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    CheckBox checkBoxNuts;
    CheckBox checkBoxDairy;
    CheckBox checkBoxGluten;
    Button buttonSubmit;
    String nuts;
    String dairy;
    String gluten;



    DatabaseReference databaseUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        databaseUsers = FirebaseDatabase.getInstance().getReference(getString(R.string.users));

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        checkBoxNuts = findViewById(R.id.checkBoxNuts);
        checkBoxDairy = findViewById(R.id.checkBoxDairy);
        checkBoxGluten = findViewById(R.id.checkBoxGluten);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Checks nuts entry
                if (checkBoxNuts.isChecked()){
                    nuts = "true";
                }
                else {
                    nuts = "false";
                }

                //Checks dairy entry
                if (checkBoxDairy.isChecked()){
                    dairy = "true";
                }
                else{
                    dairy = "false";
                }

                //Checks gluten entry
                if (checkBoxGluten.isChecked()){
                    gluten = "true";
                }
                else{
                    gluten = "false";
                }

                addUser();

            }
        });
    }



    private void addUser(){
        String name = editTextName.getText().toString().trim();
        String username = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String nutsValue = nuts;
        String dairyValue = dairy;
        String glutenValue = gluten;


        if((!TextUtils.isEmpty(name)) && (!TextUtils.isEmpty(username))) {
            String id = databaseUsers.push().getKey();
            Users users = new Users(id, name, username, password, nutsValue, dairyValue, glutenValue);

            databaseUsers.child(id).setValue(users);


        //Toast is a short message that pops up on screen
            Toast.makeText(this, "User added", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "You should enter a name", Toast.LENGTH_LONG).show();
        }
    }

}

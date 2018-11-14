package com.example.evaaherne.foodhive;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class User_detail extends AppCompatActivity {
    ListView listViewUsers;
    DatabaseReference databaseUsers;
    List<Users> userList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        databaseUsers = FirebaseDatabase.getInstance().getReference(getString(R.string.users));
        listViewUsers = findViewById(R.id.listViewUsers);

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseUsers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                userList.clear(); //Clears before opening
                for (DataSnapshot usersSnapshot : dataSnapshot.getChildren()) {
                    Users users = usersSnapshot.getValue(Users.class);
                    userList.add(users);
                }
                UserList adapter = new UserList(User_detail.this,userList);
                listViewUsers.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
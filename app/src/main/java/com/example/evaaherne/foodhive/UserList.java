package com.example.evaaherne.foodhive;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class UserList extends ArrayAdapter<Users> {
    private Activity context;
    private List<Users> userList;

    public UserList(Activity context, List<Users> userList) {
        //Constructors
        super(context, R.layout.list_layout, userList);
        this.context = context;
        this.userList = userList;
    }
//Override method getView

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        @SuppressLint({"ViewHolder", "InflateParams"}) View listViewItem = inflater.inflate(R.layout.list_layout, null, true);
        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewEmail = listViewItem.findViewById(R.id.textViewEmail);


        Users users = userList.get(position);

        textViewName.setText(users.getUserName());
        textViewEmail.setText(users.getUserEmail());

        return listViewItem;

    }

}








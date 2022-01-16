package com.example.sahanaandroidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String PASSWORD = "sahana";
    public static final String LOGIN_ERROR = "Invalid Password";
    public static final String USER_NAME = "Username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button loginButton = (Button) findViewById(R.id.login);
//
//
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                login(view);
//            }
//        });
    }

    /** Called when the user taps the Send button */
//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//        }

    public void login(View view) {
        Button loginButton = (Button) view;
        EditText usernameText = (EditText) findViewById(R.id.username);
        EditText passwordText = (EditText) findViewById(R.id.password);
        TextView errorText = (TextView) findViewById(R.id.error);
        String username = usernameText.getText().toString();
        String password = passwordText.getText().toString();
        errorText.setText("");

       if(password.equals(PASSWORD)) {
           //allow to go to next page
           Intent intent = new Intent(this, TabbedMain.class);
           intent.putExtra(USER_NAME, username);
           startActivity(intent);
       }
       else {
           Toast toast=Toast.makeText(getApplicationContext(),LOGIN_ERROR,Toast.LENGTH_SHORT);
           toast.setMargin(50,50);
           toast.show();

           errorText.setText(LOGIN_ERROR);
       }
    }

}
package com.example.tafsir.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userName =(EditText) findViewById(R.id.userNameId);
        password =(EditText) findViewById(R.id.passwordId);
        button =(Button) findViewById(R.id.buttonId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(), password.getText().toString());
            }
        });
    }



    private void validate(String userName,String password)
    {
        if((userName.equals("1103017")) && (password.equals("puja")))
        {
            Intent intent = new Intent(MainActivity.this,secondActivity.class);
            startActivity(intent);
        }

        else
        {
            Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_SHORT).show();
        }
    }
}

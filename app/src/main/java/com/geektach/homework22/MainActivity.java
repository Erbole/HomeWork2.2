package com.geektach.homework22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn_next, btn_tap;
    private EditText et_gmail, et_password;

    private TextView tv_whod, tv_register,  tv_forgetPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_next = findViewById(R.id.enter);
        btn_tap = findViewById(R.id.tap);

        et_gmail = findViewById(R.id.editTextTextEmailAddress2);
        et_password = findViewById(R.id.editTextTextPassword2);

        tv_whod = findViewById(R.id.whod);
        tv_register = findViewById(R.id.register);
        tv_forgetPass = findViewById(R.id.forgot);

        et_gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_gmail.getText().toString().isEmpty()){
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                }

            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_password.getText().toString().isEmpty()){
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                }

            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_gmail.getText().toString().equals("admin@gmail.com")&& et_password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Добро пожаловать",Toast.LENGTH_SHORT).show();
                    btn_next.setVisibility(view.GONE);
                    btn_tap.setVisibility(view.GONE);
                    et_gmail.setVisibility(view.GONE);
                    et_password.setVisibility(view.GONE);
                    tv_whod.setVisibility(view.GONE);
                    tv_register.setVisibility(view.GONE);
                    tv_forgetPass.setVisibility(view.GONE);
                }else {
                    Toast.makeText(MainActivity.this,"не правильный логин или пароль",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
package com.example.duan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private ImageView img_Login;
    private EditText edt_Login_Username;
    private EditText edt_Login_Password;
    private Button btn_Login;
    private Button btn_Login_SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        img_Login=findViewById(R.id.img_Login);
        edt_Login_Username=findViewById(R.id.edt_login_username);
        edt_Login_Password=findViewById(R.id.edt_login_password);
        btn_Login=findViewById(R.id.btn_Login);
        btn_Login_SignUp=findViewById(R.id.btn_Login_SignUp);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_Login_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });



    }
}
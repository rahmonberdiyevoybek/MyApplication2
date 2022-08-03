package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)


        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val eddPassword = findViewById<EditText>(R.id.edPassword)
        val eddUserName = findViewById<EditText>(R.id.edUsername)




        btnLogin.setOnClickListener{
            if (eddPassword.text.toString() == "ppp" && eddUserName.text.toString() == "ppp"){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
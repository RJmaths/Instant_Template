package com.example.instanttemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class BasicLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_login)

        val data: String = intent?.data.toString()

        findViewById<TextView>(R.id.textView3).text = data

        val submitLogin: Button = findViewById(R.id.loginButton)
        submitLogin.setOnClickListener{
            if (findViewById<EditText>(R.id.loginPin).text.toString() == "1234"){
                val intent = Intent(this, MainApp::class.java)
                startActivity(intent)
            }
            else{
                val snack = Snackbar.make(it,"Incorrect PIN. Try again.", Snackbar.LENGTH_LONG)
                snack.show()
                findViewById<EditText>(R.id.loginPin).setText("")
            }
        }
    }
}